package heranca;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		String nomeToto = toto.recuperarNome();
		
		
		Galinha pintadinha = new Galinha ();
		pintadinha.comida = "Milho";
		pintadinha.dormir();
		
		System.out.println(toto instanceof Cachorro);
		System.out.println(nomeToto);
		
		Papagaio loro = new Papagaio();
		System.out.println(loro.recuperarNome());
		loro.fala();

		Papagaio loro2 = new Papagaio();
		
		toto.equals(pintadinha); // compara dois objetos e verifica se os valores s�o iguais
		toto.hashCode(); //mais utilizado no armazenamento de cole��es {arrays}
		toto.getClass();//retorna o tipo da classe deste obejto
		toto.toString();//retorna a representa��o em texto (string) deste obejeto
		System.out.println(loro.equals(loro2));
		System.out.println(loro == loro2);
		

	}

}
