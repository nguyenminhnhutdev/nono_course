package nono.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import nono.dao.UserDAO;
import nono.entity.UserEntity;

@Controller
public class UserController {

	/*
	 * @Autowired private UserDAO userDao;
	 * 
	 * @RequestMapping(value = "/login/test") public ModelAndView
	 * listUser(ModelAndView model) throws IOException { List<UserEntity> listUser =
	 * userDao.list(); model.addObject("listUser", listUser);
	 * model.setViewName("user/login");
	 * 
	 * return model; }
	 */
}
