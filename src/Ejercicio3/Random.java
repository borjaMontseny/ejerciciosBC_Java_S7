package Ejercicio3;

public class Random {

	// Atributos
	private int numero;

	// Constructores

	public Random() {
		numero = (int) (Math.random() * 998 + 1);
	}

	// Getters

	public int getNumero() {
		return numero;
	}

	// Métodos

	public void comprobarNumero() throws ExceptionsIfNumeroImpar, ExceptionsIfNumeroPar {

		if (numero % 2 != 0) {
			throw new ExceptionsIfNumeroImpar(numero);
		} else {
			throw new ExceptionsIfNumeroPar(numero);
		}
	}

}