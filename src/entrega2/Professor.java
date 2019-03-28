package entrega2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Professor extends Pessoa {

	private Date admissao = new Date();
	private Pessoa pessoa;

	SimpleDateFormat formato = new SimpleDateFormat();

	public String getAdmissao() {
		return formato.format(admissao);
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void imprimirProfessor() {
		System.out.printf(this.getPessoa() + "Data de admissão: " + this.getAdmissao() + "%n");
	}

}
