package imd.ufrn.br.dominio;

public class Tigre extends Animal{
    private String tipoTigre;

    public Tigre() {
        super.setPorcetagemDeConsumo(0.04);
    }

    public Tigre(String nome, int peso, String alimentacao, String tipoTigre) {
        super(nome, peso, alimentacao);
        super.setPorcetagemDeConsumo(0.04);
        this.tipoTigre = tipoTigre;
    }

    public String getTipoTigre() {
        return tipoTigre;
    }

    public void setTipoTigre(String tipoTigre) {
        this.tipoTigre = tipoTigre;
    }

    @Override
    public void comer(){
        super.setAlimentado(true); //Muda o estado para alimentado
        super.setConsumiu(super.getPorcetagemDeConsumo() * super.getPeso()); //Aumentar o quanto o animal consumiu
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Tigre{" +
                "tipoTigre='" + tipoTigre + '\'' +
                '}';
    }
}
