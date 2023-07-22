package com.tqm.examsem3taquangminh.service;

import com.tqm.examsem3taquangminh.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> getListProduct();

    void createNewProduct(ProductEntity productEntity) throws Exception;

    void deleteProductById(Long prodId) throws Exception;

}
