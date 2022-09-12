package br.ufrn.edu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Capaz de se matricular e cancelar matrícula
public class Discente extends Pessoa{
    private String matricula;
    private String curso;
    private double IRA;
    private Date dataMatricula;
    private List<Disciplina> disciplinas;

    public Discente(){}

    public Discente(Pessoa pessoa, String matricula, double IRA, Date dataMatricula) {
        this.matricula = matricula;
        this.IRA = IRA;
        this.dataMatricula = dataMatricula;
    }

    public void solicitarMatricula(Disciplina d){
        //verificar se a disciplina já existe na coleção
        //verificar se a minha lista de disciplinas não é vazia
        //disciplina é não null
        if(disciplinas == null)
            disciplinas = new ArrayList<Disciplina>();

        if(!disciplinas.contains(d))


        disciplinas.add(d);
    }

    public void solicitarTrancamento(Disciplina d){

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getIRA() {
        return IRA;
    }

    public void setIRA(double IRA) {
        this.IRA = IRA;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public List getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", IRA=" + IRA +
                ", dataMatricula=" + dataMatricula +
                ", disciplinas=" + disciplinas +
                ", nome=" + getNome() +
                ", matricula=" + getMatricula() +
                '}';
    }
}
