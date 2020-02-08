import java.util.Scanner;
/**
 * Resuelve operaciones aritmeticas con dos numeros enteros
 * 
 * @author Jeimmy Naranjo
 * @version 1
 */
public class Principal  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: a,b
        // 1. Definicion de variables
        double a, b;
        // Datos de salida
        double suma, resta, multiplicacion, division, residuodiv, logaritmo, potencia;
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese valor a:");
        a = teclado.nextInt();
        System.out.print("Ingrese valor b:");
        b = teclado.nextDouble();
        // 2. Realizar calculos
        suma = a + b;
        resta = b - a;
        multiplicacion = a * b;
        division = a / b;
        residuodiv = a % b; // Residuo de a/b
        logaritmo = Math.log(a); // Logaritmo de a
        potencia = Math.pow(a,b); // Potencia de "a elevado a la b"
        // Las funciones matematicas vienen definidas en la clase Math
        // Se deben llamar de la siguiente forma Math.funcion(argumentos)
        // 3. Mostrar datos de salida
        System.out.println("a + b =" + suma);
        System.out.println("b - a =" + resta);
        System.out.println("a * b =" + multiplicacion);
        System.out.println("a / b =" + division);
        System.out.println("Residuo de a / b =" + residuodiv);
        System.out.println("Log a =" + logaritmo);
        System.out.println("a exp b =" + potencia);
                                 
      
         
  } //Fin de la clase principal
}