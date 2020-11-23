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
		System.out.println("digite 1 para adição!");
		System.out.println("digite 2 para subtração!");
		
		int key = opc.nextInt();
		switch (key) {
		case 1:
			System.out.println("a adiçao do primeiro e do segundo numero foi");
			
			resultado = n1+n2;
			System.out.println(resultado);
			break;
			
		case 2:
			System.out.println("a subtraçao do primeiro e do segundo numero foi");
			
			resultado = n1-n2;
			System.out.println(resultado);
			 break;
		
		case 3:
			System.out.println("a multiplicação do primeiro e do segundo numero foi");
			
			resultado = n1*n2;
			System.out.println(resultado);
			break;
			
		case 4:
			System.out.println("a divisao do primeiro e do segundo numero foi");
			
			resultado = n1/n2;
			System.out.println(resultado);
			 break;
		
		
		default:
			
	
			System.out.println("opçao não existente");
			break;
		}
		
	}


}