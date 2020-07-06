package com.formatoweb.git06072020.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PadreController {
    @GetMapping("/padres")
    public String getPadres(){
        return "padres";
    }
}
