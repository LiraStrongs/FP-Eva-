import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      int Calificacion;
      Scanner captura = new Scanner(System.in);
      System.out.println("Introduce tu calificacion");
      Calificacion = captura.nextInt();

      if (Calificacion >= 0 && Calificacion <= 100) {
          System.out.println("El valor es: " + Calificacion);
      }
      else System.out.println("El valor no es valido");

      }




        }

