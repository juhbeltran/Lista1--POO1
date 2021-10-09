import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int latas = (int) 0;
		float litros = (float) 0.0;
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe em metros quadrados o tamanho da área a ser pintada: ");
		float area = entrada.nextFloat();
		litros = area / 3;
		latas = (int) (litros / 18);
		if ((litros % 18) != 0) 
			latas += 1;
		
	
		System.out.println("A quantidade de latas necesssárias é: " + latas);
		System.out.println("O preço total é: " + latas *80);
		
		entrada.close();
		
	}

}

