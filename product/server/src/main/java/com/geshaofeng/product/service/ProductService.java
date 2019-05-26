package com.geshaofeng.product.service;

import com.geshaofeng.product.common.DecreaseStockInput;
import com.geshaofeng.product.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 根据商品ids，查询商品列表
     *
     * @param productList
     * @return
     */
    List<ProductInfo> findList(List<String> productList);

    void decreaseStock(List<DecreaseStockInput> cartDTOList);
}
