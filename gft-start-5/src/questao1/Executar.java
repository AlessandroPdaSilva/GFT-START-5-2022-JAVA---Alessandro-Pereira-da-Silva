package questao1;

public class Executar {

	public static void main(String[] args) {
		
		// QUESTAO 1
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.setNumero(1111);
		cc.setSaldo(100.00);
		cc.setTitular("Alessandro Pereira");
		
		cp.setNumero(2222);
		cp.setSaldo(200.50);
		cp.setTitular("Joao Pedro");
		
		System.out.println(cc.rendimento(cc.getSaldo()));
		System.out.println(cp.rendimento(cp.getSaldo()));
		
	}

}
