package conditionals;

public class Main {

	public static void main(String[] args) {
		int sayi = 15;
		if (sayi < 20) {
			System.out.println("Sayi 20'den küçüktür.");
		}

		if (sayi < 15) {
			System.out.println("Sayi 15'den küçüktür.");
		} else if (sayi == 15) {
			System.out.println("Sayi 15'e eşittir.");
		} else {
			System.out.println("sayı 15 den büyüktür");
		}

	}

}
