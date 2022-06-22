package jova;

import java.text.NumberFormat;

public class Numero {

	public static void main(String[] args) {
		
		double saldo = 123_456.789;
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo));
		
		f= NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo));//exclui a parte fracionada dos numeros
		
		f= NumberFormat.getPercentInstance();
		System.out.println(f.format(0.25));//formata os numeros percentuais
		
		f= NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo));//formata os numeros como moeda
		

	}

}
