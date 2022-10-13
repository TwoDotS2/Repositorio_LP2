package imd.ufrn.br.dominio;

public class Elefante extends Animal{
    private int tamanhoTromba;

    public Elefante(String nome, int peso, String alimentacao, int tamanhoTromba) {
        super(nome, peso, alimentacao);
        super.setPorcetagemDeConsumo(0.15);
        this.tamanhoTromba = tamanhoTromba;
    }

    public Elefante() {
        super.setPorcetagemDeConsumo(0.15);
    }

    public int getTamanhoTromba() {
        return tamanhoTromba;
    }

    public void setTamanhoTromba(int tamanhoTromba) {
        this.tamanhoTromba = tamanhoTromba;
    }

    @Override
    public void comer(){
        super.setAlimentado(true); //Muda o estado para alimentado
        super.setConsumiu(super.getPorcetagemDeConsumo() * super.getPeso()); //Aumentar o quanto o animal consumiu
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Elefante{" +
                "tamanhoTromba=" + tamanhoTromba +
                '}';
    }
}
