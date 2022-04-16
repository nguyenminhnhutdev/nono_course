package nono.entity;

import java.util.Date;

public class UserEntity {
	private String userName;
	private String password;
	private String fullName;
	private String email;
	private String phone;
	private String isAdnmin;
	private String address;
	private Date birthday;
	private String gender;
	private Integer idUser;

	public UserEntity() {
		super();
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIsAdnmin() {
		return isAdnmin;
	}

	public void setIsAdnmin(String isAdnmin) {
		this.isAdnmin = isAdnmin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public UserEntity(String userName, String password, String fullName, String email, String phone, String isAdnmin,
			String address, Date birthday, String gender, Integer idUser) {
		super();
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.isAdnmin = isAdnmin;
		this.address = address;
		this.birthday = birthday;
		this.gender = gender;
		this.idUser = idUser;
	}


}
