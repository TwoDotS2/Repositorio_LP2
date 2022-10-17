package imd.ufrn.edu.persistencia;

import imd.ufrn.edu.dominio.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Veiculo> listaDeVeiculos;

    public Repositorio() {}

    public void addVeiculo(Veiculo v){
        //Verificar se veiculo está instanciado
        if (listaDeVeiculos == null)
            listaDeVeiculos = new ArrayList<Veiculo>();

        //Adicionar veiculo na lista
        listaDeVeiculos.add(v);
    }

    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }
}
