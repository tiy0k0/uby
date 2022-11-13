import javax.swing.*;

class ProgDecisao
{
	public static void main (String entrada[])
	{
		int num;
		char op = '0';
		String msg = "", msgEntr = "Digite 1 para par/impar \nDigite 2 para positivo/negativo \n"; 

		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

		switch (op)
		{
			case '1':
			{
				if (num % 2 == 0)
				{
					msg = msg + num + " é um número par. \n\n";
				} else {
					msg = msg + num + " é um número ímpar. \n\n";
				}
				break;
			}
			case '2':
				if (num > 0)
				{
					msg = msg + num + " é um número positivo. \n\n";
				} else if (num == 0) {
					msg = msg + num + " é nulo. \n\n";
				} else if (num < 0 ) {
					msg = msg + num + " é um número negativo. \n\n";
				} else {
					msg = msg + num + " não pôde ser classificado. \n\n";
				}
				break;

			default: JOptionPane.showMessageDialog(null, "Opção inválida, cálculos não realizados.");
			
		}
		if (op == '1' || op == '2')
		{
			JOptionPane.showMessageDialog(null, msg);
		}		

		System.exit(0);
	}
}