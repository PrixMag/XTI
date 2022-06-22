package jova;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		
		Date agora = new Date(); //data atual
		System.out.println(agora);
		
		Date data = new Date(); //data atual
		System.out.println(data);
		
		/*METODOS*/
		data.getTime();
		data.setTime(1_000_000_000_000L);
		System.out.println(data.compareTo(agora));
		
		/*Imprimindo saudaçao de Bom dia, Tarde, Noite*/
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		if (hora <=12) {
			System.out.println("Bom Dia!");
		} else if (hora < 18){
			System.out.println("Boa Tarde!");
		} else if (hora > 18) {
			System.out.println("Boa Noite!");
		}
		
		/*Formatação de Data*/
		Calendar c = Calendar.getInstance();
		c.set(1989,Calendar.JUNE, 22);
		Date date = c.getTime();
		System.out.println(date);//formato padrao
		
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));//formato brasileiro
		
		/*Formatação de Hora*/
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));
		
		/*Formatação de Data e Hora*/
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));
		
	}
}