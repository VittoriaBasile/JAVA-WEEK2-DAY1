package Esercizio1;

import java.util.Arrays;
import java.util.Random;
//import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Random r = new Random();
		int[] numeriCasuali = new int[5];

		for (int i = 0; i < numeriCasuali.length; i++) {
			numeriCasuali[i] = r.nextInt(10);
		}
		Scanner scanner = new Scanner(System.in);
		int exit = -1;
		while (exit != 0) {
			System.out.println("Modifica il seguente array indicando posizione e nuovo valore(digita0 per uscire):");

			System.out.println(Arrays.toString(numeriCasuali));
			System.out.println("scrivi in che posizione dell' array vuoi scrivere");
			int posizione = scanner.nextInt();

			if (posizione > 0) {
				scanner.nextLine();
				switch (posizione) {
				case 1: {
					System.out.println("scrivi un valore da 1 a 10");
					try {
						int numero = scanner.nextInt();
						if (numero < 0 || numero > 10) {
							throw new NumeroTraZeroEDieci("Devi inserire un valore compreso tra 1 e 10");
						} else {

							numeriCasuali[0] = numero;
						}

					} catch (NumeroTraZeroEDieci e) {
						System.out.println(e.getMessage());

					}

					System.out.println(Arrays.toString(numeriCasuali));
					break;
				}
				case 2: {
					System.out.println("scrivi un valore da 1 a 10");
					try {
						int numero1 = scanner.nextInt();
						if (numero1 < 0 || numero1 > 10) {
							throw new NumeroTraZeroEDieci("Devi inserire un valore compreso tra 1 e 10");
						} else {

							numeriCasuali[0] = numero1;
						}

					} catch (NumeroTraZeroEDieci e) {
						System.out.println(e.getMessage());

					}

					System.out.println(Arrays.toString(numeriCasuali));
					break;

				}
				case 3: {
					System.out.println("scrivi un valore da 1 a 10");
					try {
						int numero2 = scanner.nextInt();
						if (numero2 < 0 || numero2 > 10) {
							throw new NumeroTraZeroEDieci("Devi inserire un valore compreso tra 1 e 10");
						} else {

							numeriCasuali[0] = numero2;
						}

					} catch (NumeroTraZeroEDieci e) {
						System.out.println(e.getMessage());

					}

					System.out.println(Arrays.toString(numeriCasuali));
					break;

				}
				case 4: {
					System.out.println("scrivi un valore da 1 a 10");
					try {
						int numero3 = scanner.nextInt();
						if (numero3 < 0 || numero3 > 10) {
							throw new NumeroTraZeroEDieci("Devi inserire un valore compreso tra 1 e 10");
						} else {

							numeriCasuali[0] = numero3;
						}

					} catch (NumeroTraZeroEDieci e) {
						System.out.println(e.getMessage());

					}

					System.out.println(Arrays.toString(numeriCasuali));
					break;

				}
				case 5: {
					System.out.println("scrivi un valore da 1 a 10");
					try {
						int numero4 = scanner.nextInt();
						if (numero4 < 0 || numero4 > 10) {
							throw new NumeroTraZeroEDieci("Devi inserire un valore compreso tra 1 e 10");
						} else {

							numeriCasuali[0] = numero4;
						}

					} catch (NumeroTraZeroEDieci e) {
						System.out.println(e.getMessage());

					}

					System.out.println(Arrays.toString(numeriCasuali));
					break;
				}

				default: {
					System.out.println("scrivi un numero da 1 a 5!");
					break;
				}

				}
			} else {
				exit = 0;
			}
			scanner.close();

		}

	}
}
