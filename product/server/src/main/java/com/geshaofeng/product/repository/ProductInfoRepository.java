package com.geshaofeng.product.repository;

import com.geshaofeng.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
