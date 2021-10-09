import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a primeira nota: ");
		float n1 = entrada.nextFloat();

		System.out.print("Informe a segunda nota: ");
		float n2 = entrada.nextFloat();

		System.out.print("Informe a terceira nota: ");
		float n3 = entrada.nextFloat();

		System.out.print("Informe a quarta nota: ");
		float n4 = entrada.nextFloat();

		System.out.println("A média é: " + ((n1 + n2 + n3 + n4) / 4));
		entrada.close();
	}

}