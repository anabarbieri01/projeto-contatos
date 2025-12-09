package com.contatos.product_backend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExclusaoContato {
    @GetMapping("exclusaocontato")
    public String Deletecontato(){
        return ("Exclusão de contato");
    }
    
}
