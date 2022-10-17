package imd.ufrn.edu.visao;

import imd.ufrn.edu.dominio.Carro;
import imd.ufrn.edu.dominio.Moto;
import imd.ufrn.edu.dominio.Taxi;
import imd.ufrn.edu.dominio.Veiculo;
import imd.ufrn.edu.persistencia.Repositorio;

public class EmissaoDeCarbono {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();

        //Duas instancias das classes, com valor atribuido direto no construtor
        Veiculo moto1 = new Moto(1200, 10, 650);
        Veiculo moto2 = new Moto(1400, 14, 700);

        Veiculo carro1 = new Carro(800, 12, 2.1);
        Veiculo carro2 = new Carro(1200, 14, 1.5);

        Veiculo taxi1 = new Taxi(1600, 15, 6);
        Veiculo taxi2 = new Taxi(1800, 16, 8);

        //Adicionando no repositoro
        repositorio.addVeiculo(moto1);
        repositorio.addVeiculo(moto2);
        repositorio.addVeiculo(carro1);
        repositorio.addVeiculo(carro2);
        repositorio.addVeiculo(taxi1);
        repositorio.addVeiculo(taxi2);

        System.out.println("Pegada de carbono dos veículos no repositório:");
        System.out.println("----------------------------------------------------------------");
        for (Veiculo v: repositorio.getListaDeVeiculos()) {
            double carbonFootPrint;

            if (v instanceof Carro){
                carbonFootPrint = Math.round( ((Carro)v).getCarbonFootprint() * 100)/100;
                System.out.println("A pegada de carbono deste Carro é "+ carbonFootPrint + " CO2e");
            }

            if (v instanceof Moto){
                carbonFootPrint = Math.round( ((Moto)v).getCarbonFootprint() * 100)/100;
                System.out.println("A pegada de carbono desta Moto é "+ carbonFootPrint + " CO2e");
            }

            if (v instanceof Taxi){
                carbonFootPrint = Math.round( ((Taxi)v).getCarbonFootprint() * 100)/100;
                System.out.println("A pegada de carbono deste Taxi é "+ carbonFootPrint + " CO2e");
            }
        }
        System.out.println("----------------------------------------------------------------");
    }
}
