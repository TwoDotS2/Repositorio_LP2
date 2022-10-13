package ufrn.imd.edu.dominio;


import java.text.DecimalFormat;

public class Mulher extends Pessoa{
    public Mulher() {}

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public String calcularIMC(double peso, double altura) {
        double IMC = peso/Math.pow(altura, 2);
        String str = "";

        if (IMC < 19) str = df.format(IMC) + " - Abaixo do peso ideal";
        if (IMC >= 19 && IMC < 25.8) str = df.format(IMC) + " - Peso ideal";
        if (IMC >= 25.8) str = df.format(IMC) + " - Acima do peso ideal";

        return str;
    }
}
