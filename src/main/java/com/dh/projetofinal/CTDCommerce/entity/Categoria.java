package com.dh.projetofinal.CTDCommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_CATEGORIA")
@SequenceGenerator(name = "categoria", sequenceName = "SQ_TB_CATEGORIA", allocationSize = 1)
public class Categoria {

    @Id
    @GeneratedValue(generator = "categoria", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "categoria_nome", length = 50)
    @NotNull(message = "Informe o nome da categoria.")
    @Enumerated(value = EnumType.STRING)
    private NomeCategoria nomeCategoria;

    @OneToMany(mappedBy = "categoria")
    @JsonIgnore
    private Set<Produto> produtos = new HashSet<>();

}
