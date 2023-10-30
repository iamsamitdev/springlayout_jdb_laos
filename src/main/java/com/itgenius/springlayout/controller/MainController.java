package com.itgenius.springlayout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/frontend")
public class MainController {

    @GetMapping("/")
    // @ResponseBody
    public String index(Model model) {
        model.addAttribute("homeMenuActive", true);
        return "frontend/index";
    }

    @GetMapping("/about")
    // @ResponseBody
    public String about(Model model) {
        model.addAttribute("aboutMenuActive", true);
        return "frontend/about";
    }

    @GetMapping("/service")
    // @ResponseBody
    public String service(Model model) {
        model.addAttribute("serviceMenuActive", true);
        return "frontend/service";
    }
    
}
