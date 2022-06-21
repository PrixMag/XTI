package jova;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import poo.Conta;

public class Arquivo3 {
	
	private Path path = Paths.get("C:/XTI/files/contas.txt");
	private Charset utf8 = StandardCharsets.UTF_8;
	
	public void armazenarContas(ArrayList<Conta> contas) throws IOException {
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
			for (Conta conta : contas) {
				writer.write(conta.getCliente()+ ";" + conta.getSaldo() + "\n");
			}
		}
	}
	
	
	public ArrayList<Conta> recuperarContas() throws IOException{
		ArrayList<Conta> contas = new ArrayList<>();
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line=reader.readLine())!=null){
				String[] t = line.split(";");
				System.out.println(t[0] + t[1]);
				Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
				contas.add(conta);
			}
		}
		return contas;
	}

	public static void main(String[] args) throws IOException {
		
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta ("Pri ", 15000.23));
		contas.add(new Conta ("Meu bem ", 16000.23));
		contas.add(new Conta ("Cacau ", 17000.23));
		contas.add(new Conta ("Lupy ", 18000.23));
		
		Arquivo3 operacao = new Arquivo3();
		operacao.armazenarContas(contas);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibeSaldo();
		}

	}

}



/*
 *criar um metodo que receba como parametro esta lista de contas
 *e armazene essas contas dentro de um arquivo dentro do diretorio files
 *e crie outro metodo para ler essas contas e retornar um obj do tipo arraylist
 *de contas para exibir as contas armazenadas no arquivo   */
 