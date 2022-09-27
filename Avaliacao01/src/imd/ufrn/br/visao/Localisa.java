package imd.ufrn.br.visao;

import imd.ufrn.br.dominio.Carro;
import imd.ufrn.br.dominio.Moto;
import imd.ufrn.br.dominio.Repositorio;

public class Localisa {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();
        //Instanciando os carros
        Carro Fiat = new Carro("Fiat", "XXXXXXX", 0, 1500, 30, 2, true);
        Carro Honda = new Carro("Honda", "YYYYYYY", 20000, 3500, 60, 4,false);
        Carro Chevrolet = new Carro("Chevrolet", "ZZZZZZZ", 50000, 2500, 45, 4,true);
        //testar o método de marca com mais carros
        Carro Honda2 = new Carro("Honda", "YY11111", 10000, 3500, 60, 4, false);

        //Instanciando as motos
        Moto Hyundai = new Moto("Hyundai", "AAAAAAA", 13500, 1000, "manual", 500, true);
        Moto Toyota = new Moto("Toyota", "BBBBBBB", 25000, 1250, "Elétrica", 650, false);
        Moto Suzuki = new Moto("Suzuki", "CCCCCCC", 15200, 1350, "Elétrica", 620, false);

        //Adicionar veiculos
        repositorio.adicionarVeiculo(Fiat);
        repositorio.adicionarVeiculo(Honda);
        repositorio.adicionarVeiculo(Chevrolet);
        repositorio.adicionarVeiculo(Hyundai);
        repositorio.adicionarVeiculo(Toyota);
        repositorio.adicionarVeiculo(Suzuki);

        //Listar todos os veículos
        repositorio.listarVeiculosCadastrados();


    }
}
