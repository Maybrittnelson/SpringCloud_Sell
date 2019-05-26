package com.geshaofeng.order.VO;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 应用场景：
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @since 2019/5/26
 */
@Data
@RequiredArgsConstructor
public class ResultVO<T> {

    @NonNull
    private Integer code;
    @NonNull
    private String msg;
    private T data;

}
