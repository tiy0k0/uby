import javax.swing.*;

class ExercicioCase
{

	public static int soma(int vetor[])
	{
		int s = 0;
		for (int i = 0; i < vetor.length; i++) {
			s = s + vetor[i];
		}
		return(s);
	}
	public static void main (String entrada[])
	{
		int vet[] = {1, 2, 3, 4, 5};
		String msg = "";
		msg = msg + "Somatória: " + soma(vet);
		JOptionPane.showMessageDialog(null, msg);
		System.exit(0);
	}
}