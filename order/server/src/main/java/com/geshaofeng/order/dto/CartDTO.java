package com.geshaofeng.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 应用场景：
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @since 2019/5/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {
    private String productId;
    private Integer productQuantity;
}
