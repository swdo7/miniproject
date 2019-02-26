package global.sesoc.mini.controller;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.mini.dao.CustomerDAO;
import global.sesoc.mini.vo.CustomerVO;


@Controller
public class LogController {
	
	private static final Logger logger = LoggerFactory.getLogger(LogController.class);
	
	@Autowired
	CustomerDAO dao;
	
	//회원 가입
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		logger.debug("회원가입");
		
		return "login";
	}
	
	//회원 가입 처리
	@ResponseBody
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public void join2(CustomerVO vo){
		logger.debug("가입처리 : {}", vo);
		
		int result=0;
		result = dao.insert(vo);
		if(result!=1){
			logger.debug("오류오류 열매");
		}
		else{
			logger.debug("정상정상 열매");
		}
	}
	
	//로그인 하기
	@ResponseBody
	@RequestMapping(value = "/loginStart", method = RequestMethod.POST)
	public void loginStart(String email, String password, Model model, HttpSession session){
		CustomerVO vo = dao.getCustomer(email);
		
		if(vo != null) {
			logger.debug("{}", password);
			//ID, 비번 맞으면 세션에 "loginId"로 email저장, "loginName"으로 name저장
			if(vo.getPassword().equals(password)){
				logger.debug("login 성공");
				session.setAttribute("loginId", email);
				session.setAttribute("loginName", vo.getName());
			}
			model.addAttribute("error", "비밀번호가 틀렸습니다.");
		}
		else {
			model.addAttribute("error", "아이디가 없습니다.");

		}
	}
	
	//로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session){
		logger.debug("logout");
		session.invalidate();
		return "index";
	}
	
}
