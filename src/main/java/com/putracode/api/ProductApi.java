package com.putracode.api;

import com.putracode.dao.ProductRepo;
import com.putracode.domain.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by krisna putra on 11/7/2017.
 */
@RestController
@RequestMapping("/api/product")
public class ProductApi {
    Logger log= LoggerFactory.getLogger(ProductApi.class);

    @Autowired
    ProductRepo repo;
    @GetMapping("/")
    public Iterable<Product> getProducts(){
        return repo.findAll();
    }

}
