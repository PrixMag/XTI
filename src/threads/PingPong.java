package threads;

public class PingPong extends Thread //-->A Java virtual machine permite que um aplicativo tenha v�rios segmentos de execu��o em execu��o simultaneamente
{
	String palavra;
	long tempo;
	
	public PingPong(String palavra, long tempo ) 
	{	
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run () // metodos utilizados pela java virtual machine para imprimir a palavra dentro do tempo estimado
	{
		try 
		{
			for (int i = 0; i <5; i++)
			{
				System.out.println(palavra + " ");
				Thread.sleep(tempo);//(cessar temporariamente a execu��o) para o n�mero especificado de milissegundos, sujeito � precis�o e precis�o dos temporizadores e cronogramas do sistema
			}
		} 
		
		catch (InterruptedException e) // utilizada para parar a execu�ao da thread
		{
			return; 
		}
	}
	public static void main(String[] args) 
	{
		new PingPong("Ping", 1500).start();//para iniciar esta thread o java virtual machine chama o metodo run 
		new PingPong("Pong", 2000).start();// threads s�o sequencias de passos executadas uma de cada vez (sequencial) e as multithreads sao executadas varias atividades simultaneas
		System.out.println("Ver Trheads ");
	}

}