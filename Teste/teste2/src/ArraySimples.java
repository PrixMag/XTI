/*
* Estudo sobre Arrays
* @author: Priscila Magalhães
*/

import java.util.Arrays;

public class ArraySimples {

	public static void main (String[] args){
		
		int[] impares = new int[5]; // a inicialização do array sempre requer o numero de posições q tem no array
		impares [0] = 1;
		impares [1] = 3;
		impares [2] = 5;
		impares [3] = 7;
		impares [4] = 9;
		
		//array de strings - classe Arrays
		String[] paises ={"Brasil", "Russia","India","China"}; 
	    System.out.println (paises[0]); 
		
		// length - mostra quantas posições tem o array
		System.out.println (paises.length); 
	    
		// toString - mostra todos os valores dos arrays, recebe 1 parametro
		System.out.println (Arrays.toString(paises)); 
		
		// binarySearch - pesquisa dentro do array, recebe 2 parametros
		int posicao = Arrays.binarySearch(paises, "Russia"); 
		System.out.println (posicao);
		
		//sort - ordenação atraves das posiçoes
		Arrays.sort (paises,0, paises.length);
		System.out.println (Arrays.toString (paises));
		
		//Acessa metodos do objeto dentro do array
		Double[] valores = {45.50, 255.360};
		System.out.println (valores[0].doubleValue());
		
	}

}