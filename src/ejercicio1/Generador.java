package ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Generador {

	// Atributos
	static private int numeroGenerado;
	static private int numeroElegido;

	// Constructores
	public Generador() {
		this.numeroGenerado = generarNumero(1, 4);
		this.numeroElegido = obtenerNumero();
	}

	// Getters & Setters
	public int getNumeroGenerado() {
		return numeroGenerado;
	}

	public void setNumeroGenerado(int numeroGenerado) {
		this.numeroGenerado = numeroGenerado;
	}

	public int getNumeroElegido() {
		return numeroElegido;
	}

	public void setNumeroElegido(int numeroElegido) {
		this.numeroElegido = numeroElegido;
	}

	// Métodos:

	// Para generar un número entre numMinimo y numMaximo
	public int generarNumero(int min, int max) {
		Random numeroRandom = new Random();
		return numeroRandom.nextInt(max + 1 - min) + min;
	}

	// Para pedirle al usuario que introduzca un número
	public int obtenerNumero() {
		while(true) { // Siempre entrará
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println(this.numeroGenerado);
			System.out.print("Introduce un número: ");
			numeroElegido = sc.nextInt(); // p
			break; // Si numElegido es de tipo correcto, el break nos sacará fuera del while
				   // Si el numElegido es incorrecto, el break no se ejecutará pq el catch recogerá la excepcion
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\nERROR: No has introducido un valor de tipo int.\n");
		}
	}
		return numeroElegido;
		
	}

	// Comprobar si numElegido es mayor menor o igual que numGenerado y volver a
	// pedir numElegido
	public void comprobarNumeros() {
		int intentos = 0;
		boolean acertado = false;
		while (!acertado) {

			if (this.numeroElegido > this.numeroGenerado) { // Mayor que
				System.out.println(this.numeroElegido + " es mayor que el número generado");
				intentos++;
				System.out.println("Número de intentos: " + intentos);
				this.numeroElegido = obtenerNumero();
			} else if (this.numeroElegido < this.numeroGenerado) { // Menor que
				System.out.println(this.numeroElegido + " es menor que que el número generado");
				intentos++;
				System.out.println("Número de intentos: " + intentos);
				this.numeroElegido = obtenerNumero();
			} else if (this.numeroElegido == this.numeroGenerado) {
				System.out.println(
						this.numeroElegido + " es igual al número que ha escogido la máquina: " + this.numeroGenerado);
				System.out.println("Has Ganado.");
				intentos++;
				System.out.println("Número de intentos: " + intentos);
				acertado = true;
			}
		}
	}

}
