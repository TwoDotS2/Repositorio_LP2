package imd.ufrn.edu.dominio;

//Item 1
public class Veiculo {
    private int KmMes;

    private int quilometrosPorLitro; //Quantos quilometros o veículo faz com 1 litro de combustível (autonomia por litro)

    public Veiculo() {
    }

    public Veiculo(int KmMes, int quilometrosPorLitro) {
        this.KmMes = KmMes;
        this.quilometrosPorLitro = quilometrosPorLitro;
    }

    public double calcularGastoDeCombustivelMensal(double valorDoCombustivel) {
        // | Tem influência do tipo de combustível tbm |

        //Quanto no mês divido por
        double litrosConsumidos = KmMes/quilometrosPorLitro;

        return litrosConsumidos * valorDoCombustivel;
    }

    //Getters e Setters
    public int getKmMes() {
        return KmMes;
    }

    public void setQuilometragemMensal(int KmMes) {
        this.KmMes = KmMes;
    }

}
