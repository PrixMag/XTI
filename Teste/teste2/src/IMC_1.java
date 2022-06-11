/*
* Desafio Calculando IMC;
* @author: Priscila Magalhães
*/

import javax.swing.JOptionPane;

public class IMC_1 {

	public static void main (String[] args) {
		
		String peso = JOptionPane.showInputDialog ("Informe seu peso em quilogramas: ");
		String altura = JOptionPane.showInputDialog ("Informe sua altura em metros: ");
		String msg = "";
		
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		
		if (IMC <=20){

			JOptionPane.showMessageDialog(null, "Abaixo do peso");
        }
		else if (IMC <=25){

			JOptionPane.showMessageDialog(null, "Peso Ideal");
		}
		else if (IMC <=30){

			JOptionPane.showMessageDialog(null, "Sobrepeso, Fora do peso ideal ");
        }
		else if (IMC <= 35){

			JOptionPane.showMessageDialog(null, "Obsidade Moderada, Fora do peso ideal ");
        }
		else if (IMC <= 40){

			JOptionPane.showMessageDialog(null, "Obsidade Severa, Fora do peso ideal ");
        }
		else if (IMC <= 50){

			JOptionPane.showMessageDialog(null, "Obsidade Morbida, Fora do peso ideal ");
        }
		else {

			JOptionPane.showMessageDialog(null, "Super Obsidade");
        }
		
		msg = "IMC= " + IMC + "\n" + msg;
		JOptionPane.showMessageDialog (null, msg);
	}

}
