package nono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import nono.dao.ProductsDao;
import nono.dao.UserDAO;
import nono.entity.UserEntity;



@Controller
public class HomeController {
	
	@Autowired
	ProductsDao productDao;

	
	@RequestMapping(value = {"/", "home", "trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index() {
		ModelAndView  mv = new ModelAndView("user/index");
		mv.addObject("showProducts", productDao.GetDataProducts());
		return mv;
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
	
	@RequestMapping(value = {"/admin/", "/admin/login", "/quan-tri/dang-nhap"}, method = RequestMethod.GET)
	public String Admin_login() {
		return "admin/login";
	}
	
	@RequestMapping(value = {"/admin/home", "quan-tri/trang-chu"}, method = RequestMethod.GET)
	public String Admin() {
		return "admin/index";
	}
	
	@RequestMapping(value = {"/admin/form", "quan-tri/cap-nhat-kh"}, method = RequestMethod.GET)
	public String Admin_form() {
		return "admin/form";
	}
	
	@RequestMapping(value = {"/admin/products", "quan-tri/cn-khoahoc"}, method = RequestMethod.GET)
	public ModelAndView Admin_products() {
		ModelAndView  mv = new ModelAndView("admin/products");
		mv.addObject("showProducts", productDao.GetDataProducts());
		return mv;
	}
}
