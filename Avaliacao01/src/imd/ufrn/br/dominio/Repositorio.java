package imd.ufrn.br.dominio;

import java.util.ArrayList;
import java.util.List;

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
            System.out.println(v.toString() + "\n");
    }

    // Marca com maior número de carros na LocaLisa
    public String marcaComMaiorNumeroDeCarros(){
        return "";
    }
    // Exibir veículos alugados e quanto a LocaLisa vai faturar
    public void exibirVeiculosAlugados(){
        double totalDeAluguel = 0;
        for (Veiculo v: listaDeVeiculos) {
            //Método para saber se um veículo está alugado
            if (v.estaAlugado()){
                System.out.println("______________________________\n");
                System.out.println(v.toString());
                System.out.println("\n_____________________________");
                // A soma de todos os aluguéis
                totalDeAluguel += v.getValorDoAluguel();
            }
        }
        System.out.println("Total a faturar com aluguéis: R$ " + totalDeAluguel);
    }

    // Exibir veículos disponíveis para aluguel e seus valores(?)
        // concatenando o maior e o menor valor
    public void exibirVeiculosDisponiveis(){
        double maiorAluguel = 0;
        double menorAluguel = 0;

        for (Veiculo v: listaDeVeiculos) {
            //Método para saber se um veículo não está alugado
            if (!v.estaAlugado()){
                System.out.println("______________________________\n");
                System.out.println(v.toString());
                System.out.println("\n_____________________________");

                //Determinar maior valor de aluguel
                if (v.getValorDoAluguel() > maiorAluguel)
                    maiorAluguel = v.getValorDoAluguel();

                //Determinar menor valor de aluguel
                if (v.getValorDoAluguel() < menorAluguel)
                    menorAluguel = v.getValorDoAluguel();
            }
        }

        // Imprimir maior e menor valores de aluguel
        System.out.println("\n_____________________________");
        System.out.println("Menor valor de aluguel: " + menorAluguel);
        System.out.println("Maior valor de aluguel: " + maiorAluguel);
    }

    //Quais veículos trocaram óleo
}
