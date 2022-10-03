package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import models.Cart;
import models.Product;
import java.text.NumberFormat;


public class View {
	
	private Locale locale; 
	private ResourceBundle appText; 
	
	public View(Locale locale) {
		super();
		this.locale = locale;
		this.appText = ResourceBundle.getBundle("apptexts", locale);
		
	}
	
	public void startView() {
		
		System.out.println("-------------------------------------------------");
		System.out.println(appText.getString("wc"));
		System.out.println(appText.getString("navcommands"));
		System.out.println(appText.getString("x-it"));
		System.out.println(appText.getString("add"));
		System.out.println(appText.getString("remove"));
		System.out.println(appText.getString("shop"));
		System.out.println(appText.getString("origin"));
		System.out.println(appText.getString("language"));

		System.out.println("� MMVIII-MMXXII HVL");
		System.out.println("-------------------------------------------------");
		
	}
	
	public void shopView(List<Product> products)
	{
		System.out.println("-------------------------------------------------");
		System.out.println(appText.getString("wc"));
		for(Product p : products)
		{
			System.out.println(p.toString());
		}
		System.out.println("� MMVIII-MMXXII HVL");
		System.out.println("-------------------------------------------------");
	}

	public void cartView(Cart cart)
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		double total = 0;
		System.out.println("-----------------------------------------------------");
		System.out.println(appText.getString("userCart"));
		for(Product p : cart.getProducts())
		{
			total += p.getPriceInEuro();
			System.out.println(p.toString());
		}
		System.out.println(appText.getString("total") + " " + formatter.format(total));
		System.out.println("� MMVIII-MMXXII HVL");
		System.out.println("-----------------------------------------------------");
	}
	
	
	
	public void addProd (List<String> options) {
		System.out.println(appText.getString("addProductPrompt"));
		System.out.println(options);
	
	}
	
	public void removeProd (List<String> options) {
		System.out.println(appText.getString("removeProductPrompt"));
		System.out.println(options);
		
	}
	
	public void error() throws InterruptedException {
		System.out.println(appText.getString("ErrorMsg"));
		Thread.sleep(4000);
	}
	
	public void exit() throws InterruptedException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("exitinging program");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Thread.sleep(3000);
		
	}
	

	public ResourceBundle getAppText() {
		return appText;
	}

	public void setAppText(ResourceBundle appText) {
		this.appText = appText;
	}
	
	public void printLangs(String[] langs) {
		for(String lang : langs) {
			System.out.println("Available");
			System.out.println(lang);
		}
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
		this.appText = ResourceBundle.getBundle("apptexts", locale);

	}
	
	
	
	
	
}
