/*package parte1;

public class Menu1 {

	//MAIN É UM METODO AUTO EXECUTAVEL EM JAVA
	
	public static void main(String[] args) {
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;
		
		media = (nota1+nota2+nota3+nota4)/4;
		//Condicoes logicas IF e ELSE
		/*	
		if (media>=70){
			System.out.println("Parabéns o aluno foi aprovado com a nota: "+media);
			
		}
		else if (media >=40 && media<=69){
			System.out.println("O Aluno está em recuperação com a nota: "+media);
		}
		else{
			System.out.println("Aluno lixo reprovado com a nota merda de: "+media);
		}
	 	*/
		
		//Condicoes tenarios sao para micro validacoes
		/*
		String saidaResultado;
		//"?" SE VERDADEIRO
		//":" PROXIMA CONDICAO SE FALSO
		//VARIAVEL		//"IF" //CONDICAO	//TRUE(IF)		//FALSE(ELSE)
		saidaResultado = media >=70 ? "Aluno aprovado" : "Aluno repovado";
		System.out.println(saidaResultado);
		
		
		//Operacoes logicas aninhadas: sao operacoes dentro de operacoes
		//IF dentro de IF...
		if (media >=50) {
			if (media >=70) {
				System.out.println("Aluno aprovado");
			}else {
				System.out.println("Aluno em recuperacao");
			}
		}else {
			System.out.println("Aluno reprovado");
		}
		*/
		//SWITCH CASE: Operacoes exatas
		/*
		switch (media) {
		case 70:
			System.out.println("Aluno aprovado");
			break;

		default:System.out.println("Nota diferente: "+media);
			break;
		}
		*/
		
	}
}
