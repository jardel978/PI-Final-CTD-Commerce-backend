package com.dh.projetofinal.CTDCommerce.controller;

import com.dh.projetofinal.CTDCommerce.entity.Produto;
import com.dh.projetofinal.CTDCommerce.entity.NomeCategoria;
import com.dh.projetofinal.CTDCommerce.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> buscarTodos() {
        return produtoService.buscarTodos();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto buscarPorId(@PathVariable Long id) {
        return produtoService.buscarPorId(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado."));
    }

    @GetMapping("/categoria/{nomeCategoria}")
    public ResponseEntity<List<Produto>> buscarPorCategoria(@PathVariable("nomeCategoria") NomeCategoria nomeCategoria) {
        ResponseEntity<List<Produto>> responseEntity = null;
        if (nomeCategoria != null) {
            responseEntity = ResponseEntity.status(HttpStatus.NO_CONTENT).body(produtoService.buscarPorCategoria(nomeCategoria));
        } else {
            responseEntity = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return responseEntity;
    }
}

