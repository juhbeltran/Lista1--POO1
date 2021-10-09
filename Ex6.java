import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o raio do circulo: ");
		float raio = entrada.nextFloat();

		System.out.println("A área do circulo é: " + (3.1415 * raio * raio));
		entrada.close();
	}

}
