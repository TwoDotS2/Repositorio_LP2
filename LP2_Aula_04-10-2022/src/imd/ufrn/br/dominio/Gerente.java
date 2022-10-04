package imd.ufrn.br.dominio;

import java.util.Date;

public class Gerente extends Funcionario{
    private double bonus;

    //Construtor
    public Gerente(){}

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public void calcularSalario(){
        this.salario += bonus;
    }

}
