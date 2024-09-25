import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int Meses_del_año;
        Scanner input = new Scanner(System.in);

        System.out.println("INGRESE EL MES DEL AÑO");
        int Meses = input.nextInt();

        if (Meses == 1 ) {
            System.out.println("Enero");
        }
        else if (Meses == 2 ) {
            System.out.println("Febrero");
        }
        else if (Meses == 3 ) {
            System.out.println("Marzo");
        }
        else if (Meses == 4 ) {
            System.out.println("Abril");
        }
        else if (Meses == 5 ) {
            System.out.println("Mayo");
        }
        else if (Meses == 6 ) {
            System.out.println("Junio");
        }
        else if (Meses == 7 ) {
            System.out.println("Julio");
        }
        else if (Meses == 8 ) {
            System.out.println("Agosto");
        }
        else if (Meses == 9 ) {
            System.out.println("Septiembre");
        }
        else if (Meses == 10) {
            System.out.println("Octubre");
        }
        else if (Meses == 11) {
            System.out.println("Noviembre");
        }
        else if (Meses == 12) {
            System.out.println("Diciembre");
        }
        else{
            System.out.println("Opcion no valida ");
        }





        }
    }
