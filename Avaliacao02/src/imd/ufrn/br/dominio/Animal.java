package imd.ufrn.br.dominio;

import java.util.Date;

public class Animal {
    private int id;
    private String nome;
    private int peso;
    private boolean alimentado;
    private String alimentacao;

    private Date dataDeNascimento;

    private double totalDeconsumo;

    private double porcetagemDeConsumo;

    public Animal() {
        alimentado = false;
    }

    public Animal(String nome, int peso, String alimentacao) {
        this.nome = nome;
        this.peso = peso;
        this.alimentacao = alimentacao;
        porcetagemDeConsumo = 0.05;
        this.alimentado = false;
    }

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isAlimentado() {
        return alimentado;
    }

    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public double getConsumiu() {
        return totalDeconsumo;
    }

    public void setConsumiu(double consumiu) {
        this.totalDeconsumo += consumiu;
    }

    public double getPorcetagemDeConsumo() {
        return porcetagemDeConsumo;
    }

    protected void setPorcetagemDeConsumo(double porcetagemDeConsumo) {
        this.porcetagemDeConsumo = porcetagemDeConsumo;
    }


    public void comer(){
        alimentado = true;
        totalDeconsumo += (porcetagemDeConsumo * peso);
    }

    public int calcularIdade(Animal a){

        return 0;
    }

    @Override
    public String toString() {
        return "Animal{" +
                ", nome ='" + nome + '\'' +
                ", peso =" + peso +
                ", alimentado =" + alimentado +
                ", alimentacao ='" + alimentacao + '\'' +
                '}';
    }
}
