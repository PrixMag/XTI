/*
* Desafio Fibonacci
* @author: Priscila Magalhães
*/

/* Começa-se a serie com 0 (zero) e 1(um)
*obtem-se o proximo numero de fibonacci
*somando-se os dois anteriores e assim
*sucessiva e infinitamente.
*/

public class Fibonacci {
	
	public static void main (String[] args) {
		
		int anterior= 0;
		int proximo = 1;
		
		System.out.println (anterior);
		 
		while (proximo < 50) { 
			
			System.out.println (proximo);
			
			//proximo[3] = proximo[2] + anterior[1]
			//anterior[2] = proximo[3] - anterior[1]
			
			proximo = proximo + anterior; //proximo numero fibonacci
			anterior = proximo - anterior;//atualizando o numero anterior (soma-anterior)
		}  
	}
}