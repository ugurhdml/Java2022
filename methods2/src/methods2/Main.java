package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		mesaj.substring(0,2); //String yeniMesaj =mesaj.substring(0,2) 
		System.out.println(mesaj);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15,7);
		System.out.println(sayi);
		int toplam = topla2(1,5,8,123,56,42313);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void guncelle() {
		System.out.println("Güncellendi.");
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static String sehirVer() {
		return "Ankara";
	}
	public static int topla2(int... sayilar) {
		int toplam =0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
	return toplam;
	}
	
}