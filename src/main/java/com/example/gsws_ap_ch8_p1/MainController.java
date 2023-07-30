package com.example.gsws_ap_ch8_p1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page){
        page.addAttribute("username", "Kate");
        page.addAttribute("color", "red");
        return "home.html";
    }
}
