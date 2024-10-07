package com.hose.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class  HomeController {
    @GetMapping("/") // 기본주소 요청이 오면
    public String index() {
        System.out.println("HomeController.index");
        return "index";
    }
}