package proyectogit;
import java.util.Scanner;

public class CalculadoraSimple {
	//<h1>Programa Calculadora Simple Java</h1>
	// <h3>Funcion que sirve para sumar, recibe dos valores y devuelve la suma de ellos</h3>
	public static double sumar(double a, double b) {
		return a + b;
		}
	// <h3>Funcion que sirve para restar, recibe dos valores y revuelve la resta</h3>
		public static double restar(double a, double b) {
		return a - b;
		}
	// <h3>Programa principal, pide al usuario dos numeros para sumar y restar</h3>
		public static void main(String[] args) {
		
		// <p>Abrimos la clase scanner para scanear valores introducidos por el usuario</p>	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculadora Simple:");
		
		// <p>Escaneamos el primer valor introducid por el usuario</p>
		System.out.print("Introduce el primer número: ");
		double numero1 = scanner.nextDouble();      
		
		//<p>Escaneamos el segundo valor introducid por el usuario</p>
		System.out.print("Introduce el segundo número: ");
		double numero2 = scanner.nextDouble();      
		double resultadoSuma = sumar(numero1, numero2);
		double resultadoResta = restar(numero1, numero2);
		
		// Imprimimos la suma y la resta
		System.out.println("Resultado de la suma: " + resultadoSuma);
		System.out.println("Resultado de la resta: " + resultadoResta);
		scanner.close();
		// Cambio realizado para la tasca
		// Cambio realizado desde la rama feature

		// Cambio realizado por un colaborador
		
		// Cambio realizado otra vez localmente
		}
}	


