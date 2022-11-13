import javax.swing.*;

class CalculaProdutoria
{
	public static void main (String entrada[])
	{
		int n1, n2;
		char op = '0';
		double result;
		String msg = "", msgEnt = "Opção 1: produto\nOpção 2: produtória\n";
	
		// recebe 2 números inteiros n1, n2
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));

		// recebe uma opção op
		op = (JOptionPane.showInputDialog(msgEnt)).charAt(0);

		switch (op)
		{
			case '1':
			// caso op == 1 calcula o PRODUTO dos dois números
			{
				result = n1 * n2;
				msg = msg + "O produto é: " + result;
				break;
			}
			case '2':
			// caso op == 2 calcula a produtória do primeiro número, o número de vezes do segundo número
			{
				result = Math.pow(n1, n2);
				msg = msg + "A produtória é: " + result;
				break;
			}
			default:
			{
				JOptionPane.showMessageDialog(null, "Opção inválida.");
			}
		}
		if (op == '1' || op == '2')
		{
			JOptionPane.showMessageDialog(null, msg);
		}
		
	System.exit(0);
	}
}