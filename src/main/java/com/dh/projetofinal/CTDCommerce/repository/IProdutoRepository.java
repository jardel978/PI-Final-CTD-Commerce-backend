package com.dh.projetofinal.CTDCommerce.repository;

import com.dh.projetofinal.CTDCommerce.entity.Categoria;
import com.dh.projetofinal.CTDCommerce.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {

    @Query
    List<Produto> findAllByCategoria(Categoria categoria);

}
