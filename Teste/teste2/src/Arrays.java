/*
* Estudo sobre collection Framework ArrayList
* @author: Priscila Magalhães
*/

import java.util.ArrayList;

public class Arrays {

	public static void main (String[] args){
		
		ArrayList <String> cores = new ArrayList <String>();
		
		//adiciona elementos ao array
		cores.add ("Branco"); 
		cores.add (0, "Vermelho");//adicionando o indice do array para indicar a posição
		cores.add ("Amarelo");
		cores.add ("Azul");
		
		//exibe os valores dos arrays
		System.out.println (cores.toString()); 
		
		//informa o tamanho do array
		System.out.println ("Tamanho= " + cores.size()); 
		
		//recupera o indice do elemento 
		System.out.println ("Elemento2= " + cores.get(2));
		
		//descobre o indice do elemento
		System.out.println ("Indice Branco= " + cores.indexOf("Branco"));
		
		// remove um elemento do array
		cores.remove("Branco");
		
		//verifica se um elemento existe dentro do array em booleano
		System.out.println ("Tem Azul?" + cores.contains("Azul"));
	}

}
