package carro;

import java.util.Scanner;

public class carro{

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		String Placa, V;
		int Ano;
		
		System.out.println("informe o ano do carro");
		Placa = entrada.nextLine();
		
		System.out.println("informe a placa do carro ");
		Ano = entrada.nextInt();
		
		if(Ano <= 2010) {
			System.out.println ("carro velho ");
		}	
		if (Ano <= 2021) {
			System.out.println("carro semi novo");
		}	
		if (Ano == 2022) {
			System.out.println("carro novo");
		}
		
		V=Placa
				.replace("A","*")
				.replace("a","*")
				.replace("E","*")
				.replace("e","*")
				.replace("I","*")
				.replace("i","*")
				.replace("O","*")
				.replace("o","*")
				.replace("U","*")
				.replace("u","*");
	}

}
