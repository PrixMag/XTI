package heranca;

public class Papagaio extends Animal implements AnimalFalante {
	
	public Papagaio() {
		super(1,"Jilo","Loro Jose");
	}
	

	@Override
	public void fala() {
		System.out.println("Quero café");
		
	}

	@Override
	public boolean equals(Object p) {
		Papagaio loro = (Papagaio) p; 
		return super.nome.equals(loro.recuperarNome());
	}
}
