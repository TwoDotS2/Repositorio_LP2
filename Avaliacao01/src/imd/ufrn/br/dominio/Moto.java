package imd.ufrn.br.dominio;

import java.util.Objects;

public class Moto extends Veiculo{
    private String tipoDaPartida;
    private double cilindradas;

    public Moto() {
    }

    public Moto(String tipoDaPartida, double cilindradas) {
        this.tipoDaPartida = tipoDaPartida;
        this.cilindradas = cilindradas;
    }

    public Moto(String marca, String placa, double quilometragem, double valorDoAluguel, String tipoDaPartida, double cilindradas, boolean estaAlugado) {
        super(marca, placa, quilometragem, valorDoAluguel, 5000, estaAlugado);
        this.tipoDaPartida = tipoDaPartida;
        this.cilindradas = cilindradas;
    }

    public String getTipoDaPartida() {
        return tipoDaPartida;
    }

    public void setTipoDaPartida(String tipoDaPartida) {
        this.tipoDaPartida = tipoDaPartida;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nMoto{" +
                "tipoDaPartida='" + tipoDaPartida + '\'' +
                ", cilindradas=" + cilindradas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moto moto = (Moto) o;
        return Double.compare(moto.cilindradas, cilindradas) == 0 && Objects.equals(tipoDaPartida, moto.tipoDaPartida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoDaPartida, cilindradas);
    }
}
