package com.example.gsws_ap_ch8_p1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home/{color}")
    public String home(@PathVariable String color,
            @RequestParam(required = false) String name, Model page){
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home.html";
    }
}
