package com.geshaofeng.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用场景：sh
 *
 * @author <a href="mailto:ge.sf.chn@gmail.com">shaofeng</a>
 * @since 2019/5/26
 */
@RestController
@RefreshScope
public class ServerController {

    @Value("${env}")
    private String env;

    @GetMapping("/env")
    public String msg() {
        return env;
    }
}
