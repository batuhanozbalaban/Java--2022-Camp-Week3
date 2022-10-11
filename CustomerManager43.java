package Week3;

public class CustomerManager43 {
	private ICustomerDal customerDal;
	public CustomerManager43(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	public void add() {
		//İş kodları burada yazılır.
		customerDal.Add();
		
	}

}
//This file is used for lesson 43.