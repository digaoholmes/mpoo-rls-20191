package entrega2;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "%n" + "Nome: " + this.getNome() + "%n" + "CPF: " + this.getCpf() + "%n" + "Endereço: " + "%n"
				+ this.endereco + "%n";
	}

}
