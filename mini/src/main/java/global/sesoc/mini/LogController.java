package global.sesoc.mini;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LogController {
	
	private static final Logger logger = LoggerFactory.getLogger(LogController.class);
	
	/**
	 * 각 JSP페이지로 가기위한 컨트롤러들
	 */
	@RequestMapping(value = "/loginConnect", method = RequestMethod.GET)
	public String loginConnect() {
		
		return "loginConnect";
	}
}
