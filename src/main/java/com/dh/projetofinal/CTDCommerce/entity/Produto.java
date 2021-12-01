package com.dh.projetofinal.CTDCommerce.entity;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_PRODUTO")
@SequenceGenerator(name = "produto", sequenceName = "SQ_TB_PRODUTO", allocationSize = 1)
public class Produto {

    @Id
    @GeneratedValue(generator = "produto", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "produto_titulo", length = 50)
    @NotNull(message = "Informe o título do produto.")
    private String titulo;

    @Column(name = "produto_preco")
    @NotNull(message = "É necessário informar o preço do produto.")
    @Digits(integer = 8, fraction = 2, message = "Preencha o preço apenas com dígitos.")
    private Double preco;

    @Column(name = "produto_descricao")
    @NotNull(message = "Informe uma descrição para o produto.")
    private String descricao;

    @Column(name = "produto_imagem")
    @NotNull(message = "Uma imagem é obrigatória para o produto.")
    private String imagem;

    @ManyToOne
    @JoinColumn(name = "categoria_id", foreignKey = @ForeignKey(name = "fk_categoria"))
    private Categoria categoria;

}
