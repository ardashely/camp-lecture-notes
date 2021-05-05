package main.dataAccess.concretes;

import main.dataAccess.abstracts.ProductDao;
import main.entities.concretes.Product;

import java.util.List;


public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Yeni ürün eklendi : " + product.getID() + product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int ID) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
