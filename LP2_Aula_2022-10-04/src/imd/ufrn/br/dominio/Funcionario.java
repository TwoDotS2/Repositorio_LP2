package imd.ufrn.br.dominio;

public class Funcionario {
    private int id;
    private String nome;
    protected double salario;
    private String tipoDeFuncionario;

    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipoDeFuncionario() {
        return tipoDeFuncionario;
    }

    public void setTipoDeFuncionario(String tipoDeFuncionario) {
        this.tipoDeFuncionario = tipoDeFuncionario;
    }
}
