package java_8_Static;

public class UseTable {

	public static void main(String[] args) {
		Table t1 = new Table();
		System.out.println(t1.name());
		Table.color();
		System.out.println(Furnitur.price("Wood", 2000));
		

	}

}
