package questao2;

public class ContaPoupanca extends Conta implements Imposto{
	
	public Double rendimento(Double saldo){
		
		return saldo * 0.05;
	}

	@Override
	public Double calcularImposto(Double rendimento) {
		//return rendimento * 0.10;
		return (rendimento * 10)/100;
	}
}
