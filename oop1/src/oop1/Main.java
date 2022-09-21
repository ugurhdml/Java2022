package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDisccount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Sweg Kahve Makinesi");
		product2.setDisccount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDisccount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		System.out.println();
		for(Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getDisccount());
		}
		individualCustomer individualCustomer = new individualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("055055555");
		individualCustomer.setLastName("Hadımlı");
		individualCustomer.setFirstName("Uğur");
		individualCustomer.setCustomerNumber("13123123");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("Gürmar");
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0505550550");
		corporateCustomer.setTaxNumber("124124");
		corporateCustomer.setCustomerNumber("524214");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
	}
		
		
	}


