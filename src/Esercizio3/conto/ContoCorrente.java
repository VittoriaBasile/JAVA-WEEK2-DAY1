package Esercizio3.conto;

import Esercizio3.exception.BancaExceptions;

public class ContoCorrente {
	String titolare;
	int nMovimenti;
	final int maxMovimenti = 50;
	double saldo;

	public ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		this.saldo = saldo;
		nMovimenti = 0;
	}

	public void preleva(double x) throws BancaExceptions {
		if (nMovimenti < maxMovimenti)
			saldo = saldo - x;
		try {
			if (saldo < 0) {
				throw new BancaExceptions("Il saldo è in rosso");

			}

		} catch (BancaExceptions e) {
			System.out.println(e.getLocalizedMessage());
		}
		nMovimenti++;
	}

	public double restituisciSaldo() {
		return saldo;
	}
}
