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
public class CategoriaEletrodomesticos implements CommandLineRunner {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Autowired
    private IProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria eletrodomesticos = Categoria.builder().nomeCategoria(NomeCategoria.ELETRODOMESTICOS).build();
//       Salvando categoria
        categoriaRepository.save(eletrodomesticos);

        Produto ventilador = Produto.builder()
                .titulo("Ventilador de mesa Mondial")
                .preco(186.00)
                .descricao("VTX-40-8P turbo preto com 8 pás cor prata, 40cm de diâmetro 127V")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_619657-MLA43249276651_082020-O.webp")
                .categoria(eletrodomesticos).build();

        Produto maquinaDeLavar = Produto.builder()
                .titulo("Máquina de lavar automática Electrolux")
                .preco(1524.00)
                .descricao("Essencial Care LES11 branca 11kg 127V")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_798413-MLA43117842453_082020-O.webp")
                .categoria(eletrodomesticos).build();

        Produto fogao = Produto.builder()
                .titulo("Fogão de piso Brastemp")
                .preco(1399.00)
                .descricao("BFO4N gás engarrafado 4 queimadores inox 127V/220V porta com visor 61.5L")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_933744-MLA40243078530_122019-O.webp")
                .categoria(eletrodomesticos).build();

        Produto geladeira = Produto.builder()
                .titulo("Geladeira Frost Free Brastremp")
                .preco(3034.00)
                .descricao("BRM44H Inox com freezer 375L 127V")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_746986-MLA40411785738_012020-O.webp")
                .categoria(eletrodomesticos).build();

        Produto aspirador = Produto.builder()
                .titulo("Robô Aspirador passa pano")
                .preco(2557.00)
                .descricao("Xiaomi Mi Robot Vacuum-Mop P preto 100V/240V")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_644877-MLA46033029103_052021-O.webp")
                .categoria(eletrodomesticos).build();

//        Salvando os produtos
        produtoRepository.saveAll(Arrays.asList(
                ventilador,
                maquinaDeLavar,
                fogao,
                geladeira,
                aspirador
        ));
    }
}
