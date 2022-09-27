package imd.ufrn.br.visao;

import imd.ufrn.br.dominio.Carro;
import imd.ufrn.br.dominio.Moto;
import imd.ufrn.br.dominio.Repositorio;

public class Localisa {
    public static void main(String[] args) {

        Repositorio repositorio = new Repositorio();
        //Instanciando os carros
        Carro Fiat = new Carro("Fiat", "XXXXXXX", 0, 1500, 30, 2, true);
        Carro Honda = new Carro("Honda", "YYYYYYY", 0, 3500, 60, 4,false);
        Carro Chevrolet = new Carro("Chevrolet", "ZZZZZZZ", 0, 2500, 45, 4,true);
        //testar o método de marca com mais carros
        Carro Honda2 = new Carro("Honda", "YY11111", 10000, 3500, 60, 4, false);

        //Instanciando as motos
        Moto Hyundai = new Moto("Hyundai", "AAAAAAA", 0, 1000, "manual", 500, true);
        Moto Toyota = new Moto("Toyota", "BBBBBBB", 0, 1250, "Elétrica", 650, false);
        Moto Suzuki = new Moto("Suzuki", "CCCCCCC", 5000, 1350, "Elétrica", 620, false);

        //Adicionar veiculos
        repositorio.adicionarVeiculo(Fiat);
        repositorio.adicionarVeiculo(Honda);
        repositorio.adicionarVeiculo(Chevrolet);
        repositorio.adicionarVeiculo(Hyundai);
        repositorio.adicionarVeiculo(Toyota);
        repositorio.adicionarVeiculo(Suzuki);

        //Listar todos os veículos
        repositorio.listarVeiculosCadastrados();

        //c) Exibir os veículos alugados e quanto a LocaLisa receberá pelo aluguel desses
        //veículos; [2,0]


        repositorio.exibirVeiculosAlugados();

        //d) Exibir os veículos disponíveis para aluguel e seus respectivos valores de aluguel,
        //assim como o valor de aluguel mais alto e mais baixo entre os disponíveis; [2,5]
        repositorio.exibirVeiculosDisponiveis();

        //e) Controlar a manutenção dos veículos de acordo com a quilometragem. Caso seja
        //necessário fazer a troca de óleo, as motos usarão 1,5 litro e os carros 3,5 litros. Ao
        //final, liste os veículos que trocaram óleo e a quantidade total de litros de óleo
        //utilizados na manutenção [3,0]
        repositorio.exibirVeiculosDaTrocaDeOleo();
    }
}
