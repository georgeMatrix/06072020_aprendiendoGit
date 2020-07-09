package com.formatoweb.git06072020.controllers;

import com.formatoweb.git06072020.entity.Padres;
import com.formatoweb.git06072020.services.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PadreController {
    @Autowired
    private PadreService padreService;

    @GetMapping("/padres")
    public List<Padres> getPadres(){
        return padreService.getPadres();
    }
    
    @PostMapping("/padres")
    public Padres savePadres(Padres padres){
        return padreService.savePadres(padres);
    }
}
