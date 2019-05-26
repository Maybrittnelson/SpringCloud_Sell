package com.geshaofeng.order.utils;

import java.util.Random;

/**
 * 应用场景：可以单独做成唯一主见的项目
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @since 2019/5/26
 */
public class KeyUtil {

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(9000000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
