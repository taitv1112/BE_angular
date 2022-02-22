package com.example.demoagular.repository;

import com.example.demoagular.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product, Long> {
    Product findProductById(Long id);
}
