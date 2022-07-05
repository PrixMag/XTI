package threads;//A M�quina JavaVirtual permite que um aplicativo tenha v�rios segmentos de execu��o em execu��o simultaneamente.

public class ComprasEmFamilia implements Runnable {//interface implements (toda interface tem implemnets)
	//A interface Runnable deve ser implementada por qualquer classe cujas inst�ncias s�o destinadas a ser executadas por um segmento. 
	//A classe deve definir um m�todo sem argumentos chamado run.
	
	ContaConjunta conta = new ContaConjunta();
    
	public static void main(String[] args) {
		
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();   
		
		new Thread(irAsCompras, "Pai").start();;
		new Thread(irAsCompras, "mae").start();
		new Thread(irAsCompras, "filho").start();
		new Thread(irAsCompras, "filha").start();

	}

	public void run() {//metodo chamado atraves do runnable
		String cliente = Thread.currentThread().getName();
		for (int i=0; i <5; i++) {
		conta.sacar(20, cliente);
		if(conta.getSaldo() < 0) {
			System.out.println("Estourou !!");
		}
	}
 }	
}
