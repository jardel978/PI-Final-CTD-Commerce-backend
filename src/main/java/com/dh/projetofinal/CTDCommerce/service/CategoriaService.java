package com.dh.projetofinal.CTDCommerce.service;

import com.dh.projetofinal.CTDCommerce.entity.Categoria;
import com.dh.projetofinal.CTDCommerce.entity.NomeCategoria;
import com.dh.projetofinal.CTDCommerce.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {


    @Autowired
    private ICategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

}
