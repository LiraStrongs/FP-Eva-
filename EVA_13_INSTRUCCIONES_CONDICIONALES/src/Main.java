import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int edad;
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese su edad");
        edad = sc.nextInt();


       //instrucciones
        if(edad>=18){
            System.out.println("Adulto mayor de edad");
        }                                     //SI (algo se cumple) ES VERDADERO
        else if(edad<18){System.out.println("MENOR DE EDAD");
        }


    }
    }
