/*
* Estudo do Loop de repetição - while e do{...} while()
* @author: Priscila Magalhães
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Enquanto {
	
	public static void main (String[] args) {
		
		//loop While
		ArrayList <String> produtos = new ArrayList <String>();
		Scanner s = new Scanner (System.in);
		System.out.println ("Liste seus produtos : para sair digite Fim");
		
		String produto;
		while (!"fim".equals(produto = s.nextLine ())) {// é executado 0 ou mais x 
			produtos.add(produto);
		}
		System.out.println (produtos.toString());
		
		//DO...While 
		int i=3;
		
		do {
			System.out.println (i);//repete a estrutura 1 ou mais x ate completar o laço
			i++;
		} while (i < 2);
	}
}