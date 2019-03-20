package slide26;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
	private String nome;

	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");

	public String getHoraFormatada() {
		return formato.format(data);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void imprimirMensagem() {
		System.out.println(this.getHoraFormatada() + " - Olá " + this.getNome()
				+ ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
	}

}
