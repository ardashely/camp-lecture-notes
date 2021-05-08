package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAcces.abstracts.ProductDal;
import kodlamaio.northwind.entities.concretes.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductManager implements ProductService {

    private ProductDal productDal;

    @Autowired
    public ProductManager(ProductDal productDal) {
        super();
        this.productDal = productDal;
    }

    @Override
    public List<Product> getAll() {
        return this.productDal.findAll();
    }
}
