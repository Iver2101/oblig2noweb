package controller;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import models.*;
import models.DAO.*;
import view.*;

public class Controller{
	
	public static void main(String[] args) throws InterruptedException {
		String[] availableLanguages = {"EN", "NO", "JV"};
		View shop = new View(new Locale("no","NO"));
		DDAO dDAO = new DDAO();
		PDAO pDAO = new PDAO();
		ArrayList<Description> descriptions = dDAO.makeDescriptions();
		ArrayList<Product> products = pDAO.makeProducts();
		Cart cart = new Cart();
		
		Scanner scanner = new Scanner(System.in);
		
		shop.startView();
		
		
		while(true) {
			String input = scanner.nextLine();
			if(input.equals("add")){
		
				shop.addProd(pDAO.getIds());
				String selectedId = scanner.nextLine();
				if(pDAO.getIds().contains(selectedId)){
					for(Product p : products) {
						if(p.getPno().equals(selectedId)) {
							cart.add(p);
							break;
						}
					}
				} else {
					shop.error();
						
				}
				shop.shopView(products);

				
	
				
				
			} else if(input.equals("remove")) {
				shop.removeProd(cart.getIds());
				String selectedId = scanner.nextLine();
				if(cart.getIds().contains(selectedId)) {
					for(Product p : cart.getProducts()) {
						if(p.getPno().equals(selectedId)) {
							cart.remove(p);
						}
					}
				} else {
					shop.error();
					shop.shopView(products);
									}
				
			} else if(input.equals("exit")) {
				shop.exit();
				break;
			} else if(input.equals("origin")) {
				shop.startView();
			} else if(input.equals("cart")) {
				shop.cartView(cart);
				
			} else if(input.equals("shop")) {
				shop.shopView(products);

			} else if(input.equals("language")) {
		
				shop.printLangs(availableLanguages);
				String selectedLang = scanner.nextLine();
				
				try {
					shop.setLocale(new Locale(selectedLang));
					
				} catch (Exception e) {
					shop.error();
				}
				shop.startView();

			} 

		
		}
		
		
				
	}
	

}