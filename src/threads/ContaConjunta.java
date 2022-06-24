package threads;

public class ContaConjunta {
		      
			private int saldo = 100;
			
			public int getSaldo() {
				return saldo; 
			}
			
			public synchronized void sacar(int valor, String cliente){//sincroniza a resposta das threads não interferindo na resposta uma das outras
				//bloqueia o metodo ate que ele seja executado
				if(saldo >= valor) {
					int saldoOriginal = saldo;
					System.out.println(cliente + " vai sacar");
					
					try {
						System.out.println(cliente + " esperando");
						Thread.sleep(1000);// aguardando processamento de saque
						
					} catch (InterruptedException e) {}
						saldo -= valor;
						String msg = cliente + " SACOU " + valor 
								+" [Saldo Original=" + saldoOriginal+", "
										+", Saldo Final=" +saldo + "]";
						System.out.println(msg);
				}else {
					System.out.println("Saldo insuficiente para " +cliente);
				}
			}
	}