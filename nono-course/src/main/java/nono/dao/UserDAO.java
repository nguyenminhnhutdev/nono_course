package nono.dao;


import java.util.List;


import nono.entity.UserEntity;
import nono.model.Login;

public interface UserDAO {
	public UserEntity validateUser(Login login);

	public void saveOrUpdate(UserEntity user);
    
    public void delete(int idUser);
     
    public UserEntity get(int idUser);
     
    public List<UserEntity> list();
    
    public UserEntity getUserByUserNameAndPass(String userName, String pass) ;
}
