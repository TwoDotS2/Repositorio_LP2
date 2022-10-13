package imd.ufrn.br.dominio;

import java.util.Date;

public class ProdutoNaoDuravel extends Produto{
    private Date dataDeValidade;
    private String genero;

    public ProdutoNaoDuravel() {}

    public ProdutoNaoDuravel(String nome, double preco, String marca, String descricao, Date dataFabricacao, Date dataDeValidade, String genero) {
        super(nome, preco, marca, descricao, dataFabricacao);
        this.dataDeValidade = dataDeValidade;
        this.genero = genero;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
