public class TesteFuncionario {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setSalario(3000.0);
		
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("11122233300");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}
}