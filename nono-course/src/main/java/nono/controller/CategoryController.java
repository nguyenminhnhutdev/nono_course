package nono.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import nono.dao.CategoryDAO;
import nono.model.Login;

@Controller
public class CategoryController {

	@Autowired
	 CategoryDAO categoryDao;
//	@RequestMapping(value = {"category", "dang-nhap"}, method = RequestMethod.GET)
//	public ModelAndView Login(ModelAndView model) {
//		Login login = new Login();
//		 model.addObject("login", login);
//		    model.setViewName("user/login");
//		    return model;
//		
//		
//	}
}
