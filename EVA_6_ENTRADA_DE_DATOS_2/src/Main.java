import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //declaracion variables

        String nombre ;
        String curp;
        int edad;
        double promedio;
        //crear scanner

        Scanner captu;
        captu = new Scanner(System.in);
        //capturar
        System.out.println("Ingrese el nombre completo: ");
        nombre = captu.nextLine();
        System.out.println("Ingrese la curp: ");
        curp = captu.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = captu.nextInt();
        System.out.println("Ingrese la promedio: ");
        promedio = captu.nextDouble();

        //impresion
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);

    }
}