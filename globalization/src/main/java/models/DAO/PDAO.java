package models.DAO;

import java.util.ArrayList;

import models.Product;

public class PDAO{
	private ArrayList<Product> products = new ArrayList<Product>();
	
	


	public ArrayList<Product> makeProducts(){
		this.products.add(new Product("1", "blue cup", 10.99, ",,,"));
		this.products.add(new Product("2", "red cup", 15.99, ",,,"));
		this.products.add(new Product("3", "orange cup", 19.99, ",,,"));
		return this.products;

	}
	
	
	public ArrayList<String> getIds() {
		ArrayList<String> ids = new ArrayList<String>();
		for (Product product : products) {
			ids.add(product.getPno());
		}
		return ids;
	}
}