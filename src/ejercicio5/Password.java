package ejercicio5;

public class Password {
	// Atributos
	private int longitud = 8;
	private String contrasena;

	// Constructores:

	// Por Defecto
	public Password() {
		
	}

	// Con la longitud que nosotros le pasemos, generará una contraseña aleatoria
	public Password(int longitud) {
		this.longitud = longitud;
		// this.contrasena =
	}

	// Métodos
	public boolean esFuerte() {
		
		
		return true;
	}

	public void esGenerarPassword() {
		
		
	}

	// Get para contrasena
	public String getContrasena() {
		return contrasena;
	}

	// Get para longitud
	public int getLongitud() {
		return longitud;
	}

	// Set para longitud
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

}
