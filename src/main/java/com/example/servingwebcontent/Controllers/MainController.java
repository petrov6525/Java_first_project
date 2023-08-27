package com.example.servingwebcontent.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model)
    {
        return "Main/index";
    }

    @GetMapping("/about-us")
    public String about(Model model)
    {
        return "Main/about";
    }

    @GetMapping("/contacts")
    public String contacts(Model model)
    {
        return "Main/contacts";
    }
}
