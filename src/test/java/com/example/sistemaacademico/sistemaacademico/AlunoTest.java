package com.example.sistemaacademico.sistemaacademico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {
    @Test
    public void consultarStatusAprovadoTest() {
        Aluno aluno = new Aluno(1, "Jose", 7, 10, 18);
        Status actual = aluno.consultarStatus(SistemaAcademicoApplication.TOTAL_AULAS);
        assertEquals(Status.APROVADO, actual);
    }

    @Test
    public void consultarStatusRecuperacaoTest() {
        Aluno aluno = new Aluno(1, "Jose", 3, 7, 20);
        Status actual = aluno.consultarStatus(SistemaAcademicoApplication.TOTAL_AULAS);
        assertEquals(Status.RECUPERACAO, actual);
    }

    @Test
    public void consultarStatusReprovadoTest() {
        Aluno aluno = new Aluno(1, "Jose", 1, 3, 20);
        Status actual = aluno.consultarStatus(SistemaAcademicoApplication.TOTAL_AULAS);
        assertEquals(Status.REPROVADO, actual);
    }

    @Test
    public void consultarStatusReprovadoFaltasTest() {
        Aluno aluno = new Aluno(1, "Jose", 7, 8, 10);
        Status actual = aluno.consultarStatus(SistemaAcademicoApplication.TOTAL_AULAS);
        assertEquals(Status.REPROVADO, actual);
    }


}
