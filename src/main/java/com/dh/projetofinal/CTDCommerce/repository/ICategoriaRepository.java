package com.dh.projetofinal.CTDCommerce.repository;

import com.dh.projetofinal.CTDCommerce.entity.Categoria;
import com.dh.projetofinal.CTDCommerce.entity.NomeCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICategoriaRepository extends JpaRepository<Categoria, Long> {

    @Query
    Categoria findAllByNomeCategoria(NomeCategoria nomeCategoria);

}
