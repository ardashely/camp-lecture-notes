package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilites.results.DataResult;
import kodlamaio.northwind.core.utilites.results.Result;
import kodlamaio.northwind.core.utilites.results.SuccesDataResult;
import kodlamaio.northwind.core.utilites.results.SuccesResult;
import kodlamaio.northwind.dataAcces.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccesDataResult<List<Product>>
                (this.productDao.findAll(), "Data Getirildi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccesResult("Ürün eklendi" + product);
    }
}