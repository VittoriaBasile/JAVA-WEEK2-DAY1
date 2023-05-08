package Esercizio3.conto;

import Esercizio3.exception.BancaExceptions;

public class ContoOnLine extends ContoCorrente {
	double maxPrelievo;

	public ContoOnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	public void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	public void preleva(double x) throws BancaExceptions {
		try {
			if (x <= maxPrelievo) {
				super.preleva(x);

			} else {
				throw new BancaExceptions("il prelievo non è disponibile");

			}

		} catch (BancaExceptions e) {
			System.out.println(e.getMessage());
		}

	}

}
