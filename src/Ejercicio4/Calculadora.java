package Ejercicio4;

import java.util.Scanner;

public class Calculadora {

	// Atributos
	private char operador = 0;
	private double valorA = 0;
	private double valorB = 0;

	// Constructores

	public Calculadora() {
		seleccionarOperador();
	}

	// Métodos

	public double valorEscaneadoA() {
		System.out.println("Introduce el valor A");
		Scanner libretaA = new Scanner(System.in);
		double valorAasignado = libretaA.nextDouble();
		return valorAasignado;
	}

	public double valorEscaneadoB() {
		System.out.println("Introduce el valor B");
		Scanner libretaB = new Scanner(System.in);
		double valorBasignado = libretaB.nextDouble();
		return valorBasignado;
	}

	public void sumar(double valorA, double valorB) {
		System.out.println((valorA + valorB));

	}

	public void restar(double valorA, double valorB) {
		System.out.println((valorA - valorB));

	}

	public void multiplicar(double valorA, double valorB) {
		System.out.println((valorA * valorB));

	}

	public void dividir(double valorA, double valorB) {
		System.out.println((valorA * valorB));

	}

	public void raizCuadrada(double valorA) {
		System.out.println(Math.sqrt(valorA));
	}

	public void raizCubica(double valorA) {
		System.out.println(Math.cbrt(valorA));
	}

	public void potencia(double valorA, double valorB) {
		System.out.println(Math.pow(valorA, valorB));
	}

	public void seleccionarOperador() {
		// Scanner sc = new Scanner(System.in);
		char operadorSeleccionado = 0;
		System.out.print("Selecciona el operador: ");
		System.out.print(" | Sumar [+]");
		System.out.print(" | Restar [-]");
		System.out.print(" | Multiplicar [*]");
		System.out.print(" | Dividir [/]  |");
		// Para recoger un char por scaner necesitamos usar [sc.next().charAt(0)]
		Scanner sc = null;
		operadorSeleccionado = sc.next().charAt(0);
		if (operadorSeleccionado == '+') {
			sumar(this.valorEscaneadoA(), this.valorEscaneadoB());
		} else if (operadorSeleccionado == '-') {
			restar(this.valorEscaneadoA(), this.valorEscaneadoB());
		}
		this.operador = operadorSeleccionado;
	}

	// Quiero crear un método con try/catch con el método anterior, para que me sea
	// más limpio

	/*
	 * public void seleccionarOperadorException() { try { seleccionarOperador(); }
	 * catch (Exception e) { System.out.println("Introduce un valor válido"); }
	 * finally { seleccionarOperador(); } }
	 */

}
