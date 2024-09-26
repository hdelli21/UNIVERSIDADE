public class UNIVERSIDADE {

	// Atributos do aluno
	public String Nome; // Nome do aluno
	public String RA; // Registro acadêmico
	public int Falta; // Número de faltas
	public boolean Ead; // Indica se é uma disciplina EAD
	public double NotaFinal; // Nota final do aluno
	public String Aprovacao; // Status de aprovação

	// Construtor padrão
	public UNIVERSIDADE() {
	}

	// Construtor completo
	public UNIVERSIDADE(String Nome, String RA, double NotaFinal, int Falta, boolean Ead, String Aprovacao) {
		this.Nome = Nome;
		this.RA = RA;
		this.NotaFinal = NotaFinal;
		this.Falta = Falta;
		this.Ead = Ead;
		this.Aprovacao = Aprovacao;
	}

	// Calcula a nota final com base nas notas recebidas
	public double calcularNotaFinal(double... notas) {
		return (notas.length == 4) ? calcularMediaComPesos(notas) : calcularMediaAritmetica(notas);
	}

	// Calcula a média aritmética
	public double calcularMediaAritmetica(double[] notas) {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.length;
	}

	// Calcula a média com pesos
	public double calcularMediaComPesos(double[] notas) {
		return (notas[0] * 0.15) + (notas[1] * 0.30) + (notas[2] * 0.10) + (notas[3] * 0.45);
	}

	// Verifica se o aluno foi aprovado ou reprovado
	public String Aprovacao() {
		if (Ead) {
			return NotaFinal >= 5 ? "Aprovado" : "Reprovado";
		} else {
			return (NotaFinal >= 5 && Falta <= 25) ? "Aprovado" : "Reprovado";
		}
	}

	// Métodos setters e getters para manipular os atributos
	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public void setRa(String RA) {
		this.RA = RA;
	}

	public void setFalta(int Falta) {
		this.Falta = Falta;
	}

	public void setEad(boolean Ead) {
		this.Ead = Ead;
	}

	public void NotaFinal(double... notas) {
		this.NotaFinal = calcularNotaFinal(notas);
	}

	public String getNome() {
		return Nome;
	}

	public String getRA() {
		return RA;
	}

	public int getFalta() {
		return Falta;
	}

	public boolean getEad() {
		return Ead;
	}

	public double getNotaFinal() {
		return NotaFinal;
	}

	public String getAprovacao() {
		return Aprovacao();
	}
}
