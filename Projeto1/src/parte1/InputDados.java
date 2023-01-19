/*package parte1;

import javax.swing.JOptionPane;

public class InputDados {
	public static void main(String[] args) {
		//INSERINDO CAIXA DE INSERÇÃO
		String carros 	= JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas 	= JOptionPane.showInputDialog("Informe a quantidade de pessoas"); 
		
		//CONVERTENDO VALOR DIGITADO "STRING" EM DOUBLE
		double carroNumero		= Double.parseDouble(carros);
		double pessoasNumero	= Double.parseDouble(pessoas);
		
		//CONVERTENDO DOUBLE EM INT
		int divisao = (int) (carroNumero / pessoasNumero);
		double resto = carroNumero % pessoasNumero;
		
		//EXIBE MENSAGEM E GUARDA A RESPOSTA SIM = 0 OU NAO = 1
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão ?");
		
		//SE A RESPOSTA FOR SIM = 0
		if (resposta == 0) {
			//EXIBE RESULTADO
			JOptionPane.showMessageDialog(null, "Foram entregues "+divisao+" para "+pessoas+" quantidade de pessoas e restaram "+resto+" carros");
		}else {
			//SE A RESPOSTA FOR NAO = 1 EXIBE MENSAGEM DE ENCERRAMENTO
			JOptionPane.showMessageDialog(null, "O resultado foi rejeitado");			
		}	
	}
}
*/