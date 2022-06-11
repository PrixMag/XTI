/*
* Estudo sobre Arrays Multidimensionais e sorteio aleatorio
* @author: Priscila Magalhães
*/

import java.util.Random;

public class ArrayDimensao {

	public static void main (String[] args){
		
		//Array de 1 dimensao 
		String[] uma = {"Meu Bem", "Pri"};
		System.out.println (uma[0]);
		
		//Array de 2 dimensoes
		String[][] duas = {{"Meu Bem", "M", "RJ"},{"Pri","F","RJ"}};
		System.out.println (duas [0][0]);
		System.out.println (duas [1][0]); 
		
		//Sorteio aleatorio de cartas
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Paus", "Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		//Random - Escolhe aleatoriamente os objetos
		Random r = new Random(); //precisa inportar esta classe em java.util.Random
		String face = faces [r.nextInt(faces.length)]; //chama o metodo direto no parametro
		String nipe = nipes [r.nextInt(nipes.length)];
		
		String carta = face + " " + nipe;
		System.out.println (carta);
		
		
		
	}

}