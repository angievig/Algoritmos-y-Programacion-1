import java.util.Scanner;

public class ProblemasCondicionales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Problema 1: Edad y voto
        System.out.println("\nProblema 1: Edad y voto");
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        esElegibleParaVotar(edad); //llamado void

        /*
        
        // Problema 2: Número mayor
        System.out.println("\nProblema 2: Número mayor");
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("El número mayor es: " + obtenerNumeroMayor(num1, num2));
        
        // Problema 3: Calificación de exámenes
        System.out.println("Problema 3: Calificación de exámenes");
        System.out.print("Ingrese la calificación: ");
        int calificacion = scanner.nextInt();
        System.out.println("Calificación en letra: " + obtenerCalificacionEnLetra(calificacion));
        

        // Problema 4: Día de la semana
        System.out.println("\nProblema 4: Día de la semana");
        System.out.print("Ingrese un número del 1 al 7: ");
        int numeroDia = scanner.nextInt();
        System.out.println("El día de la semana es: " + obtenerDiaDeLaSemana(numeroDia));
        
        // Problema 5: Calculadora simple
        System.out.println("\nProblema 5: Calculadora simple");
        System.out.print("Ingrese el primer número: ");
        double num3 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num4 = scanner.nextDouble();
        System.out.print("Ingrese la operación (+, -, *, /): ");
        String operacion = scanner.next();
        System/.out.println("El resultado es: " + calcular(num3, num4, operacion));
        
        // Problema 5: 
        */
        scanner.close();
    }

    // Método para el problema 1: Edad y voto
    /**
     * tipo de retorno: void
     * nombre del método: esElegibleParaVotar
     * Parametros:
     * - int edad, la edad de la persona
     * */
    public static void esElegibleParaVotar(int edad) {
        
    }

    /*
    // Método para el problema 2: Número mayor
    public static int obtenerNumeroMayor(int num1, int num2) {
        
    }

    // Método para el problema 3: Calificación de exámenes
    public static char obtenerCalificacionEnLetra(int calificacion) {
        
    }

    // Método para el problema 4: Día de la semana
    public static String obtenerDiaDeLaSemana(int numeroDia) {
        
    }
    // Método para el problema 5: Calculadora simple
    public static double calcular(double num1, double num2, String operacion) {
 
    }
*/
    


}
