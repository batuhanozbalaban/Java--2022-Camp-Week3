package Week3;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
	}

}
//this file is used for lesson 45.