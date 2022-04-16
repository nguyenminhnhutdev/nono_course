package nono.DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import nono.dao.UserDAO;
import nono.entity.UserEntity;
import nono.mapping.UserMapper;

public class UserDAOImpl implements UserDAO {
	private JdbcTemplate jdbcTemplate;

	public UserDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveOrUpdate(UserEntity user) {

	}

	public void delete(int idUser) {

	}

	
	//public UserEntity get(int idUser) { return 0; }
	 

	public List<UserEntity> list() {
		String sql = "SELECT * FROM user";
	    List<UserEntity> ListUser = jdbcTemplate.query(sql, new RowMapper<UserEntity>() {
	 
	        @Override
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
	 
	    });
	 
	    return ListUser;

	}

}
