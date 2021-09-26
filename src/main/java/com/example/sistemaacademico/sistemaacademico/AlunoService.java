package com.example.sistemaacademico.sistemaacademico;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AlunoService {
    public AlunoManualRepository alunoManualRepository = new AlunoManualRepository();

    public List<Aluno> getAlunos() {
        return alunoManualRepository.getAlunos();
    }

    public void addAluno(Aluno aluno) {
        alunoManualRepository.addAluno(aluno);
    }
}
