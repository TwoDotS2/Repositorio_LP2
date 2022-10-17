package imd.ufrn.edu.dominio;

public class Taxi extends Veiculo implements ICarbonFootprint{
    private int quantidadeDePessoas;

    public Taxi(){}

    public Taxi(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    public Taxi(int quilometragemMensal, int quilometrosPorLitro, int quantidadeDePessoas) {
        super(quilometragemMensal, quilometrosPorLitro);
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    @Override
    public double getCarbonFootprint() {
        double carbono = this.getKmMes() * 1.10;
        return carbono;
    }

    //Getters e Setter

    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

}
