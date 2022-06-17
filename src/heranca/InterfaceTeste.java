package heranca;

public class InterfaceTeste {

	public static void area (AreaCalculavel o) {
		System.out.println(o.calculaArea());
		}
		
	public static void main(String[] args) {	
		area (new Quadrado(2));
		}
	}
