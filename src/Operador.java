/*
* Trabalhando com operadores de Incremento e Decremento; 
* @author: Priscila Magalhães;
*/


public class Operador {

	public static void main (String[] args){
		
		int x = 6;
		int y = ++x; // transforma o valor de x no valor antigo de x+1 (pré-incremento) 
		//int y = x++; //primeiro atribui o valor de x para o y e na proxima linha efetua o incremento (pós-incremento)
		
		//int y = --x; // transforma o valor de x no valor antigo de x-1 (pré-decremento)
		//int y = x--; // primeiro atribui o valor de x para o y e na proxima linha efetua o incremento (pós-decremento) x = x -1
		
		System.out.println ("x=" + x);
		System.out.println ("y=" + y);
	}
}