package imd.ufrn.br.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Deposito {
    private ArrayList<Produto> listaDeProdutos;

    public Deposito(){
        listaDeProdutos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto){
        listaDeProdutos.add(produto);
    }

    public void removerProduto(Produto produto){
        listaDeProdutos.remove(produto);
    }

    public int informarQuantidadeDeProdutos() {
        return listaDeProdutos.size();
    }

    public boolean estaVazio() {
        return listaDeProdutos.isEmpty();
    }

    public ArrayList<Produto> listarProdutos(){
        return listaDeProdutos;
    }

    public Produto informarProdutoMaisCaro(){
        Produto max = new Produto();

        //Percorre a lista de produtos
        for(Produto n: listaDeProdutos){
            //Se for a primeira execução, max tem valor zero
            if (max.getPreco() == 0)
                max = n;
            else if (n.getPreco() > max.getPreco()) {
                max = n;
            }
        }
        return max;
    }
}
