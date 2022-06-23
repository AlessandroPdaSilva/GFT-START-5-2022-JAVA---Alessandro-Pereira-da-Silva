package questao2;

public class ContaCorrente extends Conta implements Imposto{
	
	public Double rendimento(Double saldo){
		
		return saldo * 0.03;
	}

	@Override
	public Double calcularImposto(Double rendimento) {
		//return rendimento * 0.25;
		return (rendimento * 25)/100;
	}
	
}
