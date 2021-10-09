import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int n1 = entrada.nextInt();

		System.out.print("Digite outro número inteiro: ");
		int n2 = entrada.nextInt();

		System.out.print("Digite um número real: ");
		float n3 = entrada.nextFloat();
		
		
		System.out.println((n1*n1) *( n2/2));
		System.out.println((3*n1) + n3);
		System.out.println(n3 * n3 * n3);
		entrada.close();
	}

}
