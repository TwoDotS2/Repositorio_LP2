package br.ufrn.imd.domain;

public interface ContaInterface {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}
