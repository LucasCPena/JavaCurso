package ExerciciosTreino;

import java.util.Scanner;

public class TEste2calc {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int resultado = 0;
		int op��o1 = 1;
		

		String opera��o = "";


		while (op��o1 != 0)  {
		
			
			System.out.println("Digite um numero: ");
			num1 = entrada.nextInt();
			
			System.out.println("Digite outro numero ");
			num2 = entrada.nextInt();
			
			entrada.nextLine();
			
			System.out.println("Digite uma opera��o :");
			opera��o = entrada.nextLine();

			if (opera��o.equals("+")) {
				resultado = num1 + num2;
			} else if (opera��o.equals("-")) {
				resultado = num1 - num2;
			} else if (opera��o.equals("*")) {
				resultado = num1 * num2;
			} else if (opera��o.equals("/")) {
				resultado = num1 / num2;
			} else if (opera��o.equals("%")) {
				resultado = num1 % num2;
			}

			System.out.println("o resultado da opera��o � " + resultado);
			System.out.println("Se quiser sair digite 0, se n�o escolha qualquer outro numero: ");
			op��o1 = entrada.nextInt();
			
		}
	System.out.println("Fim da opera��o");

		entrada.close();
	}

}