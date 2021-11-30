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
//@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Autowired
    private IProdutoRepository produtoRepository;


    @Override
    public void run(String... args) throws Exception {

        // Instanciando as categorias
        Categoria eletronicos = Categoria.builder().nomeCategoria(NomeCategoria.ELETRONICOS).build();
        Categoria eletrodomesticos = Categoria.builder().nomeCategoria(NomeCategoria.ELETRODOMESTICOS).build();
        Categoria informatica = Categoria.builder().nomeCategoria(NomeCategoria.INFORMATICA).build();
        Categoria bebe = Categoria.builder().nomeCategoria(NomeCategoria.BEBE).build();
        Categoria esporte = Categoria.builder().nomeCategoria(NomeCategoria.ESPORTE).build();
        Categoria games = Categoria.builder().nomeCategoria(NomeCategoria.GAMES).build();

        Produto ssd = Produto.builder()
                        .titulo("SSD 480Gb")
                        .preco(350.00)
                        .descricao("Disco sólido interno Kingston SA400S37/480G 480GB preto.")
                        .imagem("https://http2.mlstatic.com/D_NQ_NP_767309-MLA46221843905_052021-O.webp")
                        .categoria(informatica).build();

        categoriaRepository.saveAll(Arrays.asList(
                eletronicos,
                eletrodomesticos,
                informatica,
                bebe,
                esporte,
                games
        ));

        // Salvando os produtos
    produtoRepository.save(ssd);

    }
}
