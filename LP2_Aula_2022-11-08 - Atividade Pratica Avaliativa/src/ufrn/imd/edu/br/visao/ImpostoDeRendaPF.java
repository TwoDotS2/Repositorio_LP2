package ufrn.imd.edu.br.visao;

import ufrn.imd.edu.br.dao.PessoaDAO;
import ufrn.imd.edu.br.modelo.ContaCorrente;
import ufrn.imd.edu.br.modelo.Pessoa;
import ufrn.imd.edu.br.modelo.SeguroVida;

/**
 * item h)
 */
public class ImpostoDeRendaPF {
    public static void main(String[] args) {
        //Instâncias de pessoas
        ContaCorrente cc1 = new ContaCorrente("1020-5", "100.231-1", 150);
        SeguroVida sv1 = new SeguroVida(1, "Maria", 10000);
        Pessoa p1 = new Pessoa("Roberto", 500, cc1, sv1);

        ContaCorrente cc2 = new ContaCorrente("2105-4", "123.564-9", 300);
        SeguroVida sv2 = new SeguroVida(2, "João", 15000);
        Pessoa p2 = new Pessoa("Dom Pedro", 1000, cc2, sv2);

        ContaCorrente cc3 = new ContaCorrente("3565-4", "584.557-3", 1000);
        SeguroVida sv3 = new SeguroVida(3, "João do Patrocínio", 16000);
        Pessoa p3 = new Pessoa("Rui Barbosa", 1500, cc3, sv3);

        PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.cadastraPessoa(p1);
            pessoaDAO.cadastraPessoa(p2);
            pessoaDAO.cadastraPessoa(p3);

        //Exibir todas as pessoas
        pessoaDAO.exibaListaDePessoas();

        //Imposto total recolhido, nome da pessoa que pagará o maior imposto e o beneficiado com maior valor de seguro
        pessoaDAO.imprimeImpostoTotal();

        //Calculo do IRPF das pessoas cadastradas
        pessoaDAO.calcularTributosPessoas();

        //Testando os métodos de ContaCorrente

        cc1.saca(200);
        cc1.deposita(100);
        cc2.transfere(50, cc1);
        cc3.transfere(150, cc2);
        cc3.saca(5000000);

        //Exibir todas as pessoas
        pessoaDAO.exibaListaDePessoas();
    }
}
