import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String marca;
        String modelo;
        int year;//la "ñ" en otros lnguajes no es aceptada
        double precio;
        Scanner capcut;
        capcut = new Scanner(System.in);
        //capturar


       System.out.print("Marca ");
       marca = capcut.nextLine();
       System.out.print("Modelo ");
       modelo = capcut.nextLine();
       System.out.print("Year ");
       year = capcut.nextInt();
       System.out.print("Precio ");
       precio = capcut.nextDouble();


       //imprimir
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);







    }
}