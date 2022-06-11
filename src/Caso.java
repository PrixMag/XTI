/*
* Estudo fluxo condicional switch
* @author: Priscila Magalhães
*/

//switch é uma maneira simplificada de fazer as avaliaçoes de igualdade de condições

public class Caso {

	public static void main(String[] args) {
		
		char sexo = 'F';
			
		switch (sexo) {
			case 'M':
				System.out.println ("Macho");
				break;
			case 'F':
				System.out.println ("Femea");
				break;
			default:
				System.out.println ("Outro");	
		}
	}
} 