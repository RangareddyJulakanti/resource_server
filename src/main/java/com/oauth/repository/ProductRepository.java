package com.oauth.repository;

import com.oauth.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by RANGAREJ on 11/11/2018.
 */

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findByNameLike(String name);
    List<Product> findAll();
}
