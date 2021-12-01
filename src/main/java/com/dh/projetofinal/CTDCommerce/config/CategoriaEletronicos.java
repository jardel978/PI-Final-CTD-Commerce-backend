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
public class CategoriaEletronicos implements CommandLineRunner {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Autowired
    private IProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria eletronicos = Categoria.builder().nomeCategoria(NomeCategoria.ELETRONICOS).build();
//        Salvando categoria
        categoriaRepository.save(eletronicos);

        Produto iphone12 = Produto.builder()
                .titulo("iPhone 12 Apple (128GB) Preto")
                .preco(5199.00)
                .descricao("Sistema Operacional OS, 5G, Tela de 6,1 5G e Câmera Dupla de 12 MP.")
                .imagem("https://www.fastshop.com.br/wcsstore/FastShopCAS/imagens/_AE_Apple/AEMGJA3BRAPTO/AEMGJA3BRAPTO_PRD_1500_1.jpg")
                .categoria(eletronicos).build();

        Produto samsungs21 = Produto.builder()
                .titulo("Samsung Galaxy S21 Cinza")
                .preco(3699.00)
                .descricao("Samsung Galaxy S21 Cinza, com Tela Infinita de 6,2”, 5G, 128GB, Câmera Tripla de 12MP+64MP+12MP")
                .imagem("https://www.fastshop.com.br/wcsstore/FastShopCAS/imagens/_CL_Celular/SGSMG991ZACNZ/SGSMG991ZACNZ_PRD_1500_1.jpg")
                .categoria(eletronicos).build();

        Produto motog100 = Produto.builder()
                .titulo("Smartphone Moto G100 ")
                .preco(3499.00)
                .descricao("Smartphone Moto G100 Luminous Ocean, com Tela 6,7 5G, 256GB e Câmera Quádrupla de 64 " +
                        "MP+16 MP+2 MP")
                .imagem("https://www.fastshop.com.br/wcsstore/FastShopCAS/imagens/_CL_Celular/MRXT21254OCE/MRXT21254OCE_PRD_1500_1.jpg")
                .categoria(eletronicos).build();

        Produto asuszenfone = Produto.builder()
                .titulo("Smartphone ASUS Zenfone Max Pro")
                .preco(1699.00)
                .descricao("Smartphone ASUS Zenfone Max Pro (M2) Snapdragon SDM660 6GB 64GB 6,26 Titanium")
                .imagem("https://images.kabum.com.br/produtos/fotos/158869/smartphone-asus-zenfone-max-pro-m2-64gb-6gb-ram-snapdragon-camera-12mp-black-saphire-zb631kl-4d094br_1627562523_gg.jpg")
                .categoria(eletronicos).build();

        Produto xiaomi = Produto.builder()
                .titulo("SMARTPHONE XIAOMI REDMI 9A")
                .preco(1299.00)
                .descricao("SMARTPHONE XIAOMI REDMI 9A TELA 6,53 2GB/32GB 4G")
                .imagem("https://www.fastshop.com.br/wcsstore/FastShopCAS/Marketplace/o2%20planilha/6869198362/6869198362_PRD_1500_1.jpg")
                .categoria(eletronicos).build();

//        Salvando os produtos
        produtoRepository.saveAll(Arrays.asList(
                iphone12,
                samsungs21,
                motog100,
                asuszenfone,
                xiaomi
        ));
    }
}
