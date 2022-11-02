package ufrn.imd.edu.br.modelo;

import ufrn.imd.edu.br.modelo.Tributavel;

/**
 * item d)
 */
public class Pessoa implements Tributavel {
    private String nome;
    private double salario;

    private ContaCorrente conta;
    private SeguroVida seguro;

    //Construtores

    public Pessoa() {
        conta = new ContaCorrente();
        seguro = new SeguroVida();
        seguro.setTaxa(31.50);
    }

    public Pessoa(String nome, double salario, ContaCorrente conta, SeguroVida seguro) {
        this.nome = nome;
        this.salario = salario;
        this.conta = conta;
        this.seguro = seguro;

        //Valor padrão da taxa de seguro de vida
        seguro.setTaxa(31.50);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public void setSeguro(SeguroVida seguro) {
        this.seguro = seguro;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public SeguroVida getSeguro() {
        return seguro;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public double calculaTributos() {
        return salario * 0.11;
    }
}
