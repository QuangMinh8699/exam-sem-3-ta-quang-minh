package com.tqm.examsem3taquangminh.service.impl;

import com.tqm.examsem3taquangminh.entity.ProductEntity;
import com.tqm.examsem3taquangminh.repo.ProductRepo;
import com.tqm.examsem3taquangminh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<ProductEntity> getListProduct() {
        return productRepo.findAll();
    }

    @Override
    public void createNewProduct(ProductEntity productEntity) throws Exception {
        ProductEntity product = productRepo.findByProdName(productEntity.getProdName());
        if (!ObjectUtils.isEmpty(product)) {
            throw new Exception("Product da ton tai!");
        }
        productRepo.save(productEntity);
    }

    @Override
    public void deleteProductById(Long prodId) throws Exception {

        if (ObjectUtils.isEmpty(prodId)) {
            throw new Exception("Khong co prodId");
        }

        Optional<ProductEntity> productOptional = productRepo.findById(prodId);

        if (!productOptional.isPresent()) {
            throw new Exception("Khong co product nay !");
        }

        productRepo.deleteById(prodId);

    }
}
