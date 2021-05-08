package kodlamaio.northwind.dataAcces.abstracts;

import kodlamaio.northwind.entities.concretes.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDal extends JpaRepository<Product, Integer> {}