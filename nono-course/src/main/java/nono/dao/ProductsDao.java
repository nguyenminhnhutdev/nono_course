package nono.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import nono.entity.MapperProducts;
import nono.entity.Products;

@Repository
public class ProductsDao {
	@Autowired
	public JdbcTemplate _jdbctemplate;
	
	public List<Products> GetDataProducts(){
		List<Products> listProducts = new ArrayList<Products>();
		String sql = "SELECT * FROM course";
		listProducts = _jdbctemplate.query(sql, new MapperProducts());
		return listProducts;
	}
}
