package Esercizio3;

import Esercizio3.conto.ContoCorrente;
import Esercizio3.conto.ContoOnLine;
import Esercizio3.exception.BancaExceptions;

public class Banca {

	public static void main(String args[]) {
		ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

		System.out.println("Saldo conto iniziale: " + conto1.restituisciSaldo());

		try {
			conto1.preleva(500);

			System.out.println("Saldo conto dopo il prelievo: " + conto1.restituisciSaldo());
		} catch (BancaExceptions e) {
			System.out.println("Errore durante il prelievo: " + e);
			e.printStackTrace();
		}

		ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

		conto2.stampaSaldo();

		try {
			conto2.preleva(10);

			conto2.stampaSaldo();

		} catch (BancaExceptions e) {
			System.out.println("Errore durante il prelievo: " + e);
			e.printStackTrace();
		}
	}

}
