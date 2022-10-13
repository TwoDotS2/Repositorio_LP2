package br.ufrn.imd.domain;

import br.ufrn.imd.domain.Pessoa;

import java.util.List;

public abstract class Conta implements ContaInterface{

    private String numConta;
    private String senha;
    private Pessoa pessoa;
    private double saldo;
    private List<Cartao> cartoes;

    //Construtores

     public String realizarPagamento(String senha){
        String code = "";
        if(senha == this.senha){
        }
          return code;
     }
    //Saque
    public void sacar(double valor){
        saldo -= valor;
    }

    //Consultar saldo
    public void depositar(double valor){
        saldo += valor;
    }
    

    //Getters e Setters
    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<Cartao> cartoes) {
        this.cartoes = cartoes;
    }

    public abstract void imprimeExtrato();
}
