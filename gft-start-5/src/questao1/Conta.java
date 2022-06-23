package questao1;

public abstract class Conta {
	
	// ATRIBUTOS
	private int numero;
	private String titular;
	private Double saldo;
	
	// METODOS
	public Double rendimento(Double saldo){
		
		return saldo;
	}
	
	// GET E SET
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
	
}
