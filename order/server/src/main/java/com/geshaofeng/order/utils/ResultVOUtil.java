package com.geshaofeng.order.utils;

import com.geshaofeng.order.VO.ResultVO;

/**
 * 应用场景：
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @since 2019/5/26
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO(0, "成功");
        resultVO.setData(object);
        return resultVO;
    }
}
