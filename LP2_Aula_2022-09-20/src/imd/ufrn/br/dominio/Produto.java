package imd.ufrn.br.dominio;

import java.util.Date;
import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;
    private String marca;
    private String descricao;
    private Date dataFabricacao;

    public Produto() {
        preco = 0;
    }

    public Produto(String nome, double preco, String marca, String descricao, Date dataFabricacao) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.descricao = descricao;
        this.dataFabricacao = dataFabricacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.preco, preco) == 0 && Objects.equals(nome, produto.nome) && Objects.equals(marca, produto.marca) && Objects.equals(descricao, produto.descricao) && Objects.equals(dataFabricacao, produto.dataFabricacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, marca, descricao, dataFabricacao);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", marca='" + marca + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataFabricacao=" + dataFabricacao +
                '}';
    }
}
