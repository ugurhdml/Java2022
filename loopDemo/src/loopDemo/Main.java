package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("1'den 10'a kadar yazdırıldı. (for)");
		
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("Tek sayılar yazdırıldı. (for)");
		
		//While
		
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i+=2;			
		}
//infinite loop 		
		System.out.println("While döngüsü bitti");
		
		//Do-While 
		int j=2;
		do {
			System.out.println("Loglandı");
			System.out.println(j);
			j+=3;
		}while(j<10);
		System.out.println("Do-While döngüsü bitti");
	}

}
