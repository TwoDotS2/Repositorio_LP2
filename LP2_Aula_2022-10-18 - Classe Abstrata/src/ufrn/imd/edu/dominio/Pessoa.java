package ufrn.imd.edu.dominio;

import java.text.SimpleDateFormat;
import java.util.Date;

//Falta a parte com calendar/date format

public abstract class Pessoa {
    private static final SimpleDateFormat DDmmAAAA = new SimpleDateFormat("dd/MM/yyyy");

    protected String nome;
    protected Date dataNascimento;
    protected double peso;
    protected double altura;

    public abstract String calcularIMC(double peso, double altura);

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {

        return  "Nome: " + nome + "\n" +
                "Data de Nascimento: " + DDmmAAAA.format(dataNascimento)  + "\n" +
                "Peso: " + peso + "\n" +
                "Altura: " + altura + "\n";
    }
}
