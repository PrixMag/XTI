package jova;

public class StringMutavel {

	public static void main(String[] args) {
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		s1.toString();
		s1.length();
		s1.capacity();
		
		//System.out.println(s1);
		//s1.reverse();
		
		s1.append(" Trabalhando ");
		char[] c= {'c','o','m'};
		s1.append(c).append(" Textos.");
		System.out.println(s1);
		
		String s = "Oi" + "como" + "vai voce?";
		String sb = new StringBuilder ("Oi").append("como").append("vai voce").toString();

	}

}
