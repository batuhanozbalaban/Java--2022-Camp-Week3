package Week3;

public class ProductValidator {
	static {
		System.out.println("Static yapıcı blık çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
//this file is used for lesson 45.