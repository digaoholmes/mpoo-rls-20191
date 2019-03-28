/*Tentar fazer com que um professor se cadastre como aluno e um aluno se cadastre como professor.
 * A ideia seria criar um atributo do tipo Pessoa e associar os dados da pessoa com as classes aluno e Professor,porém acho  não estou conseguindo
 fazer essa associação corretamente ( não estou conseguindo exibir o professor com os dados de quando era aluno + os novos de professor, imprimo
 apenas separado
 
 */

package entrega2;

public class Application {

	public static void main(String[] args) {

		Endereco e1 = new Endereco();
		e1.setRua("Rua das Pernambucanas");
		e1.setNumero(234);
		e1.setComplemento("prox ao macunaíma");
		e1.setCidade("Recife");

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Rodrigo Souza");
		pessoa1.setCpf("333.777.000-22");
		pessoa1.setEndereco(e1);

		Aluno aluno1 = new Aluno();
		aluno1.setPessoa(pessoa1);
		aluno1.setAnoEntrada(2017);
		aluno1.setPeriodoEntrada(1);
		aluno1.imprimirAluno();

		Endereco e2 = new Endereco();
		e2.setRua("av eng abdias de carvalho");
		e2.setNumero(80);
		e2.setComplemento("edf palmeiras, apt 301");
		e2.setCidade("Recife");

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Maria fulana");
		pessoa2.setCpf("111.567.999-40");
		pessoa2.setEndereco(e2);

		Professor professor1 = new Professor();
		professor1.setPessoa(pessoa2);
		professor1.getAdmissao();
		professor1.imprimirProfessor();

		Professor professor2 = new Professor();
		professor2.setPessoa(pessoa1);
		professor2.getAdmissao();
		professor2.imprimirProfessor();

		Aluno aluno2 = new Aluno();
		aluno2.setPessoa(pessoa2);
		aluno2.setAnoEntrada(2020);
		aluno2.setPeriodoEntrada(1);
		aluno2.imprimirAluno();

	}

}
