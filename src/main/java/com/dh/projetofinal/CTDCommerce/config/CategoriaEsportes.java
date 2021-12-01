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
public class CategoriaEsportes implements CommandLineRunner {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Autowired
    private IProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria esporte = Categoria.builder().nomeCategoria(NomeCategoria.ESPORTE).build();
//       Salvando categoria
        categoriaRepository.save(esporte);

        Produto bike = Produto.builder()
                .titulo("Mountain bike Sutton New aro 29 19 24v")
                        .preco(2140.00)
                        .descricao("Possui freios de disco hidráulico, câmbio Shimano y Shimano Altus, cor preto/vermelho")
                        .imagem("https://http2.mlstatic.com/D_NQ_NP_816555-MLA46868309993_072021-O.webp")
                        .categoria(esporte).build();

        Produto musculacao = Produto.builder()
                .titulo("Estação De Musculação")
                .preco(2150.00)
                .descricao("Melhor custo x benefício do mercado! Exercita e tonifica seus músculos com o peso de até 45kg.")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_998434-MLB44642179199_012021-O.webp")
                .categoria(esporte).build();

        Produto corda = Produto.builder()
                .titulo("Corda para treino - Fit Bulldozer")
                .preco(30.00)
                .descricao("Corda ajustável de 3m para treino, material PVC")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_762029-MLB44786452434_022021-O.webp")
                .categoria(esporte).build();

        Produto suplemento = Produto.builder()
                .titulo("Whey Protein Concentrado Growth")
                .preco(150.00)
                .descricao("O Whey Protein Growth ajuda na recuperação da fibra muscular depois do seu treino. Rico em aminoácidos essenciais e vitaminas.")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_640330-MLB48293758543_112021-O.webp")
                .categoria(esporte).build();

        Produto barra = Produto.builder()
                .titulo("Whey Grego Bar Cx 12un (480g)")
                .preco(55.00)
                .descricao("Grego Bar é prática, nutricionalmente balanceada e pode ser usada como lanches intermediários.")
                .imagem("https://http2.mlstatic.com/D_NQ_NP_898426-MLB41374089836_042020-O.webp")
                .categoria(esporte).build();

//        Salvando os produtos
        produtoRepository.saveAll(Arrays.asList(
                bike,
                musculacao,
                corda,
                suplemento,
                barra
        ));
    }
}
