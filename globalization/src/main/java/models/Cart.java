package models;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Product> products = new ArrayList<Product>();

	
	public void add(Product product) {
		this.products.add(product);
	}
	
	public void remove(Product product) {
		this.products.remove(product);
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	public ArrayList<String> getIds() {
		ArrayList<String> ids = new ArrayList<String>();
		for (Product product : products) {
			ids.add(product.getPno());
		}
		return ids;
	}
}