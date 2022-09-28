package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop", 3000,2,"Siyah");
		//Product product = new Product();
		/*product.setName("Laptop");
		product.setId(1);
		product.setDescription("Monster Notebook");
		product.setPrice(500);
		product.setStockAmount(7);
		product.setRenk("kırmızı");
		product.setHaber("naber");*/
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		//productManager.Add2(1, " ", " ", 2, 200);
		//productManager.Add2(1, " ", " ", 2, 200);
		//productManager.Add2(1, " ", " ", 2, 200);
		//productManager.Add2(1, " ", " ", 2, 200);
		//productManager.Add2(1, " ", " ", 2, 200);
		//productManager.Add2(1, " ", " ", 2, 200);
		System.out.println(product.getKod());
		/*System.out.println(product.id);
		System.out.println(product.name);
		System.out.println(product.price);
		System.out.println(product.stockAmount);
		System.out.println(product.description);*/
	}

}
