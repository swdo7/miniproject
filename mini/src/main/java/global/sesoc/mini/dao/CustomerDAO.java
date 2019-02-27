package global.sesoc.mini.dao;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.mini.controller.LogController;
import global.sesoc.mini.vo.CustomerVO;

@Repository
public class CustomerDAO {

	@Autowired
	SqlSession sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(LogController.class);
	public int insert(CustomerVO vo) {
		CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
		int res=0;
		
		try{
			res = mapper.insertCustomer(vo);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return res; //저장 성공은 1, 실패는 0
	}
	public CustomerVO getCustomer(String email) {
		CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
		CustomerVO vo = null;
		
		try{
			vo = mapper.searchCustomer(email);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return vo;
	}
}
