package nono.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import nono.dao.CategoryDAO;
import nono.dao.ProductsDao;
import nono.entity.*;



@Controller
public class HomeController {
	
	@Autowired
	ProductsDao productDao;
	@Autowired
	CategoryDAO categoryDao;

	
	@RequestMapping(value = {"/", "home", "trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index() {
		ModelAndView  mv = new ModelAndView("user/index");
		mv.addObject("showProducts", productDao.GetDataProducts());
		mv.addObject("categorys", categoryDao.getAllCategory()) ;
		return mv;
	}
	
//	@RequestMapping(value = {"login", "dang-nhap"}, method = RequestMethod.GET)
//	public ModelAndView Login() {
//		ModelAndView  mv = new ModelAndView("user/login");	
//		return mv;
//		//return "user/test";
//	}
//	
	
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
	
	@RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
	public ModelAndView deleteContact(HttpServletRequest request) {
	    int contactId = Integer.parseInt(request.getParameter("id"));
	    productDao.delete(contactId);
	    return new ModelAndView("redirect:admin/products");
	}
	@RequestMapping(value = "/newcorse", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
	    Products newContact = new Products();
	    model.addObject("coures", newContact);
	    model.setViewName("admin/addCourse");
	    return model;
	}
	
	@RequestMapping(value = "/savecorse", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute Products contact) {
		productDao.saveOrUpdate(contact);
	    return new ModelAndView("redirect:admin/products");
	}
	@RequestMapping(value = "/editProduct", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
	    int contactId = Integer.parseInt(request.getParameter("id"));
	    Products contact = productDao.get(contactId);
	    ModelAndView model = new ModelAndView("admin/addCourse");
	    model.addObject("coures", contact);
	 
	    return model;
	}
	
		
}
