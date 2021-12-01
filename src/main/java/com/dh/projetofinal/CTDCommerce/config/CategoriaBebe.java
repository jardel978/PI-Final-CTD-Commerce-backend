package com.dh.projetofinal.CTDCommerce.config;

import com.dh.projetofinal.CTDCommerce.entity.Categoria;
import com.dh.projetofinal.CTDCommerce.entity.NomeCategoria;
import com.dh.projetofinal.CTDCommerce.entity.Produto;
import com.dh.projetofinal.CTDCommerce.repository.ICategoriaRepository;
import com.dh.projetofinal.CTDCommerce.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class CategoriaBebe implements CommandLineRunner {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Autowired
    private IProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria bebe = Categoria.builder().nomeCategoria(NomeCategoria.BEBE).build();
//       Salvando categoria
        categoriaRepository.save(bebe);

        Produto carrinho = Produto.builder()
                .titulo("Carrinho estilo guarda chuva")
                .preco(336.00)
                .descricao("Carrinho estilo guarda chuva Multikids Baby Pocket cinza com chassi de cor prateado")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_804047-MLA46076253588_052021-W.webp")
                .categoria(bebe).build();

        Produto macacaoInfantil = Produto.builder()
                .titulo("Macacao Infantil")
                .preco(94.90)
                .descricao("Macacão Infantil Bebê 100% Algodão Liso - 1 Ao 3 - Kit Com 6")
                .imagem("https://http2.mlstatic.com/D_Q_NP_840594-MLB43624022844_092020-R.webp")
                .categoria(bebe).build();

        Produto triciclo = Produto.builder()
                .titulo("Triciclo")
                .preco(139.00)
                .descricao("Totoka Triciclo Infantil Bebe Carrinho Totokinha Menino Azul")
                .imagem("https://http2.mlstatic.com/D_Q_NP_989573-MLB45841101632_052021-R.webp")
                .categoria(bebe).build();

        Produto bombaTiraLeite = Produto.builder()
                .titulo("Bomba Tira Leite")
                .preco(129.00)
                .descricao("Bomba Tira-leite Materno Elétrica Compact Automática G-tech")
                .imagem("https://http2.mlstatic.com/D_Q_NP_790277-MLA43001525325_082020-P.webp")
                .categoria(bebe).build();

        Produto cadeirinhaParaCarro = Produto.builder()
                .titulo("Cadeira Infantil")
                .preco(923.00)
                .descricao("Cadeira infantil para carro Fisher-Price All-Stages Fix 2.0 cinza.")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_890208-MLA43425526686_092020-W.webp")
                .categoria(bebe).build();

//        Salvando os produtos
        produtoRepository.saveAll(Arrays.asList(
                carrinho,
                macacaoInfantil,
                triciclo,
                bombaTiraLeite,
                cadeirinhaParaCarro
        ));
    }
}
