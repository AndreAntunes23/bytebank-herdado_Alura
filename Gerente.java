// Gerente � um Funcionario, herda da classe Funcionario, assina o contrato Autenticavel, � um Autenticavel
public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}