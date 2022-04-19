package nono.entity;

public class Item {
	private Product1 product;
	private int quantity;

	public Product1 getProduct() {
		return product;
	}

	public void setProduct(Product1 product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item() {
	}

	public Item(Product1 product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
}
