package com.formatoweb.git06072020.controllers;

import com.formatoweb.git06072020.entity.Padres;
import com.formatoweb.git06072020.services.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/padres/{id}")
    public Padres getPadreId(@PathVariable Long id){
        return padreService.getPadresById(id);
    }

    @PutMapping("/padres/{id}")
    public Padres updatePadres(@RequestBody Padres padreNuevo, @PathVariable Long id){
        Padres padreViejo = padreService.getPadresById(id);
        padreViejo.setNombrePadre(padreNuevo.getNombrePadre());
        padreViejo.setApellidoPadre(padreNuevo.getApellidoPadre());
        padreViejo.setEdadPadre(padreNuevo.getEdadPadre());
        return padreService.savePadres(padreViejo);
    }

    public void metodoDos(){

    }

    @DeleteMapping("/padres/{id}")
    public void deletePadres(@PathVariable Long id){
        padreService.deletePadre(id);
    }

    private void nueva(){

    }
}
