import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int Calificacion;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de calificacion: ");
        Calificacion = scanner.nextInt();

        //instrucciones
        if (Calificacion < 70 ) {
            System.out.println("El numero de calificacion NO ACREDITADA: " + Calificacion);
        }
        else if (Calificacion > 70 ) {
            System.out.println("El numero de calificacion es: " + Calificacion);
        }
        else if (Calificacion == 69 ) {
            System.out.println("podemos redondear a 70 , su calificacion fue: " + Calificacion);
        }


        }
    }
