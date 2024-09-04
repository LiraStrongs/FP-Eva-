import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       double Celcius;
       double Fahrenheit;
       double Kelvin;

        Scanner input = new Scanner(System.in);
        System.out.print("captura los Fahrenheits (F a C): ");
        Fahrenheit = input.nextDouble();
        Celcius = (Fahrenheit - 32) * 5 / 9;// tambien puede ponerce en punto decimal la fraccion
        System.out.println("Celcius: " + Celcius);

        System.out.print("Para convertir de K a ºF  ");
        Kelvin= input.nextDouble();
        Fahrenheit = 1.8*(Kelvin - 273.15) + 32;
        System.out.println("Fahrenheit: " + Fahrenheit);

        System.out.println("de F a K: " );
        Fahrenheit = input.nextDouble();
        Kelvin = 5/9 *(Fahrenheit - 32) + 273.15;
        System.out.println("Kelvin: " + Kelvin);








        }
    }
