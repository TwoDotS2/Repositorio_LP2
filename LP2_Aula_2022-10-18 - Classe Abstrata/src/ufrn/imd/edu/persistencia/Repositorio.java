package ufrn.imd.edu.persistencia;

import ufrn.imd.edu.dominio.Homem;
import ufrn.imd.edu.dominio.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    List<Pessoa> listaDePessoas;

    public Repositorio() {
    }

    public void addPessoa(Pessoa p){
        if(listaDePessoas == null){
            listaDePessoas = new ArrayList<Pessoa>();
        }
        //Adicionar pessoa no vetor de pessoas
        if (p != null)
        listaDePessoas.add(p);
    };

    public List<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }
}
