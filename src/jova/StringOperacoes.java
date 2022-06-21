package jova;

public class StringOperacoes {

	public static void main(String[] args) {
		
		String s1 = "Write Once";
		String s2 = s1 + "Run Anywhere";
		String s3 = new String("Java Virtual Machine");
		
		char[] array = {'J','A','V','A'};
		String s4 = new String(array);
		
		//OPERAÇOES BASICAS
		int tamanho = s1.length();
		char letra = s1.charAt(0);
		String texto = s1.toString();
		
		//LOCALIZAÇAO
		int posicao = s3.indexOf ("Virtual");
		int ultima = s3.lastIndexOf('a');
		boolean vazia = s3.isEmpty();
		//System.out.println(posicao);
		
		//COMPARAÇÃO DE STRINGS
		String xti = "XTI";
		//boolean x = xti.equals("xti");//compara os valores das strings
		//boolean x = xti.equalsIgnoreCase("xti");//este metodo ignora as letras maiusculas e minusculas
		boolean x = xti.startsWith("TI");
		System.out.println(x);
		
		
	}

}
