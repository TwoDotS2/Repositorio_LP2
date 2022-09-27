package imd.ufrn.br.dominio;

public class Carro extends Veiculo{
    private int potenciaDoMotor;
    private int quantidadeDePortas;

    /**
     * Construtor vazio de Carro
     */
    public Carro() {}

    /**
     * Construtor com somente elementos de carro
     * @param potenciaDoMotor
     * @param quantidadeDePortas
     */
    public Carro(int potenciaDoMotor, int quantidadeDePortas) {
        this.potenciaDoMotor = potenciaDoMotor;
        this.quantidadeDePortas = quantidadeDePortas;
    }

    /**
     * Construtor com dados para a instância da classe super
     * @param marca
     * @param placa
     * @param quilometragem
     * @param valorDoAluguel
     * @param potenciaDoMotor
     * @param quantidadeDePortas
     */
    public Carro(String marca, String placa, double quilometragem, double valorDoAluguel, int potenciaDoMotor, int quantidadeDePortas, boolean estaAlugado) {
        super(marca, placa, quilometragem, valorDoAluguel, 10000, estaAlugado);
        this.potenciaDoMotor = potenciaDoMotor;
        this.quantidadeDePortas = quantidadeDePortas;
    }

    /**
     * Getters e Setters
     */
    public int getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void setPotenciaDoMotor(int potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCarro{" +
                "potenciaDoMotor=" + potenciaDoMotor +
                ", quantidadeDePortas=" + quantidadeDePortas +
                '}';
    }
}
