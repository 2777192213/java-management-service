package com.example.ext.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouxiaotao
 * @Description: 检查服务
 * @date 2023-11-15 9:19
 */
@RestController
@RequestMapping("/")
public class CheckController {
    @GetMapping("/index")
    public String index() {
        return "ok";
    }

}
