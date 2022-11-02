package ufrn.imd.edu.br.dao;

import ufrn.imd.edu.br.controle.GeradorImpostoRenda;
import ufrn.imd.edu.br.modelo.ContaCorrente;
import ufrn.imd.edu.br.modelo.Pessoa;
import ufrn.imd.edu.br.modelo.SeguroVida;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * item f)
 */

public class PessoaDAO {
    private List<Pessoa> listaDePessoas;
    private GeradorImpostoRenda geradorImpostoRenda;
    private DecimalFormat df;
    public PessoaDAO() {
        geradorImpostoRenda = new GeradorImpostoRenda();
        df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
    }

    /**
     * item f) 1)
     */
    public void cadastraPessoa(Pessoa p){
        if (listaDePessoas == null)
            listaDePessoas = new ArrayList<Pessoa>();

       //Adicionar pessoa
        listaDePessoas.add(p);
    }

    /**
     * item f) 2)
     */
    public void removePessoa(Pessoa p){
        listaDePessoas.remove(p);
    }

    /**
     * item f) 3)
     */
    public void exibaListaDePessoas(){
        for (Pessoa p: listaDePessoas) {
            //Salvar a conta corrente e o seguro de vida
            ContaCorrente cc = p.getConta();
            SeguroVida sv = p.getSeguro();

            //Exibir informações das pessoas
            System.out.println("****************************************************************");
            System.out.println("Nome...: " + p.getNome() + "\tSalário.: " + df.format(p.getSalario()));
            System.out.println("Agência: " + cc.getAgencia() + "\tConta.: " + cc.getNumero() + "\tSaldo.: " + df.format(cc.getSaldo()));
            System.out.println("Seguro.: " + sv.getNumero() + "\tBeneficiário.: " + sv.getBeneficiado());
            System.out.println("Valor Seguro: " + df.format(sv.getValor()));
            System.out.println("****************************************************************");
            System.out.println();

        }
    }

    /**
     * item f) 4)
     */
    public void calcularTributosPessoas(){
        for (Pessoa p: listaDePessoas) {
            //Salvar a conta corrente e o seguro de vida
            ContaCorrente cc = p.getConta();
            SeguroVida sv = p.getSeguro();

            //Calcular Imposto de Renda
            double IRPF = geradorImpostoRenda.calculaValorTotalTributo(p);

            //Exibir informações das pessoas
            System.out.println("****************************************************************");
            System.out.println("Nome...: " + p.getNome() + "\tIRPF.: " + df.format(IRPF));
            System.out.println("****************************************************************");
            System.out.println();

        }
    }

    /**
     * item f) 5)
     */
    public void imprimeImpostoTotal(){

        /** Dados a serem impressos:
         *
         * 1 - O valor total de imposto a ser recolhido,
         * 2 - o nome da pessoa que pagará o maior imposto e
         * 3- o nome do beneficiado com o maior valor de seguro
         */

        Pessoa pessoaMaiorImposto = null;
        double maiorImposto = 0;

        SeguroVida beneficiarioMaiorSeguro = null;

        double IRPFtotal = 0;
        for (Pessoa p: listaDePessoas) {
            //Salvar a conta corrente e o seguro de vida
            ContaCorrente cc = p.getConta();
            SeguroVida sv = p.getSeguro();

            //Calcular Imposto de Renda
            double IRPF = geradorImpostoRenda.calculaValorTotalTributo(p);

            //1 -Calcular o valor total de imposto a ser recolhido
            IRPFtotal += IRPF;

            //2 - O nome da pessoa que pagará o maior imposto
            if(pessoaMaiorImposto == null){
                pessoaMaiorImposto = new Pessoa();
                pessoaMaiorImposto = p;
                maiorImposto = IRPF;
            } else {
                //Se o imposto de renda atual for maior que o anterios
                if (IRPF > maiorImposto){
                    pessoaMaiorImposto = p;
                    maiorImposto = IRPF;
                }
            }

            //3- o maior valor de seguro
            if(beneficiarioMaiorSeguro == null){
                beneficiarioMaiorSeguro = new SeguroVida();
                beneficiarioMaiorSeguro = sv;
            } else {
                //Se o imposto de renda atual for maior que o anterios
                if (sv.getValor() > beneficiarioMaiorSeguro.getValor()){
                    beneficiarioMaiorSeguro = sv;
                }
            }
        }

        System.out.println("****************************************************************");
        System.out.println("IRPF arrecadado.: " + df.format(IRPFtotal));
        System.out.println("Pessoa que pagará o maior IRPF.: " + pessoaMaiorImposto.getNome());
        System.out.println("Beneficiário do maior seguro.: " + beneficiarioMaiorSeguro.getBeneficiado());
        System.out.println("****************************************************************");
        System.out.println();

    }
}
