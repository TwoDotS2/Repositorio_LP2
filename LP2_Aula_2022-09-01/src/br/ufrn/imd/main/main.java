package br.ufrn.imd.main;

import br.ufrn.imd.domain.Pessoa;

import java.util.Scanner;

/* Aula 01
* Hello World!
* */
public class main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Digite o nome da pessoa:");
            p.setNome(scan.nextLine());

            System.out.println("Digite a altura da pessoa:");
            p.setAltura(scan.nextDouble());

            System.out.println("Digite o peso da pessoa:");
            p.setPeso(scan.nextDouble());

            // Função para calcular IMC
            p.calcularIMC();

            System.out.println("Seu IMC é " + String.format("%.2f", p.getIMC()) + " Você está classificado em: " + p.informarIMC());

        } finally {
            scan.close();
        }


    }

}
