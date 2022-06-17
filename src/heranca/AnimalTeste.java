package heranca;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		
		Galinha pintadinha = new Galinha ();
		pintadinha.comida = "Milho";
		pintadinha.dormir();
		
		System.out.println(toto instanceof Cachorro);
		
		toto.equals(pintadinha); // compara dois objetos e verifica se os valores s�o iguais
		toto.hashCode(); //mais utilizado no armazenamento de cole��es {arrays}
		toto.getClass();//retorna o tipo da classe deste obejto
		toto.toString();//retorna a representa��o em texto (string) deste obejeto
		

	}

}
