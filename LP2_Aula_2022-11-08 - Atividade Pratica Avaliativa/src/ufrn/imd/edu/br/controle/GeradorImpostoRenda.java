package ufrn.imd.edu.br.controle;

import ufrn.imd.edu.br.modelo.ContaCorrente;
import ufrn.imd.edu.br.modelo.Pessoa;
import ufrn.imd.edu.br.modelo.SeguroVida;

/**
 * item g)
 */
public class GeradorImpostoRenda {
    double totalTributo;

    public double calculaValorTotalTributo(Pessoa p){
        ContaCorrente cc = p.getConta();
        SeguroVida sv = p.getSeguro();
        totalTributo = p.calculaTributos() + sv.calculaTributos() + cc.calculaTributos();

        return totalTributo;
    }
}
