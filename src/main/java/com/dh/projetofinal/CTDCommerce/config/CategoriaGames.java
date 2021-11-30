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
public class CategoriaGames implements CommandLineRunner {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Autowired
    private IProdutoRepository produtoRepository;


    @Override
    public void run(String... args) throws Exception {

        Categoria games = Categoria.builder().nomeCategoria(NomeCategoria.GAMES).build();
        categoriaRepository.save(games);

        Produto ps4 = Produto.builder()
                .titulo("Sony PlayStation 4 500GB")
                .preco(4490.00)
                .descricao("Com seu console PlayStation 4 você terá entretenimento garantido todos os dias")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_2X_999927-MLA40671537353_022020-F.webp")
                .categoria(games).build();

        Produto controleps4 = Produto.builder()
                .titulo("Controle PlayStation 4")
                .preco(200.00)
                .descricao("Controle Compatível Com Ps4 Manete Sem Fio")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_674054-MLB46976103294_082021-O.webp")
                .categoria(games).build();

        Produto jogogtaV = Produto.builder()
                .titulo("GTA V para PS4")
                .preco(169.00)
                .descricao("Grand Theft Auto V Incluso Mapa Mídia Física")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_2X_688944-MLB43960644148_102020-F.webp")
                .categoria(games).build();

        Produto jogothelast = Produto.builder()
                .titulo("The Last of Us Part II PS4")
                .preco(129.00)
                .descricao("Com este jogo The Last of Us, você desfrutará de horas de diversão e novos desafios que lhe permitirão melhorar como jogador.")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_780373-MLA43441025403_092020-O.webp")
                .categoria(games).build();

        Produto jogospider = Produto.builder()
                .titulo("Marvel Spider-Man PS4")
                .preco(135.00)
                .descricao("Com este jogo Homem-Aranha, você desfrutará de horas de diversão e novos desafios que lhe permitirão melhorar como jogador.")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_2X_663372-MLA43440081326_092020-F.webp")
                .categoria(games).build();


        // Salvando os produtos
        produtoRepository.saveAll(Arrays.asList(
                ps4,
                controleps4,
                jogogtaV,
                jogothelast,
                jogospider
        ));

    }
}

