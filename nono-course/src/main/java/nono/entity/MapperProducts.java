package nono.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProducts implements RowMapper<Products>{

	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		Products products = new Products();
		products.setIdCourse(rs.getInt("IdCourse"));
		products.setNameCourse(rs.getString("NameCourse"));
		products.setDateCreate(rs.getString("DateCreate"));
		products.setAuthor(rs.getString("Author"));
		products.setDateUpdate(rs.getString("DateUpdate"));
		products.setBanner(rs.getString("Banner"));
		products.setImage(rs.getString("Image"));
		products.setType(rs.getString("Type"));
		products.setPrice(rs.getString("Price"));		
		return products;
	}
}
