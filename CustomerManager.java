package Week3;

public class CustomerManager {
	private BaseLogger logger;
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	public void Add() {
		System.out.println("Müşteri Eklendi");
		this.logger.log("Log Mesajı");
		
		
	}

}
//This file is used for lesson 38.