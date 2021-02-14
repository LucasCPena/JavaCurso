package ExerciciosTreino;

import java.util.Scanner;

public class TEste2calc {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int resultado = 0;
		int opção1 = 1;
		

		String operação = "";


		while (opção1 != 0)  {
		
			
			System.out.println("Digite um numero: ");
			num1 = entrada.nextInt();
			
			System.out.println("Digite outro numero ");
			num2 = entrada.nextInt();
			
			entrada.nextLine();
			
			System.out.println("Digite uma operação :");
			operação = entrada.nextLine();

			if (operação.equals("+")) {
				resultado = num1 + num2;
			} else if (operação.equals("-")) {
				resultado = num1 - num2;
			} else if (operação.equals("*")) {
				resultado = num1 * num2;
			} else if (operação.equals("/")) {
				resultado = num1 / num2;
			} else if (operação.equals("%")) {
				resultado = num1 % num2;
			}

			System.out.println("o resultado da operação é " + resultado);
			System.out.println("Se quiser sair digite 0, se não escolha qualquer outro numero: ");
			opção1 = entrada.nextInt();
			
		}
	System.out.println("Fim da operação");

		entrada.close();
	}

}