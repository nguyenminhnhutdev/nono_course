package nono.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import nono.entity.UserEntity;

public class UserMapper implements RowMapper<UserEntity> {
	public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserEntity user = new UserEntity();
		user.setIdUser(rs.getInt("idUser"));
		user.setUserName(rs.getString("Username"));
		user.setAddress(rs.getString("Address"));
		user.setBirthday(rs.getDate("Birthday"));
		user.setFullName(rs.getString("FullName"));
		user.setEmail(rs.getString("Email"));
		user.setGender(rs.getString("Gender"));
		user.setIsAdnmin(rs.getString("Token"));
		user.setPassword(rs.getString("Password"));
		user.setPhone(rs.getString("Phone"));
		return user;
	}
}
