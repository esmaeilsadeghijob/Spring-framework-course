package com.javatar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/customer")
    public String customer(){
        return "customer";
    }

}
