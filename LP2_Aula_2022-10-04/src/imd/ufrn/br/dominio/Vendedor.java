package imd.ufrn.br.dominio;

public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(){}

    public void calcularSalario(){
        this.salario += comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
