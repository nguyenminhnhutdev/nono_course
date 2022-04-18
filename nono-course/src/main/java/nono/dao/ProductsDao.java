package nono.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import nono.entity.MapperProducts;
import nono.entity.Products;

@Repository
public class ProductsDao {
	@Autowired
	public JdbcTemplate _jdbctemplate;

	public List<Products> GetDataProducts() {
		List<Products> listProducts = new ArrayList<Products>();
		String sql = "SELECT * FROM course";
		listProducts = _jdbctemplate.query(sql, new MapperProducts());
		return listProducts;
	}

	public void delete(int contactId) {
		String sql = "DELETE FROM course WHERE IdCourse=?";
		_jdbctemplate.update(sql, contactId);
	}

	public List<Products> getByIdCategory(int idCategory) {
		List<Products> listProducts = new ArrayList<Products>();
		String sql = "SELECT * FROM course where IdCategory=" + idCategory;
		listProducts = _jdbctemplate.query(sql, new MapperProducts());
		return listProducts;
	}

	public Products get(int contactId) {
		String sql = "SELECT * FROM course WHERE IdCourse=" + contactId;
		return _jdbctemplate.query(sql, new ResultSetExtractor<Products>() {

			@Override
			public Products extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Products products = new Products();
					products.setIdCourse(rs.getInt("IdCourse"));
					products.setNameCourse(rs.getString("NameCourse"));
					products.setDateCreate(rs.getString("DateCreate"));
					products.setIdCategory(rs.getString("IdCategory"));
					products.setAuthor(rs.getString("Author"));
					products.setDateUpdate(rs.getString("DateUpdate"));
					products.setBanner(rs.getString("Banner"));
					products.setImage(rs.getString("Image"));
					products.setType(rs.getString("Type"));
					products.setPrice(rs.getString("Price"));
					return products;
				}

				return null;
			}

		});
	}

	public void saveOrUpdate(Products product) {
		if (product.getIdCourse() > 0) {
			// update
			String sql = "UPDATE course SET NameCourse=?, IdCategory=?, Author=?,Image=? , Type=?,Price=?"
					+ " WHERE IdCourse=?";
			_jdbctemplate.update(sql, product.getNameCourse(), product.getIdCategory(), product.getAuthor(),
					product.getImage(), product.getType(), product.getPrice(), product.getIdCourse());
		} else {
			// insert
			String sql = "INSERT INTO course (IdCourse, NameCourse, IdCategory, Author,Image,Type,Price)"
					+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
			_jdbctemplate.update(sql, product.getIdCourse(), product.getNameCourse(), product.getIdCategory(),
					product.getAuthor(), product.getImage(), product.getType(), product.getPrice());
		}

	}

	public List<Products> getEmployeesByPage( int pageid, int total) {

		String sql = "select * from course limit " + (pageid - 1) + "," + total;
		return _jdbctemplate.query(sql, new RowMapper<Products>() {
			public Products mapRow(ResultSet rs, int row) throws SQLException {
				Products products = new Products();
				products.setIdCourse(rs.getInt("IdCourse"));
				products.setNameCourse(rs.getString("NameCourse"));
				products.setDateCreate(rs.getString("DateCreate"));
				products.setIdCategory(rs.getString("IdCategory"));
				products.setAuthor(rs.getString("Author"));
				products.setDateUpdate(rs.getString("DateUpdate"));
				products.setBanner(rs.getString("Banner"));
				products.setImage(rs.getString("Image"));
				products.setType(rs.getString("Type"));
				products.setPrice(rs.getString("Price"));
				return products;
			}
		});
	}
	
	public List<Products> getEmployeesByPageId(int contactId,int pageid, int total) {

		String sql = "select * from course where IdCategory=" + contactId + "limit " + (pageid - 1) + "," + total;
		return _jdbctemplate.query(sql, new RowMapper<Products>() {
			public Products mapRow(ResultSet rs, int row) throws SQLException {
				Products products = new Products();
				products.setIdCourse(rs.getInt("IdCourse"));
				products.setNameCourse(rs.getString("NameCourse"));
				products.setDateCreate(rs.getString("DateCreate"));
				products.setIdCategory(rs.getString("IdCategory"));
				products.setAuthor(rs.getString("Author"));
				products.setDateUpdate(rs.getString("DateUpdate"));
				products.setBanner(rs.getString("Banner"));
				products.setImage(rs.getString("Image"));
				products.setType(rs.getString("Type"));
				products.setPrice(rs.getString("Price"));
				return products;
			}
		});
	}
}
