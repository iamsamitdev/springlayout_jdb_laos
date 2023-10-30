package com.itgenius.springlayout.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/backend")
public class BackendController {
    
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Get Data";
    }

    @PostMapping("/")
    @ResponseBody
    public String save() {
        return "Save Data";
    }

    @PutMapping("/")
    @ResponseBody
    public String update() {
        return "Update Data";
    }

    @DeleteMapping("/")
    @ResponseBody
    public String delete() {
        return "Delete Data";
    }

}
