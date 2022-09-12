package br.ufrn.edu.domain;

import java.util.List;
import java.util.Objects;

public class Disciplina {
    private int id;
    private String descricao;
    private List<Docente> docentes;
    private List<Discente> discentes;
    private Curso curso;

    public Disciplina() {
    }

    public Disciplina(int id, String descricao, Curso curso) {
        this.id = id;
        this.descricao = descricao;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
