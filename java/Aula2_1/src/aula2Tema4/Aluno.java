package aula2Tema4;

public class Aluno {

	int matricula;
	String nome;
	String cpf;
			
	Aluno(){
		System.out.println("Aluno criado sem paramametros");
	}
	
	Aluno(int matricula, String nome, String cpf){
		this.matricula =matricula;
		this.nome = nome; // this você especifica o que é parâmetro e o que é atributo da classe
		this.cpf = cpf;
				
	}
	
	void info() {
		
		System.out.println("Matricula:" + matricula);
		System.out.println("Nome:" + nome);
		System.out.println("CPF:" + cpf); 
		System.out.println();
	}
}
	
