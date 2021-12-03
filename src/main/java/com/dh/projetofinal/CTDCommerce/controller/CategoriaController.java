package com.dh.projetofinal.CTDCommerce.controller;

import com.dh.projetofinal.CTDCommerce.entity.Categoria;
import com.dh.projetofinal.CTDCommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/", allowedHeaders = "")
@RestController
@RequestMapping("/produtos/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping
    public List<Categoria> buscarTodos() {

        return categoriaService.buscarTodos();
    }

}
