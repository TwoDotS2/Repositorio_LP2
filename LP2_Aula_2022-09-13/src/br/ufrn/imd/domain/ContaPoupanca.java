package br.ufrn.imd.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{
    @Override
    public void imprimeExtrato() {
        System.out.println("### Extrato da conta ###");

        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/aaaa HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date));
    }
}
