package br.ufrn.edu.main;

import br.ufrn.edu.domain.Discente;
import br.ufrn.edu.domain.Curso;
import br.ufrn.edu.domain.Disciplina;
import br.ufrn.edu.domain.Pessoa;
import br.ufrn.edu.domain.Menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


//Sistema de matrículas
//Retorno dos dados em mock
public class main {
    public static void main(String[] args) {
        //Inicialização
        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        String matriculaBase = "20220192390";
        int indexMatricula = 0;
        String matricula;

        //Atribuindo data ao calendário
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 9);
        Date dataNascimento = cal.getTime();

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(Calendar.DAY_OF_MONTH, 03);
        Date dataMatricula = cal.getTime();

        Pessoa p = new Pessoa("123.456.789-01", "Alfredo.", dataNascimento);

        //Frankeinstein para ter uma matricula "dinâmica"
//        matricula = String.valueOf(Integer.parseInt(matriculaBase) + indexMatricula++);
        matricula = matriculaBase;
        Discente a = new Discente(p, matricula, 7.9389, dataMatricula);

        Curso bti = new Curso();
        Disciplina imd0040 = new Disciplina();
        imd0040.setCurso(bti);
        imd0040.setDescricao("Linguagem de Programação II");

        Disciplina dim0141 = new Disciplina();
        dim0141.setCurso(bti);
        dim0141.setDescricao("Visão Computacional");

        a.setDisciplinas(new ArrayList<Disciplina>());
        a.getDisciplinas();

        Menu menu = new Menu();
        Discente discente = new Discente();

        //Printar o menu para o usuário determinar seu tipo de acesso
        menu.tipoDeUsuario();
        String op = scan.nextLine();

        //Provavelmente deveria existir uma classe Sistema para operar tudo isso
        //Enquanto o usuário não quiser sair
        while (!op.equals("S")){

            if(op.equals("1")) {
                menu.menuDiscente();
                op = scan.nextLine();

                //Cadastro
                if (op.equals("1")) {
                    String str;

                    //Salvar o nome
                    System.out.println("Digite seu nome:");
                    str = scan.nextLine();
                    discente.setNome(str);

                    //Salvar o cpf
                    System.out.println("Digite seu cpf:");
                    str = scan.nextLine();
                    discente.setCPF(str);

                    //Salvar a data de nascimento
                    System.out.println("Digite sua data de nascimento (dd/MM/yyyy):");
                    str = scan.nextLine();

                    try {
                        dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(str);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    discente.setDataDeNascimento(dataNascimento);

                    //Atribuir matrícula
                    //matricula = String.valueOf(Integer.parseInt(matriculaBase) + indexMatricula++);
                    matricula = matriculaBase;
                    discente.setMatricula(matricula);

                    //Atribuir IRA
                    discente.setIRA(0);

                    //Atribuir data de matrícula
                    Date hoje = Calendar.getInstance().getTime();
                    discente.setDataMatricula(hoje);

                    System.out.println(discente.toString());
                }

                //Consultar disciplinas
                if (op.equals("2")) {

                }

                //Cancelar matricula em componente
                if (op.equals("3")) {

                }

            }
        }

        //Inserção da parte interativa


        //Equals e HashCode

    }


}
