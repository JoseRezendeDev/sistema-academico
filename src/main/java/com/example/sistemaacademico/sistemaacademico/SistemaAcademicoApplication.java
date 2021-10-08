package com.example.sistemaacademico.sistemaacademico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaAcademicoApplication {
	public static int TOTAL_AULAS = 20;

	public static void main(String[] args) {
		SpringApplication.run(SistemaAcademicoApplication.class, args);
		Aluno aluno1 = new Aluno(1, "Jose", 7, 10, 4);
		Aluno aluno2 = new Aluno(2, "Vinicius", 7, 10, 4);
		Aluno aluno3 = new Aluno(3, "Caio", 7, 10, 4);

		AlunoService alunoService = new AlunoService();
		alunoService.addAluno(aluno1);
		alunoService.addAluno(aluno2);
		alunoService.addAluno(aluno3);

		System.out.println(alunoService.getAlunos());

//		System.out.println(aluno1.consultarMedia());
//		System.out.println(aluno1.calcularFrequencia(TOTAL_AULAS));
//		System.out.println(aluno1.consultarStatus(TOTAL_AULAS));
	}
	
}
