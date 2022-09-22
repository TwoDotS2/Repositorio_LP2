package imd.ufrn.br.dominio;

import java.util.Date;

public class LojaView {

    public static void main(String[] args) {
        ProdutoDuravel carro, livro, celular;
        ProdutoNaoDuravel chocolate, toalha, sabonete;

        //Produtos durávelis
        carro = new ProdutoDuravel("Celta", 20000, "Chevrolet", "Carro Popular", new Date(2022, 9, 22), 8);
        livro = new ProdutoDuravel("Crime e Castigo", 90, "Martin Claret", "Romance Russo", new Date(2022, 9, 22), 0);
        celular = new ProdutoDuravel("Redmi Note 11", 1300, "Xiaomi", "Celular importado", new Date(2022, 9, 22), 0);

        //Produtos não duráveis
        chocolate = new ProdutoNaoDuravel("Chocolate", 7, "Garoto", "Chocolate de amendoim e leite", new Date(2022, 9, 22), new Date(2023, 9, 22), "Alimentício");
        toalha = new ProdutoNaoDuravel("Toalha", 20001, "TecidosS&A", "Toalha de algodão", new Date(2022, 9, 22), new Date(2023, 9, 22), "Vestuário");
        sabonete = new ProdutoNaoDuravel("Sabonete", 5, "Febo", "Sabonete de glicerina", new Date(2022, 9, 22), new Date(2023, 9, 22), "Higiene pessoal");

        Deposito deposito = new Deposito();

        //Adição dos duráveis
        deposito.adicionarProduto(carro);
        deposito.adicionarProduto(livro);
        deposito.adicionarProduto(celular);

        //Adição dos não duráveis
        deposito.adicionarProduto(chocolate);
        deposito.adicionarProduto(toalha);
        deposito.adicionarProduto(sabonete);

        //Teste de informar total de produtos
        System.out.println("Quantidade de produtos no depósito: " + deposito.informarQuantidadeDeProdutos());

        //Teste de remoção de produto
        deposito.removerProduto(sabonete);
        System.out.println("Sabonete removido. Produtos: " + deposito.informarQuantidadeDeProdutos());

        //Testar função de depósito está vazio
        if(deposito.estaVazio())
            System.out.println("Deposito Vazio.");
        else
            System.out.println("Deposito Não Está Vazio.");

        //Testar função de produto mais caro
        Produto max = deposito.informarProdutoMaisCaro();
        System.out.println(max.toString());

    }
}
