package Esercizio3.exception;

public class BancaExceptions extends Exception {
	public BancaExceptions(String message) {
		super(message);
		toString(message);
	}

	public String toString(String str) {
		return str;
	}

}
