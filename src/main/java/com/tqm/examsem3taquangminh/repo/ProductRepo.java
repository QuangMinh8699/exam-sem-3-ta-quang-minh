package com.tqm.examsem3taquangminh.repo;

import com.tqm.examsem3taquangminh.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long> {

    ProductEntity findByProdName(String prodName);

}
