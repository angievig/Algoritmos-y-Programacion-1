import java.util.Scanner;
public class PromedioPonderado{

 public static void main (String[] args){

    //Entradas
    String nombre;
    double n1, n2, n3;
    int c1, c2, c3;

    //Salida
    double promedio = 0;
    String mensaje= "";

    //Declaro lector

    Scanner reader = new Scanner(System.in);

    System.out.println("Digite su nombre");
    nombre = reader.next();

    mensaje+= nombre + " tu promedio ponderado es " + promedio;

    System.out.println(mensaje);






 }

}