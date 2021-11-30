package com.dh.projetofinal.CTDCommerce.service;

import com.dh.projetofinal.CTDCommerce.entity.Produto;
import com.dh.projetofinal.CTDCommerce.entity.NomeCategoria;
import com.dh.projetofinal.CTDCommerce.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private IProdutoRepository produtoRepository;

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public List<Produto> buscarPorCategoria(NomeCategoria nomeCategoria) {

        try {
            return produtoRepository.findAllByCategoria(nomeCategoria);
        }catch (RuntimeException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro no service.");
        }
    }

}
