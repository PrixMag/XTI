/*
* Desafio Condicional Jogo de Dados
* @author: Priscila Magalhães
*/

import java.util.Scanner;
import java.util.Random;

public class JogoDados {

	public static void main (String[] args) {
	
		Scanner s = new Scanner (System.in);
		System.out.println ("Qual o seu Palpite? ");
		int palpite = s.nextInt();
		
		Random n = new Random();
		int dado = n.nextInt(6)+1;
		
		if(palpite == dado) {
			System.out.println ("Voce Acertou!");
		}else {
			System.out.println ("Voce Errou!");
		}
		
		System.out.println ("Palpite="+palpite);
		System.out.println ("Dado="+dado);
		
	}
	
}