import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a medida dos lados do quadrado: ");
		float lado = entrada.nextFloat();

		System.out.println("A �rea do quadrado �: " + (lado * lado));
		entrada.close();
	}

}
