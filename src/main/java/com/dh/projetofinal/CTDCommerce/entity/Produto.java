package com.dh.projetofinal.CTDCommerce.entity;

import lombok.*;

import javax.persistence.*;

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

    @Column(name = "produto_titulo")
    private String titulo;

    @Column(name = "produto_preco")
    private Double preco;

    @Column(name = "produto_descricao")
    private String descricao;

    @Column(name = "produto_imagem")
    private String imagem;

    @ManyToOne
    @JoinColumn(name = "categoria_id", foreignKey = @ForeignKey(name = "fk_categoria"))
    private Categoria categoria;

}
