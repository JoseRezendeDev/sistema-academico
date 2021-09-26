package com.example.sistemaacademico.sistemaacademico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private double p1;
    private double p2;
    private int presencas; // em porcentagem
    private Status status;

    public double consultarMedia() {
        return (p1+p2)/2;
    }

    public double calcularFrequencia(int totalAulas) {
        return (double) presencas/totalAulas;
    }

    public Status consultarStatus(int totalAulas) {
        double media = consultarMedia();

        if ((double) presencas/totalAulas >= 0.75) {
            if (media >= 6) {
                this.status = Status.APROVADO;
            } else if (media >= 4) {
                this.status = Status.RECUPERACAO;
            } else {
                this.status = Status.REPROVADO;
            }
        } else {
            this.status = Status.REPROVADO;
        }

        return this.status;
    }

    public Aluno(int id, String nome, double p1, double p2, int presencas) {
        this.id = id;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.presencas = presencas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public int getPresencas() {
        return presencas;
    }

    public void setPresencas(int presencas) {
        this.presencas = presencas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", presencas=" + presencas +
                ", status=" + status +
                '}';
    }
}
