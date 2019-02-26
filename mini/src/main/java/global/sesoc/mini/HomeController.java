package global.sesoc.mini;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * 각 JSP페이지로 가기위한 컨트롤러들
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value = "/404", method = RequestMethod.GET)
	public String jsp404() {
		
		return "404";
	}
	
	@RequestMapping(value = "/blank", method = RequestMethod.GET)
	public String blank() {
		
		return "blank";
	}
	
	@RequestMapping(value = "/buttons", method = RequestMethod.GET)
	public String buttons() {
		
		return "buttons";
	}
	
	@RequestMapping(value = "/cards", method = RequestMethod.GET)
	public String cards() {
		
		return "cards";
	}
	
	@RequestMapping(value = "/charts", method = RequestMethod.GET)
	public String charts() {
		
		return "charts";
	}
	
	@RequestMapping(value = "/forgot-password", method = RequestMethod.GET)
	public String forgotpassword() {
		
		return "forgot-password";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		
		return "register";
	}
	
	@RequestMapping(value = "/tables", method = RequestMethod.GET)
	public String tables() {
		
		return "tables";
	}
	
	@RequestMapping(value = "/utilities-border", method = RequestMethod.GET)
	public String utilborder() {
		
		return "utilities-border";
	}
	
	@RequestMapping(value = "/utilities-animation", method = RequestMethod.GET)
	public String utilitiesanimation() {
		
		return "utilities-animation";
	}
	
	@RequestMapping(value = "/utilities-color", method = RequestMethod.GET)
	public String utilitiescolor() {
		
		return "utilities-color";
	}
	
	@RequestMapping(value = "/utilities-other", method = RequestMethod.GET)
	public String utilitiesother() {
		
		return "utilities-other";
	}
}
