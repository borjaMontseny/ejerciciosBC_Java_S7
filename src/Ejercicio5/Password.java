package Ejercicio5;

import java.util.Scanner;

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
	
	public String pedirContrasena() {
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		System.out.print("Introduce la contraseña que quieres utilizar: ");
		String contrasenaDada = sc.nextLine();
		return this.contrasena = contrasenaDada;	
	}
	
	public boolean esFuerte() {
		// Los requisitos de la contraseña:
		int maximoCaracteres;
		int minimoMayus = 2;
		int minimoMinus = 2;
		
		// Contadores para la contraseña:
		int contadorCaracteres = 0;
		int contadorMayus = 0;
		int contadorMinus = 0;
		
		
		
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
