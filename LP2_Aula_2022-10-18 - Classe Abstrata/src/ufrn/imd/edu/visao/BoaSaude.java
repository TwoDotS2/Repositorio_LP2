package ufrn.imd.edu.visao;

import ufrn.imd.edu.dominio.Homem;
import ufrn.imd.edu.dominio.Mulher;
import ufrn.imd.edu.dominio.Pessoa;
import ufrn.imd.edu.persistencia.Repositorio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BoaSaude {
    public static void main(String[] args) {

        //Instanciando mulher
        Pessoa m1 = new Mulher();

        //Instanciando homem
        Pessoa h1 = new Homem();

        Calendar myCal = Calendar.getInstance();
        myCal.set(Calendar.YEAR, 1907);
        myCal.set(Calendar.MONTH, 06);
        myCal.set(Calendar.DAY_OF_MONTH, 06);
        Date nascimentoFrida = myCal.getTime();

        //Atribuindo valores para m1
        m1.setNome("Frida Khalo");
        m1.setPeso(50.2);
        m1.setAltura(1.69);
        m1.setDataNascimento(nascimentoFrida);

        // Atribuindo valores para h1
        h1.setNome("Zé Lezin");
        h1.setPeso(74.8);
        h1.setAltura(1.75);

        myCal = Calendar.getInstance();
        myCal.set(Calendar.YEAR, 1945);
        myCal.set(Calendar.MONTH, 00);
        myCal.set(Calendar.DAY_OF_MONTH, 20);
        Date nascimentoZeLezin = myCal.getTime();

        h1.setDataNascimento(nascimentoZeLezin);

        Date date = new Date();

        //Repositorio para os dados do programa
        Repositorio repositorio = new Repositorio();

        //Adicionando as pessoas ao repositorio
        repositorio.addPessoa(m1);
        repositorio.addPessoa(h1);

        for (Pessoa p: repositorio.getListaDePessoas()) {
            System.out.println("-------------------------------------------------");
            System.out.print(p.toString());
            System.out.println("IMC: " + p.calcularIMC(p.getPeso(), p.getAltura()));
        }

        System.out.println("-------------------------------------------------");

    }
}
