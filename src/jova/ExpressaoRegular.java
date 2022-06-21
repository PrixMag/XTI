package jova;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		String padrao = "Java";
		String texto = "Java";
		boolean b = "Java".matches("java");
		
		
		 /*Modificadores
		  * (?i) ignora maiuscula e minuscula
		  * (?x) comentarios
		  * (?m) multilinhas
		  * (?s) dottal
		  */
		
		b = "Java".matches("(?i)java");
		System.out.println(b);
		
		/*Substituições*/
		
		String doce = "Qual é o Doce mais doCe que o dOce?";
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		System.out.println(r);
		
		/*Validação*/
		
		String doces = "Qual é o Doce mais dOce que o docE?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doces);
		while (matcher.find()){
			System.out.println(matcher.group());
		}
	}

}
