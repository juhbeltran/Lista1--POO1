import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a sua altura: ");
		float altura = entrada.nextFloat();

		System.out.println("O seu peso ideal é: " +  ((72.7 * altura) - 58));

		entrada.close();
	}

}
