import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quanto voc� ganha por hora? ");
		float s = entrada.nextFloat();

		System.out.print("Informe quantas horas trabalhadas: ");
		int h = entrada.nextInt();

		System.out.println("O total do seu sal�rio  �: " + (s * h) + " reais");
		entrada.close();
	}

}