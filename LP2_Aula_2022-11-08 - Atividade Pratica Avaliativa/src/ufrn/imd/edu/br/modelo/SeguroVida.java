package ufrn.imd.edu.br.modelo;

import ufrn.imd.edu.br.modelo.Tributavel;

/**
 * item c)
 */
public class SeguroVida implements Tributavel {
    private int numero;
    private String beneficiado;
    private double valor;
    private double taxa;

    public SeguroVida() {}

    public SeguroVida(int numero, String beneficiado, double valor) {
        this.numero = numero;
        this.beneficiado = beneficiado;
        this.valor = valor;
    }

    //Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBeneficiado() {
        return beneficiado;
    }

    public void setBeneficiado(String beneficiado) {
        this.beneficiado = beneficiado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "SeguroVida{" +
                "numero=" + numero +
                ", beneficiado='" + beneficiado + '\'' +
                ", valor=" + valor +
                ", taxa=" + taxa +
                '}';
    }

    /**
     * item e) 2)
     */
    @Override
    public double calculaTributos() {
        return taxa;
    }
}
