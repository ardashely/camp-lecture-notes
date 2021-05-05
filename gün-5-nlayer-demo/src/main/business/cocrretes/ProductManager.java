package main.business.cocrretes;

import main.business.abstracts.ProductService;
import main.core.LoggerService;
import main.dataAccess.abstracts.ProductDao;
import main.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        super();
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryID() == 1) {
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi : " + product.getID() + product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
