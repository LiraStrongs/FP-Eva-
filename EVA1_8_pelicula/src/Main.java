import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       String Nombre;
       String Genero;
       String Reparto;
       int duracion;
       String Clasificacion;
        Scanner capcut;
        capcut = new Scanner(System.in);
        //capturar

        System.out.println("Ingrese el Nombre de la pelicula: ");
        Nombre = capcut.nextLine();
        System.out.println("Ingrese el Genero de la pelicula: ");
        Genero = capcut.nextLine();
        System.out.println("Ingrese el Reparto de la pelicula: ");
        Reparto = capcut.nextLine();
        System.out.println("Ingrese la duracion de la pelicula: ");
        duracion = capcut.nextInt();
        System.out.println("Ingrese la clasificacion de la pelicula: ");
        Clasificacion = capcut.nextLine();

        //imprimir

        System.out.println(Nombre);
        System.out.println(Genero);
        System.out.println(Reparto);
        System.out.println(duracion);
        System.out.println(Clasificacion);





        }
    }
