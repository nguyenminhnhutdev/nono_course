package nono.entity;

public class Product1 {

	private String id;
	private String name;
	private String photo;
	private double price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product1() {
	}

	public Product1(String id, String name, String photo, double price) {
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.price = price;
	}
}
