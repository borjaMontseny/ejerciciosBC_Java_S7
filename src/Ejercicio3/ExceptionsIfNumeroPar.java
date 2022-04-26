package Ejercicio3;

public class ExceptionsIfNumeroPar extends Exception {

	// Recoge el número de la excepción
	private int numero;

	// Constructor de clase
	public ExceptionsIfNumeroPar(int numero) {
		super();
		this.numero = numero;
	}

	// Método propio mostrar mensaje customizado
	public String getMessage() {
		String mensaje = "El número aleatorio generado es par: " + this.numero;
		return mensaje;
	}

}
