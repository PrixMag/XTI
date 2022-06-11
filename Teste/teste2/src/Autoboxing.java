/*
* Uso aux das classes wrapper - Autoboxing
* @author: Priscila Magalhães
*/

public class Autoboxing {
	
	public static void main (String[] args) {
		
		Integer x = 555;// objeto
		x++; //desempacota, incrementa, reempacota
		System.out.println (x);
		
		//x.intValue(); acessando os metodos do objeto
	
		Boolean v = new Boolean("true");
		if (v) {
			System.out.println(v);
		}
	
	}
	
}