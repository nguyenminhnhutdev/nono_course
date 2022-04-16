package nono.dao;

import java.util.List;

import nono.entity.UserEntity;

public interface UserDAO {
	public void saveOrUpdate(UserEntity user);

	public void delete(int idUser);

//	public UserEntity get(int idUser);

	public List<UserEntity> list();
}
