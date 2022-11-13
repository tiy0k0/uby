class MostraDados
{
	public static void main (String entrada[])
	{
		String nome, curso;
		int idade;
		char genero;
		double peso;

		nome = entrada[0];
		curso = entrada[1];
		idade = Integer.parseInt(entrada[2]);
		genero = entrada[3].charAt(0);
		peso = Double.parseDouble(entrada[4]);

		System.out.println("Nome: " + nome);
		System.out.println("Curso: " + curso);
		System.out.println("Idade: " + idade + " ano(s)");
		System.out.println("Genero: " + genero);
		System.out.println("Peso(g): " + peso);

		System.exit(0);
	}
}