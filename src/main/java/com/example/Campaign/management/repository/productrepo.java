package com.example.Campaign.management.repository;

import com.example.Campaign.management.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productrepo extends JpaRepository<Product,Long> {
}
