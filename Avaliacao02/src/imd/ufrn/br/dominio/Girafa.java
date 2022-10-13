package imd.ufrn.br.dominio;

public class Girafa extends Animal{
    private int tamanhoLingua;

    public Girafa() {
        super.setPorcetagemDeConsumo(0.1);
    }

    public Girafa(String nome, int peso, String alimentacao, int tamanhoLingua) {
        super(nome, peso, alimentacao);
        super.setPorcetagemDeConsumo(0.1);
        this.tamanhoLingua = tamanhoLingua;
    }

    public int getTamanhoLingua() {
        return tamanhoLingua;
    }

    public void setTamanhoLingua(int tamanhoLingua) {
        this.tamanhoLingua = tamanhoLingua;
    }

    @Override
    public void comer(){
        super.setAlimentado(true); //Muda o estado para alimentado
        super.setConsumiu(super.getPorcetagemDeConsumo() * super.getPeso()); //Aumentar o quanto o animal consumiu
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"Girafa{" +
                "tamanhoLingua=" + tamanhoLingua +
                '}';
    }
}
