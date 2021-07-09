package Tarea10;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector= new Scanner(System.in);
		System.out.println("Introduce el primer número:");			
		int numero1 = lector.nextInt();
				
		System.out.println("Introduce el segundo número:");
		int numero2 = lector.nextInt();

		int sobra = numero1%numero2;

		if (sobra==0)
		  System.out.println(numero1 + " es múltiplo de " + numero2);
		else
		  System.out.println(numero1 + " NO es múltiplo de " + numero2);
	}

}
