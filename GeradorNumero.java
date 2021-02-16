package ExerciciosTreino;

import java.util.Random;
import java.util.Scanner;

public class GeradorNumero {

	public static void main(String[] args) {

		int numerosorteado = 0;
		int tentativas = 0;
		int numero = 0;
		int sair = 0;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("numero entre 0 e 100: ");
			Random numeroaleatorio = new Random();
			numerosorteado = numeroaleatorio.nextInt(101);

			System.out.println("O numero esta rodando");
			tentativas = 0;
			
			do {
			tentativas++;
			System.out.println("tentativa :" + tentativas);
			numero = entrada.nextInt();

			if (numero > numerosorteado) {

				System.out.println("O numero " + numero + "é menor ");
			} else if (numero < numerosorteado) {
				System.out.println("o numero " + numero + " é maior ");
			} else
				System.out.println("vc acertou o numero em " + tentativas);

		} while (numero != numerosorteado);
		System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar:");
		sair = entrada.nextInt();
		}while(sair != 0);
		
		System.out.println("FIM!");
		entrada.close();

	}
}
