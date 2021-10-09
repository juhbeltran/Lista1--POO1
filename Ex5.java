import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		System.out.print("Informe um número em metros: ");
		float m = entrada.nextFloat();
		
		System.out.println("Essa metragem equivale a : " + (m * 100) + "cm");
		entrada.close();
		
	}

}
