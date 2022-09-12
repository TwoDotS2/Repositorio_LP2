package br.ufrn.edu.domain;

import java.util.List;

public class Menu {

    public Menu(){}

    public void tipoDeUsuario() {
        System.out.println("Qual seu tipo de usuário?");
        System.out.println("1- Discente");
        System.out.println("2- Docente (Inoperante)");
        System.out.println("3- Administrador (Inoperante)");
        System.out.println("S- Se deseja sair");
        System.out.println("-------------------------------------\n");
    }

    public void menuDiscente(){
        System.out.println("--------------Menu discente--------------");
        System.out.println("1- Se cadastrar");
        System.out.println("2- Consultar disciplinas");
        System.out.println("3- Cancelar matricula em componente");
        System.out.println("-------------------------------------\n");
    }

    public void menuDocente(){}

    public void menuAdministrador(){}
}
