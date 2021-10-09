import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int latasg = (int) 0;
		float litrosg = (float) 0.0;
		int latasp = (int) 0;
		float litrosp = (float) 0.0;
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe em metros quadrados o tamanho da área a ser pintada: ");
		float area = entrada.nextFloat();
		litrosg= area / 6;
		latasg =  (int) (litrosg / 18);
		if ((litrosg % 18) != 0) 
			latasg += 1;
		
		
		
		litrosp = area / 6;
		latasp = (int) (litrosp / 3.6);
		if ((litrosp % 3.6) != 0) 
			latasp += 1;
		
	
		System.out.println("A quantidade de latas de 18l necesssárias é: " + latasg);
		System.out.println("O preço total é: R$" + latasg *80 + " reais");
		System.out.println("A quantidade de latas de 3.6l necesssárias é: " + latasp);
		System.out.println("O preço total é: R$" + latasp *25 + " reais");
		
		
		entrada.close();
		
	}

}
