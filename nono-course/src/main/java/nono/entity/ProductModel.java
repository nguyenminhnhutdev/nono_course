package nono.entity;
import java.util.ArrayList;
import java.util.List;
public class ProductModel {

	

	private List<Product1> products;

	public ProductModel() {
		this.products = new ArrayList<Product1>();
		this.products.add(new Product1("p01", "lap trinh java", "https://bom.so/bSv6rY", 4000));
		this.products.add(new Product1("p02", " java", "https://edumall.vn/_next/image?url=%2Fapi%2Fimageproxy%3Furl%3Dhttps%253A%252F%252Fcdn2.topica.vn%252F191ab4fd-9c62-4494-b209-51f86a3924d3%252Fproduct%252F613a1b0fe818b400255e338d&w=1080&q=50", 4000));
		this.products.add(new Product1("p03", "lap trinh php", "https://bom.so/91X1QC", 4000));
		this.products.add(new Product1("p04", "lap trinh c#", "https://edumall.vn/_next/image?url=%2Fapi%2Fimageproxy%3Furl%3Dhttps%253A%252F%252Fcdn2.topica.vn%252F99e8262a-7b95-4050-a1a0-d6977c9d98ed%252Fproduct%252F6000202644d203002598bd0e&w=1080&q=50", 4000));
		
	}

	public List<Product1> findAll() {
		return this.products;
	}

	public Product1 find(String id) {
		for (Product1 product : this.products) {
			if (product.getId().equalsIgnoreCase(id)) {
				return product;
			}
		}
		return null;
	}

}
