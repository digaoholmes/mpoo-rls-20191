package entrega2;

public class Aluno extends Pessoa {

	protected int anoEntrada;
	private int periodoEntrada;
	private Pessoa pessoa;

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public int getPeriodoEntrada() {
		return periodoEntrada;
	}

	public void setPeriodoEntrada(int periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void imprimirAluno() {
		System.out.printf(
				this.getPessoa() + "Ano de Entrada: " + this.getAnoEntrada() + "." + this.getPeriodoEntrada() + "%n");
	}

}
