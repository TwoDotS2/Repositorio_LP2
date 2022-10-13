package imd.ufrn.br.visao;

import imd.ufrn.br.dominio.Funcionario;
import imd.ufrn.br.dominio.Gerente;
import imd.ufrn.br.dominio.Vendedor;

import java.util.ArrayList;

public class LojaView {

    public static void main(String[] args) {
        ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();
        //Settando o funcionário
        Funcionario f = new Funcionario();
        f.setNome("Jorivaldo");
        f.setTipoDeFuncionario("Engenheiro");
        f.setSalario(4500.00);
//        f.getSalario();

        //Settando o vendedor
        Funcionario v = new Vendedor();
        v.setNome("Robscleibson");
        v.setSalario(1500);
        ((Vendedor) v).setComissao(500);
        ((Vendedor) v).calcularSalario();

        //Settando o gerente
        Funcionario g = new Gerente();
        g.setNome("Jéssica");
        g.setSalario(7500);
        ((Gerente) g).setBonus(2000);
        ((Gerente) g).calcularSalario();

        System.out.println("Salario " + f.getClass());
        System.out.println("Salario " + v.getClass() + "R$ " + v.getSalario());
        System.out.println("Salario " + g.getClass() + "R$ " + g.getSalario());

        //Adicionar na lista de funcionários
        listaDeFuncionarios.add(f);
        listaDeFuncionarios.add(v);
        listaDeFuncionarios.add(g);

        //Testando a instância de f
        for (Funcionario funcionario : listaDeFuncionarios) {
            if (funcionario instanceof Funcionario) {
                System.out.println("-------------------------------");
                System.out.println("\n" + funcionario.getNome() + " é do tipo \"Funcionário\"." + " Seu salário é R$ " + funcionario.getSalario() + ".");
                //Verificar tipo
                if (funcionario instanceof Vendedor) {
                    System.out.println("E também é \"Vendedor\".");
                } else if (funcionario instanceof Gerente) {
                    System.out.println("E também é \"Gerente\".");
                } else {
                    System.out.println("Não é \"Gerente\" nem \"Vendedor\".");
                }
            }
        }
    }
}
