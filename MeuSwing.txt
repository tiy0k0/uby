/* 
Introdução à Linguagem Java
Atividade Prática 14
Gostaria de saber por que é melhor declarar as variáveis como inteiro ao invés de já declarar como double, pois assim as divisões poderiam ser não inteiras.
Por causa da memória ou é por uma questão de enunciado?
De qualquer forma, o código abaixo estaria certo se a divisão pudesse ser não-inteira e a pessoa pudesse digitar números reais?
Agradeço! 
*/

import javax.swing.*;

class MeuSwing
{
	public static void main (String entrada[])
	{
		double n1, n2;
		double potencia, quociente;
		String msg = "";
		
		// recebe dois numeros inteiros por swing
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero inteiro: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero inteiro: "));

		// calcula quociente da divisao dos dois numeros
		quociente = (int)n1 / (int)n2;

		// calcula a potencia do primeiro numero pelo segundo
		potencia = Math.pow(n1, n2);

		// mostra resultados pelo swing
		msg = msg + "Resultado da divisao: " + quociente + "\n";
		msg = msg + "Resultado da potencia: " + potencia + "\n";
		JOptionPane.showMessageDialog(null, msg);
		

		System.exit(0);
	}

}