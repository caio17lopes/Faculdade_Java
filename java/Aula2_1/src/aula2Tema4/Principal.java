package aula2Tema4;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Aluno a = new Aluno(0001,"Caio","119.952.666-55");
		a.info();

		
		ArrayList<Aluno> alunos = new ArrayList();
		
		
		alunos.add(new Aluno(1004,"Matheus","171.896.654.77")); // estanciando aluno diretamente
	}

}
