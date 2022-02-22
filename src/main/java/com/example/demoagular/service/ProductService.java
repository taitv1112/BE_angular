package com.example.demoagular.service;

import com.example.demoagular.model.Product;
import com.example.demoagular.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public List<Product> findAll(){
        return iProductRepo.findAll();
    }
    public Product save(Product product){
        return iProductRepo.save(product);

    }
    public Product findProductById(Long id){
        return iProductRepo.findProductById(id);
    }
    public void delete(Long id){
        iProductRepo.deleteById(id);
    }
}
