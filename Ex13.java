import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float excesso = (float) 0.0;
		float multa = (float) 0.0;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o peso: ");
		float peso = entrada.nextFloat();

		if (peso > 50)
			

		excesso = (peso - 50);
		multa = (excesso * 4);
		System.out.println("O excesso é de: " + excesso + "kg e a multa é de: " + multa + " reais");

		entrada.close();

	}
}