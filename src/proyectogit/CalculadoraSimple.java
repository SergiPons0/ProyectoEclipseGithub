package proyectogit;
import java.util.Scanner;

public class CalculadoraSimple {
	//<h1>Programa Calculadora Simple Java</h1>
	// <p>Funcion que sirve para sumar, recibe dos valores y devuelve la suma de ellos</p>
	public static double sumar(double a, double b) {
		return a + b;
		}
	// <p>Funcion que sirve para restar, recibe dos valores y revuelve la resta</p>
		public static double restar(double a, double b) {
		return a - b;
		}
	// <p>Programa principal, pide al usuario dos numeros para sumar y restar</p>,
		public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Calculadora Simple:");
		System.out.print("Introduce el primer número: ");
		double numero1 = scanner.nextDouble();      
		System.out.print("Introduce el segundo número: ");
		double numero2 = scanner.nextDouble();      
		double resultadoSuma = sumar(numero1, numero2);
		double resultadoResta = restar(numero1, numero2);
		System.out.println("Resultado de la suma: " + resultadoSuma);
		System.out.println("Resultado de la resta: " + resultadoResta);
		scanner.close();
		// Cambio realizado para la tasca
		// Cambio realizado desde la rama feature

		// Cambio realizado por un colaborador
		
		// Cambio realizado otra vez localmente
		}
}	


