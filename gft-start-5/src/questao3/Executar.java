package questao3;

public class Executar {

	public static void main(String[] args) {
		
		// QUESTAO 3
		Pessoa p = new Pessoa();
		p.setNome("Joao Pedro");
		p.setEndereco("St. M-Norte QNM 34");
		p.setTelefone(99999999);
		
		System.out.println("Nome: "+ p.getNome());
		System.out.println("Endereço: "+ p.getEndereco());
		System.out.println("Telefone: "+ p.getTelefone());
	}

}
