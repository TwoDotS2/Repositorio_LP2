package imd.ufrn.edu.dominio;

public class Carro extends Veiculo implements ICarbonFootprint{
    private double motor;

    public Carro() {}

    public Carro(double motor) {
        this.motor = motor;
    }

    public Carro(int KmMes, int quilometrosPorLitro, double motor) {
        super(KmMes, quilometrosPorLitro);
        this.motor = motor;
    }

    @Override
    public double getCarbonFootprint() {
        double carbono = 0;

        //Calcular a pegada de carbono
        if(motor > 2.0) carbono = this.getKmMes() * 1.85;
        else if(motor < 1.0) carbono = this.getKmMes() * 0.13;
        else carbono = this.getKmMes() * 1.22;

        return carbono;
    }

    //Getters e Setters
    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

}
