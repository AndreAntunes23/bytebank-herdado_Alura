public class Gerente extends Funcionario { // Gerente herda da classe FuncionarioAutenticavel

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
	}

}