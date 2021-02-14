package ExerciciosTreino;

import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double num1 = 0;
		double num2 = 0;
		String operação = "";
		int opção = 1;
		do {
			System.out.println("Digite um numero: ");
			num1 = entrada.nextDouble();

			System.out.println("Digite outro numero: ");
			num2 = entrada.nextDouble();

			System.out.println("Diga uma operação: ");
			operação = entrada.next();

			switch (operação) {
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
				System.err.println("Essa operação não existe");
			}
			System.out.println("Voce quer encerrar a operação, se sim digite 0, se não digite outro numero");
			opção = entrada.nextInt();
		} while (opção != 0);
		
	System.out.println("Fim do calculo");
		entrada.close();
	}
}
