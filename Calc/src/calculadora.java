import java.util.Scanner;

public class calculadora {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	
	
		int n1;
		int n2;
		int resultado;
	
		Scanner opc = new Scanner(System.in);
		
		System.out.println("digire o primeiro numero.");
		n1 = opc.nextInt();
		System.out.println("digite o segundo numero.");
		n2 = opc.nextInt();
		System.out.println("digite 1 para adi��o!");
		System.out.println("digite 2 para subtra��o!");
		
		int key = opc.nextInt();
		switch (key) {
		case 1:
			System.out.println("a adi�ao do primeiro e do segundo numero foi");
			
			resultado = n1+n2;
			System.out.println(resultado);
			break;
			
		case 2:
			System.out.println("a subtra�ao do primeiro e do segundo numero foi");
			
			resultado = n1-n2;
			System.out.println(resultado);
			 break;
		
		case 3:
			System.out.println("a multiplica��o do primeiro e do segundo numero foi");
			
			resultado = n1*n2;
			System.out.println(resultado);
			break;
			
		case 4:
			System.out.println("a divisao do primeiro e do segundo numero foi");
			
			resultado = n1/n2;
			System.out.println(resultado);
			 break;
		
		
		default:
			
	
			System.out.println("op�ao n�o existente");
			break;
		}
		
	}


}