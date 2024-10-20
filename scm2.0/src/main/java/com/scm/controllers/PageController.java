package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {

        System.out.println("Home Page Handler");
        System.out.println("ajay is great developer");
        model.addAttribute("name", "Substring");
        model.addAttribute("youtubechannel", "learnwithdurgesh");
        model.addAttribute("githubrepo", "https://github.com/Sumesh921/HTMLForms");


        return "home";

    }


}
