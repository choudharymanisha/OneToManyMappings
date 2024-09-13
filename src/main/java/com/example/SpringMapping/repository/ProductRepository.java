package com.example.SpringMapping.repository;

import com.example.SpringMapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends  JpaRepository<Product ,Integer > {
}
