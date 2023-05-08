package Esercizio2;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("calcola km/litro");
			System.out.println("inserisci i km percorsi: ");
			int km = scanner.nextInt();

			System.out.println("inserisci i litri consumati: ");
			int litri = scanner.nextInt();
			System.out.println("I km/litro percorsi sono " + kmPerLitro(km, litri) + km + "km/" + litri + "l");

		} catch (ArithmeticException e) {
			System.out.println("puoi inserire solo numeri positivi");
		} finally {
			scanner.close();

		}

	}

	public static int kmPerLitro(int km, int litri) {

		return km / litri;
	}

}
