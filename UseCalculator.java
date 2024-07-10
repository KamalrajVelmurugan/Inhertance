package java_8_Static;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator k = ((x,y,z)-> {
			int a =x;
			int b =y;
			int c = z;
			return a+b+c;
			
		});
		System.out.println(k.findAdd(10, 110, 30));

	}

}
