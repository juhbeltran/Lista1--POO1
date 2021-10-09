import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a temperatura em Farenheit: ");
		float f = entrada.nextFloat();
		
		System.out.println("A temperatura em graus Celcius  é: " + (5 * (f - 32) / 9) );
		entrada.close();
	
		
		

		
		
		
	}

}
