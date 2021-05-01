package com.company;

public class Main {

    public static void main(String[] args) {
    	Logger [] loggers = { new SmsLogger(), new DataBaseLogger() };

	    CustomerManager customerManager = new CustomerManager(loggers);

	    Customer arda = new Customer(1, "Arda", "Aydın");
	    customerManager.add(arda);

    }
}
