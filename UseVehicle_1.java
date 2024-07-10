package java_8_Static;

public class UseVehicle_1 {

	public static void main(String[] args) {
		Vehicle a = ((b,c) ->{
			int price =b;
			int taxAmount =c;
			return b+c;
		});
		System.out.println(a.findNetPrice(100, 20));
		

	}

}
