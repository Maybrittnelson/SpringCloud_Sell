package com.geshaofeng.order.service;

import com.geshaofeng.order.dto.OrderDTO;

/**
 * 应用场景：
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @since 2019/5/25
 */
public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);
}
