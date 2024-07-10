package java_8_Static;

public interface Furnitur {
	public static int price(String material, int price) {
		if(material.equals("Wood")) {
			return price+1000;
		}
		else {
			return price;
		}
		
	}
	public String name();
}
