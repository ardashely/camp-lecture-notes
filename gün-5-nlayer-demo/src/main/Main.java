package main;

import main.business.abstracts.ProductService;
import main.business.cocrretes.ProductManager;
import main.dataAccess.concretes.AbcProductDao;
import main.entities.concretes.Product;
import main.core.JLoggerManagerAdaptor;

public class Main {

    public static void main(String[] args) {
        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdaptor());

        Product product = new Product(2,2,"Elma",12,50);
        productService.add(product);
    }
}