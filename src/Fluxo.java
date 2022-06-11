/*
* Estudo fluxo condicional if/else
* @author: Priscila Magalhães
*/

public class Fluxo {

	public static void main(String[] args) {
		
		int idade = 11;
		if(idade <= 11) {
			System.out.println ("Crianca");
		} else if (idade >11 && idade <=18) {
			System.out.println ("Adolescente");
		} else if (idade > 18 && idade <=60) {
			System.out.println ("Adulto");
		} else {
			System.out.println ("Melhor idade");
		}
		
		int nota=3;
		if (nota >= 7) {
			System.out.println ("Passou");
		}else {
			System.out.println ("Reprovou");
			if (nota >= 6){
				System.out.println ("mais pode fazer a recuperação");
			}
		}
	}
} 