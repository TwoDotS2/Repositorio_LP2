package imd.ufrn.edu.dominio;

public class Moto extends Veiculo implements ICarbonFootprint{
    private int cilindradas;

    public Moto(){}

    public Moto(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(int quilometragemMensal, int quilometrosPorLitro, int cilindradas) {
        super(quilometragemMensal, quilometrosPorLitro);
        this.cilindradas = cilindradas;
    }

    @Override
    public double getCarbonFootprint() {
        double carbono = 0;

        //Calcular a pegada de carbono
        if(cilindradas > 650) carbono = this.getKmMes() * 0.65;
        if(cilindradas < 150) carbono = this.getKmMes() * 0.20;
        else carbono = this.getKmMes() * 0.50;

        return carbono;
    }

    //Getters e Setters
    public int getCilindrada() {
        return cilindradas;
    }

    public void setCilindrada(int cilindradas) {
        this.cilindradas = cilindradas;
    }

}
