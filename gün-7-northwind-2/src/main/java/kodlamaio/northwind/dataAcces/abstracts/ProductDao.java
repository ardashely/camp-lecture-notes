package kodlamaio.northwind.dataAcces.abstracts;

import kodlamaio.northwind.entities.concretes.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {}