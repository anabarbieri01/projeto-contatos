package com.contatos.product_backend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListaContatos {
    
    @GetMapping("listacontatos")
    public String GetListaContatos(){
        return "Lista de Contatos";
    }
}
