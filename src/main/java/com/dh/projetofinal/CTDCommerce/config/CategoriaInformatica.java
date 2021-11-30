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
public class CategoriaInformatica implements CommandLineRunner {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Autowired
    private IProdutoRepository produtoRepository;


    @Override
    public void run(String... args) throws Exception {

        Categoria informatica = Categoria.builder().nomeCategoria(NomeCategoria.INFORMATICA).build();
        categoriaRepository.save(informatica);

        Produto ssd = Produto.builder()
                .titulo("SSD 480Gb")
                .preco(350.00)
                .descricao("Disco sólido interno Kingston SA400S37/480G 480GB preto.")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_767309-MLA46221843905_052021-O.webp")
                .categoria(informatica).build();


        // Salvando os produtos
        produtoRepository.saveAll(Arrays.asList(
                ssd
        ));

    }
}
