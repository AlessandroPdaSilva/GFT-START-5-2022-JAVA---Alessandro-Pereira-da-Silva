package questao4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executar {

	public static void main(String[] args) {
		
		//QUESTAO 4
		Scanner scan = new Scanner(System.in);
		List<RepresentaCarro> listaCarro = new ArrayList<RepresentaCarro>();
		
		int movidoGasolina = 0;
		int movidoDisel = 0; 
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("CARRO "+i);
			System.out.println("Qual o modelo do carro: ");
			String modelo = scan.next();
			
			System.out.println("Qual a marca do carro : ");
			String marca = scan.next();
			
			System.out.println("Qual o tipo de combustivel do carro :\n -Gasolina(1)\n -Disel(2) ");
			int escolha = scan.nextInt();
			
			RepresentaCarro carro = new RepresentaCarro();
			carro.setMarca(marca);
			carro.setModelo(modelo);
			
			
			switch (escolha) {
			case 1:
				carro.setTipoCombustivel("gasolina");
				movidoGasolina++;
				
				break;
			case 2:
				carro.setTipoCombustivel("disel");
				movidoDisel++;
				
				break;
			default:
				System.out.println("Opção incorreta, tente novamente!!");
				System.exit(0);
				break;
			}
			
			listaCarro.add(carro);
		}
		
		
		
		System.out.println("\n\nRESPOSTA\nCarros a Disel: "+movidoDisel);
		System.out.println("Carros a Gasolina: "+ movidoGasolina);
		
		
		 
		
		
		
		System.out.println("\n\nLISTA DE CARROS"); 
		for(RepresentaCarro aux: listaCarro) {
			System.out.println(aux.dadosCarro());
		}
		
		 
		
	}

}
