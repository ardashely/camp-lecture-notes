package main.dataAccess.abstracts;

import main.entities.concretes.Product;
import java.util.List;

public interface ProductDao {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product get(int ID);
    List<Product> getAll();
}
