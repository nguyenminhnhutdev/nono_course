package nono.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import nono.model.Login;
import nono.dao.UserDAO;
import nono.entity.UserEntity;

@Controller
public class UserController {

	@Autowired
	 UserDAO userDao;

	@RequestMapping(value = {"login", "dang-nhap"}, method = RequestMethod.GET)
	public ModelAndView Login(ModelAndView model) {
		Login login = new Login();
		 model.addObject("login", login);
		    model.setViewName("user/login");
		    return model;
		
		
	}
	
	 @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute Login login) {
		 ModelAndView mav = null;
		 if(login.getUsername()=="" || login.getPassword() =="") {
			 mav =  new ModelAndView("redirect:/");
		 }else {
			 UserEntity user = userDao.validateUser(login);

			    if (null != user) {
			    	 mav =  new ModelAndView("redirect:/");
			    } else {
			    	mav = new ModelAndView("login");
			        
			    }
		 }
	   
	   
	    return mav;
	  }

	
//	@RequestMapping(value = {"singup", "dang-ky", "register"}, method = RequestMethod.GET)
//	public ModelAndView Register(ModelAndView model) {
//		
//		
//		UserEntity  newUser =new  UserEntity();
//		model.addObject("user", newUser);
//		model.setViewName("user/login");
//		return model;
//		//return "user/test";
//	}
//	
//	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
//	public ModelAndView saveUser(@ModelAttribute UserEntity user) {
//		//userDao.saveOrUpdate(user);
//	    return new ModelAndView("redirect:/");
//	}
	
	@RequestMapping(value =  {"singup", "dang-ky", "register", "newuser"}, method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		UserEntity newUser = new UserEntity();
	    model.addObject("user", newUser);
	    model.setViewName("user/singup");
	    return model;
	}
	
	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute UserEntity user) {
		userDao.saveOrUpdate(user);
	    return new ModelAndView("redirect:/login");
	}
	
	
}
