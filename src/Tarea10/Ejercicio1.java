package Tarea10;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector= new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");			
		float numero1 = lector.nextFloat();
				
		System.out.println("Introduce el segundo número:");
		float numero2 = lector.nextFloat();
		
		if(numero2 == 0 || numero1 == 0){
		System.out.println("Ese numero no se puede dividir.");
		} else {
			float resultado = numero1/numero2;
			System.out.println("La división es " + numero1 + " / " + numero2 + " = " + resultado);
		}
	}

}
