import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu sexo: 1 - homem ou 2- mulher ");
		int sexo = entrada.nextInt();
		
		System.out.print("Informe a sua altura: ");
		float altura = entrada.nextFloat();

		

		if (sexo == 1) 

			
		System.out.println("O seu peso ideal é: " + ((72.7 * altura) - 58));
		else
		System.out.println("O seu peso ideal é: " + ((62.1 * altura) - 44.7));
		entrada.close();
	}

}


	