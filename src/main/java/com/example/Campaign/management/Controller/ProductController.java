package com.example.Campaign.management.Controller;

import com.example.Campaign.management.Model.Campaigns;
import com.example.Campaign.management.Model.DTO.ProductDTO;
import com.example.Campaign.management.Model.Product;
import com.example.Campaign.management.service.CampaignsService;
import com.example.Campaign.management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("mystore")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public List<Product> add(@RequestBody List<Product> p){
        return productService.save(p);
    }

    @GetMapping("/get")
    public ProductDTO get(@RequestParam Integer page, Integer pageSize){
        return productService.get(page,pageSize);
    }

}