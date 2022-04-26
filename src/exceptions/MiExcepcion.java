package exceptions;

public class MiExcepcion extends Exception{
	
	// Recoge el codigo de la excepción
	private int codigoException;
	
	// Constructor de clase
	public MiExcepcion(int codigoError) {
		super();
		this.codigoException = codigoError;
	}
	
	public MiExcepcion() {
		super();
	}
	
	// Método propio mostrar mensaje customizado
	
	public String getMessage() {
		String mensaje = "";
		
		switch (codigoException) {
		case 111:
			mensaje = "Exception 111: Has introducido un carácter que no es un Int";
			break;
		case 222:
			mensaje = "Exception 111: Has introducido un carácter que no es un Int";
			break;
		case 333:
			mensaje = "Exception 111: Has introducido un carácter que no es un Int";
			break;
		
		default:
			break;
		}
		
		return mensaje;
	}
	
}
