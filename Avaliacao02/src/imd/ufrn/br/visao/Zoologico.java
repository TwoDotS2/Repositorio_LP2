package imd.ufrn.br.visao;

import imd.ufrn.br.dominio.Animal;
import imd.ufrn.br.dominio.Elefante;
import imd.ufrn.br.dominio.Girafa;
import imd.ufrn.br.dominio.Tigre;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    public static void main(String[] args) {
        List<Animal> jaulas = new ArrayList<Animal>();

        //Instancias de Tigre
        Animal tigre1 = new Tigre("Listrinha", 150, "carnívoro", "Listrado");
        Animal tigre2 = new Tigre("Neve", 120, "Carnívoro", "Bengala");

        //Instancias de Elefante
        Animal elefante1 = new Elefante("Dumbo", 1200, "Herbívoro", 2);
        Animal elefante2 = new Elefante("Cinza", 1350, "Herbívoro", 3);

        //Instancias de Girafa
        Animal girafa1 = new Girafa("Melman", 180, "Herbívoro", 1);
        Animal girafa2 = new Girafa("Nélio", 190, "Herbívoro", 1);

        jaulas.add(tigre1);
        jaulas.add(tigre2);
        jaulas.add(elefante1);
        jaulas.add(elefante2);
        jaulas.add(girafa1);
        jaulas.add(girafa2);

        //Mostrar todos os animais
        System.out.println("Lista com todos os animais por jaula:");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < jaulas.size(); i++) {
            System.out.println("Jaula " + i + ":\n" + jaulas.get(i).toString() + "\n");
        }

        tigre1.comer();
        tigre2.comer();
        tigre2.comer();

        elefante1.comer();
        elefante2.comer();

        girafa1.comer();
        girafa2.comer();

        System.out.println("Consumo total dos animais");
        double totalConsumo = 0;
        double totalConsumoElefantes = 0;
        double totalConsumoGirafas = 0;
        double totalConsumoTigres = 0;
        System.out.println("-----------------------------------------------");
        for (Animal a: jaulas) {
            totalConsumo += a.getConsumiu();
            if(a instanceof Tigre)
                totalConsumoTigres += a.getConsumiu();
            if(a instanceof Elefante)
                totalConsumoElefantes += a.getConsumiu();
            if(a instanceof Girafa)
                totalConsumoGirafas += a.getConsumiu();
        }
        System.out.println("Consumo total: " + totalConsumo);
        System.out.println("Consumo dos elefantes: " + totalConsumoElefantes + "kg");
        System.out.println("Consumo das girafas: " + totalConsumoGirafas + "kg");
        System.out.println("Consumo dos tigres: " + totalConsumoTigres + "kg");
    }
}
