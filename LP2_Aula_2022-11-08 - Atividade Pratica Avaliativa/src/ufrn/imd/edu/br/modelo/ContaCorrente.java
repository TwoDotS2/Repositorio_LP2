package ufrn.imd.edu.br.modelo;

/**
 * item b)
 */

public class ContaCorrente implements Tributavel {
    private String agencia;
    private String numero;
    private double saldo;

    public ContaCorrente() {}

    public ContaCorrente(String agencia, String numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void saca(double valor){
        if (valor <= saldo){
            saldo -= valor;
            
            System.out.println("****************************************************************");
            System.out.println("Saque de "+ valor + " em [" + numero + "] efetuado com sucesso!");
            System.out.println("****************************************************************");
            System.out.println();

        } else {
            System.out.println("****************************************************************");
            System.out.println("Saldo insuficiente!");
            System.out.println("****************************************************************");
            System.out.println();

        }
    }
    public void deposita(double valor){
        saldo += valor;
        System.out.println("****************************************************************");
        System.out.println("Depósito de "+ valor + " em [" + numero + "] efetuado com sucesso!");
        System.out.println("****************************************************************");
        System.out.println();

    }
    public boolean transfere(double valor, ContaCorrente cc){
        boolean sucessoDeOperacao = false;

        if(valor > 0 && valor <= saldo){
            System.out.println("****************************************************************");
            System.out.println("Transferindo "+ valor + " para [" + numero + "]");
            System.out.println("****************************************************************");
            System.out.println();
            //Adiciona na conta do beneficiário
            cc.deposita(valor);
            //Remove o saldo desta conta
            this.saca(valor);

            sucessoDeOperacao = true;
        }

        return sucessoDeOperacao;
    }

    /**
     * item e) 1)
     */
    @Override
    public double calculaTributos() {
        return saldo * 0.0038;
    }

    // Getters e Setters

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia='" + agencia + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
