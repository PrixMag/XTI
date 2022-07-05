package heranca;

public class Animal {

	double peso;
	String comida;
	String nome;
	
	public Animal (double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	public Animal (double peso, String comida, String nome) {
		this.peso = peso;
		this.comida = comida;
		this.nome = nome;
	}
	
	void dormir (){System.out.println("Dormiu");}
	void fazerBarulho(){System.out.println("Fazer Barulho");}
	String recuperarNome(){return this.nome;}
	
}
