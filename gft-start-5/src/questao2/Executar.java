package questao2;

public class Executar {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.setNumero(1111);
		cc.setSaldo(100.00);
		cc.setTitular("Alessandro Pereira");
		
		cp.setNumero(2222);
		cp.setSaldo(200.50);
		cp.setTitular("Joao Pedro");
		
		// QUESTAO 2
		Double ccRendimento = cc.rendimento(cc.getSaldo());
		Double cpRendimento = cp.rendimento(cp.getSaldo());
		
		System.out.println(cc.calcularImposto(cc.getSaldo() + ccRendimento));
		System.out.println(cp.calcularImposto(cp.getSaldo() + cpRendimento));
		
		
	}

}
