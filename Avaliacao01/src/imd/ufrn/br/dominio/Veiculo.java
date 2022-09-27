package imd.ufrn.br.dominio;

import java.util.Objects;

public class Veiculo {
    private String marca;
    private String placa;
    private double quilometragem;
    private double valorDoAluguel;
    private double quilometragemParatrocaDeOleo;

    private boolean estaAlugado;

    /**
     * Construtor vazio
     */
    public Veiculo() {}

    /**
     * Construtor com todos os atributos da classe
     *
     * @param marca
     * @param placa
     * @param quilometragem
     * @param valorDoAluguel
     */
    public Veiculo(String marca, String placa, double quilometragem, double valorDoAluguel, double quilometragemParatrocaDeOleo, boolean estaAlugado) {
        this.marca = marca;
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.valorDoAluguel = valorDoAluguel;
        this.quilometragemParatrocaDeOleo = quilometragemParatrocaDeOleo;
        this.estaAlugado = estaAlugado;
    }

    /**
     * Getters e Setters dos atributos
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public boolean estaAlugado() {
        return estaAlugado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Double.compare(veiculo.quilometragem, quilometragem) == 0 && Double.compare(veiculo.valorDoAluguel, valorDoAluguel) == 0 && Double.compare(veiculo.quilometragemParatrocaDeOleo, quilometragemParatrocaDeOleo) == 0 && estaAlugado == veiculo.estaAlugado && Objects.equals(marca, veiculo.marca) && Objects.equals(placa, veiculo.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, placa, quilometragem, valorDoAluguel, quilometragemParatrocaDeOleo, estaAlugado);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", quilometragem=" + quilometragem +
                ", valorDoAluguel=" + valorDoAluguel +
                ", quilometragemParatrocaDeOleo=" + quilometragemParatrocaDeOleo +
                ", estaAlugado=" + estaAlugado +
                '}';
    }
}
