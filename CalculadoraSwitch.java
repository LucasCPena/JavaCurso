package ExerciciosTreino;

import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double num1 = 0;
		double num2 = 0;
		String opera��o = "";
		int op��o = 1;
		do {
			System.out.println("Digite um numero: ");
			num1 = entrada.nextDouble();

			System.out.println("Digite outro numero: ");
			num2 = entrada.nextDouble();

			System.out.println("Diga uma opera��o: ");
			opera��o = entrada.next();

			switch (opera��o) {
			case "+":
				System.out.println(num1 + num2);
				break;
			case "-":
				System.out.println(num1 - num2);
				break;
			case "*":
				System.out.println(num1 * num2);
				break;
			case "/":
				System.out.println(num1 / num2);
				break;
			case "%":
				System.out.println(num1 % num2);
				break;
			default:
				System.err.println("Essa opera��o n�o existe");
			}
			System.out.println("Voce quer encerrar a opera��o, se sim digite 0, se n�o digite outro numero");
			op��o = entrada.nextInt();
		} while (op��o != 0);
		
	System.out.println("Fim do calculo");
		entrada.close();
	}
}
