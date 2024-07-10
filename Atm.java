package java_8_Static;

public interface Atm {
	public static void pin() {
		System.out.println(1234);
	}
	public default int cash(int amount) {
		return amount;
	}
}
