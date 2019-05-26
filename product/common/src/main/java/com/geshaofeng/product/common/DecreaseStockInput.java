package com.geshaofeng.product.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 应用场景：
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @since 2019/5/26
 */
@Data
@AllArgsConstructor
public class DecreaseStockInput {
    private String productId;
    private Integer productQuantity;
}

