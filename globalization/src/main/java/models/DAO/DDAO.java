package models.DAO;

import java.util.ArrayList;

import models.Description;
import models.Description;

public class DDAO{
	public ArrayList<Description> makeDescriptions(){
		
		ArrayList<Description> descriptions = new ArrayList<Description>();
		descriptions.add(new Description("1","en", "A ikea cup with the color blue"));
		descriptions.add(new Description("2", "en", "A ikea cup with the color blue"));
		descriptions.add(new Description("3","en", "orange cup ikea"));
		return descriptions;
		
	}
}