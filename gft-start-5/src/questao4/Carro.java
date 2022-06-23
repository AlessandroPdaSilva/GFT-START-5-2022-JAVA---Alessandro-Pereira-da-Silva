package questao4;

public class Carro {
	private String modelo;
	private String marca;
	private String tipoCombustivel;
	
	public Carro(){
		this.modelo = "";
		this.marca = "0";
	}
	
	public Carro(String modelo, String marca){
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", tipoCombustivel=" + tipoCombustivel + "]";
	}
	
	
	
	
}
