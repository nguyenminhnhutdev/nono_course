package nono.DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import nono.dao.CategoryDAO;
import nono.entity.Category;


public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	public JdbcTemplate _jdbctemplate;

	@Override
	public List<Category> getAllCategory() {
		String sql = "SELECT * FROM category";
		List<Category> listCategory = _jdbctemplate.query(sql, new RowMapper<Category>() {

			@Override
			public Category mapRow(ResultSet rs, int rowNum) throws SQLException {

				Category categorys = new Category();
				categorys.setIdCategory(rs.getInt("IdCategory"));
				categorys.setNameCategory(rs.getString("NameCategory"));

				return categorys;
			}

		});

		return listCategory;
	}

}
