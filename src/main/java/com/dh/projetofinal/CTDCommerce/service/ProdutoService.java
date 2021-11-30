package com.dh.projetofinal.CTDCommerce.service;

import com.dh.projetofinal.CTDCommerce.entity.Categoria;
import com.dh.projetofinal.CTDCommerce.entity.NomeCategoria;
import com.dh.projetofinal.CTDCommerce.entity.Produto;
import com.dh.projetofinal.CTDCommerce.repository.ICategoriaRepository;
import com.dh.projetofinal.CTDCommerce.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private IProdutoRepository produtoRepository;

    @Autowired
    private ICategoriaRepository categoriaRepository;

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public List<Produto> buscarPorCategoria(NomeCategoria nomeCategoria) {
        try {
            Categoria categoria = categoriaRepository.findAllByNomeCategoria(nomeCategoria);
            return produtoRepository.findAllByCategoria(categoria);
        }catch (RuntimeException e) {
            throw new RuntimeException("Categoria não encontrada.");
        }
    }

}
