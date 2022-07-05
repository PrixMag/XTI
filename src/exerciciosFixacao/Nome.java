package exerciciosFixacao;

import java.util.Scanner;

public class Nome {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		String nome = n.nextLine();
		System.out.println("Olá, " + nome);
	}

}

//Crie um programa que efetue a leitura de um nome e exiba a mensagem “olá nome informado“.
