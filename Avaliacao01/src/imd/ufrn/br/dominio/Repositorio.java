package imd.ufrn.br.dominio;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.ceil;

public class Repositorio {
    private List<Veiculo> listaDeVeiculos;

    public Repositorio() {
        this.listaDeVeiculos = new ArrayList<Veiculo>();
    }

    //Adicionar veiculo
    public void adicionarVeiculo(Veiculo v){
        listaDeVeiculos.add(v);
    }

    // Listar todos os listars cadastrados
    public void listarVeiculosCadastrados(){
        for (Veiculo v: listaDeVeiculos)
            System.out.println(v.getMarca());
    }

    // Marca com maior número de carros na LocaLisa
    public String marcaComMaiorNumeroDeCarros(){
        return "";
    }
    // Exibir veículos alugados e quanto a LocaLisa vai faturar
    public void exibirVeiculosAlugados(){
        System.out.println("Veiculos Alugados");

        double totalDeAluguel = 0;
        for (Veiculo v: listaDeVeiculos) {
            //Método para saber se um veículo está alugado
            if (v.estaAlugado()){
                System.out.println("______________________________\n");
                System.out.println(v.toString());
                // A soma de todos os aluguéis
                totalDeAluguel += v.getValorDoAluguel();
            }
        }
        System.out.println("\n\nTotal a faturar com aluguéis: R$ " + totalDeAluguel);
    }

    // Exibir veículos disponíveis para aluguel e seus valores(?)
        // concatenando o maior e o menor valor
    public void exibirVeiculosDisponiveis(){
        double maiorAluguel = 0;
        double menorAluguel = 0;

        System.out.println("Veiculos Disponíveis");

        for (Veiculo v: listaDeVeiculos) {
            //Método para saber se um veículo não está alugado
            if (!v.estaAlugado()){
                System.out.println("______________________________\n");
                System.out.println(v.toString());

                //Determinar maior valor de aluguel
                if (v.getValorDoAluguel() > maiorAluguel)
                    maiorAluguel = v.getValorDoAluguel();

                //Determinar menor valor de aluguel
                if (menorAluguel == 0)
                    menorAluguel = v.getValorDoAluguel();

                else if (v.getValorDoAluguel() < menorAluguel)
                    menorAluguel = v.getValorDoAluguel();

            }
        }

        // Imprimir maior e menor valores de aluguel
        System.out.println("\n_____________________________");
        System.out.println("Menor valor de aluguel: " + menorAluguel);
        System.out.println("Maior valor de aluguel: " + maiorAluguel);
    }

    //Troca de óleo
    public void exibirVeiculosDaTrocaDeOleo(){
        double litrosDeMoto = 1.5;
        double litrosDeCarro = 3.5;
        double quantidadeDeLitrosDeOleo = 0, totalDeTrocas;
        ArrayList<Veiculo> trocaramOleo = new ArrayList<Veiculo>();


        for (Veiculo v: listaDeVeiculos
             ) {
            //se a quilometragem atual é maior que a necessária para a troca
            if (v.getQuilometragem() >= v.getQuilometragemParatrocaDeOleo()) {
                //Adicionar veiculo da troca
                trocaramOleo.add(v);
                totalDeTrocas = ceil(v.getQuilometragem() / v.getQuilometragemParatrocaDeOleo());

                //Se o veículo for do tipo moto
                if (v instanceof Moto)
                   quantidadeDeLitrosDeOleo += totalDeTrocas * litrosDeMoto;

                //Se for o veículo for do tipo carro
                if (v instanceof Carro)
                    quantidadeDeLitrosDeOleo += totalDeTrocas * litrosDeCarro;
            }

        }
        System.out.println("Trocaram de Óleo:");

        for (Veiculo v: trocaramOleo
             ) {
            System.out.println("_____________________________");
            System.out.println(v.toString());
        }

        System.out.println("Quantidade Total de Óleo Utilizada: "+ quantidadeDeLitrosDeOleo);
    }
}
