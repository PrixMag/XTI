/*
* Fluxo de Repetição Loops - For
* @author: Priscila Magalhães
*/

public class Loop {

	public static void main (String[] args) {
		
		int tamanho = 10;
		
		//um loop dentro do outro
		for (int x=0; x<tamanho; x++){
			for (int i=0; i<tamanho; i++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}