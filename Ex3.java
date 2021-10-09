import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		float x = entrada.nextFloat();
		
		System.out.print("Digite outro número: ");
		float y = entrada.nextFloat();
		
		System.out.println("A soma é: " + (x+y));
		entrada.close();	
	}

}



