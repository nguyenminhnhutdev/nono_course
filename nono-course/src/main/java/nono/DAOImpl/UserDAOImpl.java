package nono.DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import nono.dao.UserDAO;
import nono.entity.UserEntity;
import nono.model.Login;

public class UserDAOImpl implements UserDAO {

	@Autowired
	public JdbcTemplate _jdbctemplate;

	@Override
	public void saveOrUpdate(UserEntity user) {
		// insert
		String sql = "INSERT INTO user (IdUser,UserName,Email,PassWord,Phone)" 
		+ " VALUES (?,?,?,?,?)";
		_jdbctemplate.update(sql, user.getIdUser(), user.getUserName(), user.getEmail(), user.getPassword(),
				user.getPhone());
	}

	@Override
	public void delete(int idUser) {
		String sql = "DELETE FROM user WHERE idUser=?";
		_jdbctemplate.update(sql, idUser);

	}

	@Override
	public UserEntity get(int idUser) {
		String sql = "SELECT * FROM user WHERE idUser=" + idUser;
		return _jdbctemplate.query(sql, new ResultSetExtractor<UserEntity>() {

			@Override
			public UserEntity extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
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
				}
				return null;

			}

		});
	}

	@Override
	public List<UserEntity> list() {
		String sql = "SELECT * FROM user";
		List<UserEntity> ListUser = _jdbctemplate.query(sql, new RowMapper<UserEntity>() {

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

	@Override
	public UserEntity getUserByUserNameAndPass(String userName, String pass) {
		String sql = "SELECT * FROM user WHERE Username=" + userName + "and Password=" + pass;
		return _jdbctemplate.query(sql, new ResultSetExtractor<UserEntity>() {

			@Override
			public UserEntity extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
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
				}
				return null;

			}

		});
	}
	@Override
	 public UserEntity validateUser(Login login) {

		    String sql = "select * from user where Username='" + login.getUsername() + "' and Password='" + login.getPassword()
		    + "'";

		    List<UserEntity> users = _jdbctemplate.query(sql, new UserMapper());

		    return users.size() > 0 ? users.get(0) : null;
		    }
	
	class UserMapper implements RowMapper<UserEntity> {

		  public UserEntity mapRow(ResultSet rs, int arg1) throws SQLException {
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

}
