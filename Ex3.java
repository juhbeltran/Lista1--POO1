import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		float x = entrada.nextFloat();
		
		System.out.print("Digite outro n�mero: ");
		float y = entrada.nextFloat();
		
		System.out.println("A soma �: " + (x+y));
		entrada.close();	
	}

}



