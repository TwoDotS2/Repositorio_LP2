package br.ufrn.imd.domain;

import br.ufrn.imd.domain.Pessoa;

import java.util.List;

public class Conta {

    public enum localInstrument {
        MANU, DICT, QRDN, QRES, INIC;
    }

    private String numConta;
    private String senha;
    private Pessoa pessoa;
    private double saldo;
    private List<Cartao> cartoes;

    //Construtores
    public Conta() {}

    //Métodos
    //Pagamentos
     public String realizarPagamento(localInstrument local, String senha){
        String code = "";

        if(senha == this.senha){

        }

          return code;
     }

    //Saque
    public void sacarDinheiro(double valorDoSaque, String senha){

    }

    //Consultar saldo
    //get saldo
    

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
}
