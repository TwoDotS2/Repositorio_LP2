package br.ufrn.imd.domain;

import com.sun.swing.internal.plaf.synth.resources.synth_sv;

import static java.lang.Math.pow;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    private double IMC;

    public Pessoa() { }

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public double getIMC() {
        return IMC;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularIMC(){
        IMC = peso/Math.pow(altura,2);
        return IMC;
    }

    public String informarIMC(){
        String str = "";

        if ( IMC < 18.5) str = "Abaixo do peso" ;
        if ( IMC >= 18.5 && IMC <= 24.9) str = "Peso normal";
        if ( IMC >= 25 && IMC <= 29.9) str = "Pré-obesidade";
        if ( IMC >= 30 && IMC <= 34.9) str = "Obesidade Grau 1";
        if ( IMC >= 35 && IMC <= 39.9) str = "Obesidade Grau 2";
        if ( IMC >= 40 ) str = "Obesidade Grau 3";

        return str;
    }


    @Override
    public String toString() {
        return nome;
    }
}


