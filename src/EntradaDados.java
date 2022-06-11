/*
*caixa de dialogo para obteção de dados do usuario JOptionPane
*@author: Priscila Magalhães  
*/

import javax.swing.JOptionPane;

public class EntradaDados {

public static void main (String[] args) {
	
	String nome = JOptionPane.showInputDialog ("Qual seu nome?");
	JOptionPane.showMessageDialog (null, nome);
 }
}