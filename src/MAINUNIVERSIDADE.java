public class MAINUNIVERSIDADE {

	public static void main(String[] args) {
		// Cria um novo objeto da classe UNIVERSIDADE
		UNIVERSIDADE universidade = new UNIVERSIDADE();

		// Define os atributos do aluno
		universidade.setNome("João Ricardo"); // Nome do aluno
		universidade.setRa("45144"); // RA do aluno
		universidade.setFalta(15); // Número de faltas
		universidade.setEad(false); // Indica que a disciplina não é EAD

		// Calcula a nota final com as notas fornecidas
		universidade.NotaFinal(9.0, 9.5, 9.0, 9.5);

		// Exibe as informações do aluno
		System.out.println("Nome: " + universidade.getNome());
		System.out.println("RA: " + universidade.getRA());
		System.out.println("Falta: " + universidade.getFalta());
		System.out.println("EAD: " + universidade.getEad());
		System.out.println("Nota Final: " + universidade.getNotaFinal());
		System.out.println("Aprovação: " + universidade.getAprovacao());
	}
}
