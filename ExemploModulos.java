import javax.swing.*;

class ExemploModulos
{
	// resultado da somatória
	public static void soma ()
	{
		int s = 0, vet[] = {1, 2, 3, 4, 5};
		for (int i = 0; i < vet.length; i++)
		{
			s = s + vet[i];
		}
		JOptionPane.showMessageDialog(null, "A somatória é: " + s);
	}
	
	// resultado da produtória
	public static int produto ()
	{
		int p = 1, vet[] = {1, 2, 3, 4, 5};
		for (int i = 0; i < vet.length; i++)
		{
			p = p * vet[i];
		}
		return p;
	}	
	
	// principal
	public static void main (String entrada[])
	{
		int r;
	
		soma();
		r = produto();
		JOptionPane.showMessageDialog(null, "A produtória é: " + r);
		System.exit(0);
	}
}