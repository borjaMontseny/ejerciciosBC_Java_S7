package Ejercicio3;

public class ExceptionsIfNumeroImpar extends Exception {

	// Recoge el número de la excepción
	private int numero;

	// Constructor de clase
	public ExceptionsIfNumeroImpar(int numero) {
		super();
		this.numero = numero;
	}

	// Método propio mostrar mensaje customizado
	public String getMessage() {
		String mensaje = "El número aleatorio generado es impar: " + this.numero;
		return mensaje;
	}

}
