package com.example.Campaign.management.service;

import com.example.Campaign.management.Model.DTO.ProductDTO;
import com.example.Campaign.management.Model.Product;
import com.example.Campaign.management.repository.productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    productrepo productRepo;

    public List<Product> save(List<Product> p) {
        return productRepo.saveAll(p);
    }

    public ProductDTO get(Integer page, Integer pageSize) {
        Page<Product> productPage = productRepo.findAll(PageRequest.of(page - 1, pageSize));

        List<Product> productList = productPage.getContent();
        int totalPage = ((Page<?>) productPage).getTotalPages();

        ProductDTO ans = new ProductDTO();
        ans.setProduct(productList);
        ans.setPage(page);
        ans.setTotalPage(totalPage);
        ans.setPageSize(pageSize);

        return ans;
    }
}