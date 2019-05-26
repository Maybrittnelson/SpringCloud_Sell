package com.geshaofeng.order.exception;

import com.geshaofeng.order.enums.ResultEnum;

/**
 * 应用场景：
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @since 2019/5/26
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
