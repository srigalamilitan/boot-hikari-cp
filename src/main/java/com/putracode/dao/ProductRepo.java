package com.putracode.dao;

import com.putracode.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by krisna putra on 11/6/2017.
 */
public interface ProductRepo extends PagingAndSortingRepository<Product,String> {
}
