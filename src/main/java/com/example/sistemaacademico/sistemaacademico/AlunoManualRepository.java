package com.example.sistemaacademico.sistemaacademico;

import java.util.ArrayList;
import java.util.List;

public class AlunoManualRepository {
    public static List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}
