/*
* Trabalhando com operadores Especiais;
* @author: Priscila Magalhães
*/

import java.util.Scanner;

public class OperadorEspecial {

	public static void main (String[] args) {
		
		/*int idade = 6;
		String x = (idade >= 18) ? "Maior de idade" : "Menor de idade"; 
		
		System.out.println (x);*/
		
		// Calculos utilizando a expressão Match
		
		Scanner s = new Scanner(System.in);
		System.out.println ("Informe o Raio: ");
		double raio = s.nextDouble ();
		
		//Diametro : 2r
		//double raio = 10;
		double diametro = 2 * raio;
		System.out.println ("Diametro= " + diametro);
		
		//Circunferencia : 2PI r
		double pi = Math.PI; 
		double circunferencia = 2 * pi * raio;
		System.out.println ("Circunferencia= " + circunferencia);
		
		//Area PI r2
		double area = pi * (raio * raio);
		System.out.println ("Area= " + area);
		
	}

}