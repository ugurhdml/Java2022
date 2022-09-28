package sesliHarfler;

public class Main {

	public static void main(String[] args) {
char harf='e';
		
		
		if (harf=='I'|| harf=='A'||harf == 'O'||harf =='U'|| harf=='ı'|| harf=='a'||harf == 'o'||harf =='u') {
			
		
			
			System.out.println(harf + " Kalın sesli harftir");
		}
		
		else if (harf=='E'|| harf=='İ'||harf == 'Ö'||harf =='Ü'|| harf=='e'|| harf=='i'||harf == 'ö'||harf =='ü')
			
			{System.out.println(harf + " İnce sesli harftir");}
		
		else {
			System.out.println("Girmiş olduğunuz karakter sessiz bir harftir. Lütfen sesli bir harf giriniz"); 

	}

}
}