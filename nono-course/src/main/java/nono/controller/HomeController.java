package nono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	@RequestMapping(value = {"/", "home", "trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index() {
		ModelAndView  mv = new ModelAndView("user/index");
		return mv;
		//return "user/test";
	}
	@RequestMapping(value = {"login", "dang-nhap"}, method = RequestMethod.GET)
	public ModelAndView Login() {
		ModelAndView  mv = new ModelAndView("user/login");
		return mv;
		//return "user/test";
	}
	@RequestMapping(value = {"singup", "dang-ky", "register"}, method = RequestMethod.GET)
	public ModelAndView Register() {
		ModelAndView  mv = new ModelAndView("user/singup");
		return mv;
		//return "user/test";
	}
	
	@RequestMapping(value = {"/admin", "quan-tri"}, method = RequestMethod.GET)
	public String Admin() {
		return "admin/index";
	}
}
