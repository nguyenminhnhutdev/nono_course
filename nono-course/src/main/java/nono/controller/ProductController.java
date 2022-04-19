package nono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import nono.dao.CategoryDAO;
import nono.dao.ProductsDao;
import nono.entity.Products;

@Controller
public class ProductController {

	@Autowired
	ProductsDao productDao;
	@Autowired
	CategoryDAO categoryDao;

	@RequestMapping(value = { "product", "san-pham" }, method = RequestMethod.GET)
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/product_all");
		mv.addObject("showProducts", productDao.GetDataProducts());
		mv.addObject("categorys", categoryDao.getAllCategory());
		return mv;
	}

	@RequestMapping(value = { "product/{id}", "san-pham/{id}" }, method = RequestMethod.GET)
	public ModelAndView LoadByIdCategory(@PathVariable Integer id) {
		ModelAndView mv = new ModelAndView("user/product");
		mv.addObject("showProductsById", productDao.getByIdCategory(id));
		mv.addObject("categorys", categoryDao.getAllCategory());
		return mv;
	}
	
	@RequestMapping(value = { "product/{id}/{pageid}", "san-pham/{id}/{pageid}" }, method = RequestMethod.GET)
	public ModelAndView LoadByIdCategoryP(@PathVariable Integer id, int pageid) {
		int total=9;    
        if(pageid==1){}    
        else{    
            pageid=(pageid-1)*total+1;    
        }    
		ModelAndView mv = new ModelAndView("user/product");
		mv.addObject("showProductsById", productDao.getEmployeesByPageId(id, pageid, total));
		mv.addObject("categorys", categoryDao.getAllCategory());
		return mv;
	}
	
	@RequestMapping(value = { "product-detail/{id}", "chi-tiet-san-pham/{id}" }, method = RequestMethod.GET)
	public ModelAndView getDetailProduct(@PathVariable Integer id) {
		ModelAndView mv = new ModelAndView("user/product_detail");
		mv.addObject("showProductsById", productDao.get(id));
		return mv;
	}
	
	
	 @RequestMapping(value="/product-page/{pageid}")    
	    public ModelAndView edit(@PathVariable int pageid){    
	        int total=9;    
	        if(pageid==1){}    
	        else{    
	            pageid=(pageid-1)*total+1;    
	        }    
	        ModelAndView mv = new ModelAndView("user/product_all");
	        mv.addObject("categorys", categoryDao.getAllCategory());
	        mv.addObject("showProducts", productDao.getEmployeesByPage(pageid, total));  
	        return mv;    
	    }    

}
