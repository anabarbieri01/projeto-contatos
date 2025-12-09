package com.contatos.product_backend.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CriarContato {

    @GetMapping("criarcontato")
    public String postCriarContato(){
        return "Novo Contato";
    }
}
