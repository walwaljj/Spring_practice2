package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {


    @GetMapping("/hi")// localhost:8080 뒤에 붙을 주소.
    public String niceToMeetYou(Model model){//Model import 해야 addAttribute로 값 전달 가능.
        model.addAttribute("username","왈왈");
                                        //ㄴ 템플릿의 변수와 동일하게 해야함.
        return "greetings";
    }
}
