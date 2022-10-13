package ufrn.imd.edu.dominio;

import java.text.DecimalFormat;

public class Homem extends Pessoa{
    public Homem() {}

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public String calcularIMC(double peso, double altura) {
        double IMC = peso/Math.pow(altura, 2);
        String str = "";

        if (IMC < 20.7) str = df.format(IMC) + " - Abaixo do peso ideal";
        if (IMC >= 20.7 && IMC < 26.4) str = df.format(IMC) + " - Peso ideal";
        if (IMC >= 26.4) str = df.format(IMC) + " - Acima do peso ideal";

        return str;
    }
}
