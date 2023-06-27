package gsx;
import java.util.*;

public class clothes {
	String size, brand, style, season;
	double price;
	
	public clothes(String size, String brand, String style, String season, double price) {
		this.size = size;
		this.brand = brand;
		this.style = style;
		this.season = season;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSize(String size) {
		return this.size;
	}
	public  ArrayList<Clothes> selectAllClothesBySize(String size, ArrayList<clothes> Clothes) {
		ArrayList<clothes> clothesSize = new ArrayList<>();
		for(clothes c  :Clothes ){
			if(c.size.contentEquals("XS")) {
				clothesSize.add(c);
				
				
			}
		
	    	
	    }
	return ArrayList<Clothes>;
	}
	
}