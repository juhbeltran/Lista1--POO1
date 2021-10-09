import java.util.Scanner; 

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float INSS = (float) 0.0;
		float sindicato = (float) 0.0;
		float IR = (float) 0.0;
		float SL = (float) 0.0;
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quanto você ganha por hora? ");
		float s = entrada.nextFloat();

		System.out.print("Informe quantas horas trabalhadas: ");
		int h = entrada.nextInt();
		
		
			
		INSS = (float)((s * h)* 0.11);
		sindicato = (float) ((s * h )* 0.05);
		IR = (float) ((s * h )* 0.08);
		SL = ((s*h) - INSS - sindicato - IR);
		
		
		

		System.out.println("O total do seu salário bruto é: " + (s * h) + " reais");
		System.out.println("Você pagou: " + INSS + " reais ao INSS");
		System.out.println("Você pagou: " + sindicato + " reais ao sindicato");
		System.out.println("Você pagou: " + IR + " reais de imposto de renda");
		System.out.println("O seu salário líquido é " + SL + " reais");
		
		
		
		entrada.close();
	
	}

}
