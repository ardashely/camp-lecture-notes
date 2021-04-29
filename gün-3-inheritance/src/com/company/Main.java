package com.company;

public class Main {

    public static void main(String[] args) {

        individualCustomer arda = new individualCustomer();

        arda.customerNumber = "12345";


        CorporateCustomer hepsiBurada = new CorporateCustomer();

        hepsiBurada.customerNumber = "67890";


        SendikaCustomer sendika = new SendikaCustomer();

        sendika.customerNumber = "0999";


        CustomerManager customerManager = new CustomerManager();

        Customer[] customers = {arda, hepsiBurada, sendika};

        customerManager.addMultiple(customers);

       /*
        customerManager.add(hepsiBurada);
        customerManager.add(arda);
        customerManager.add(sendika);
       */
    }
}
