package Ejercicio3;

public class Ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		try {
			r1.comprobarNumero();
		} catch (ExceptionsIfNumeroImpar e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExceptionsIfNumeroPar e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
