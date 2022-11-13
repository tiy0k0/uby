import javax.swing.*;

class RepeteModulo {
	

	public static int soma (int vet[]){
		int s = 0;
		for (int i = 0; i < vet.length; i++){
			s = s + vet[i];
		}
		return(s);
	}
	public static void main (String args[]){
		
		int vetor[] = {1, 2, 3, 4, 5};
		String msg = "";
		msg = msg + "Somatória: " + soma(vetor);
		JOptionPane.showMessageDialog(null, msg);
		System.exit(0);
	}
}