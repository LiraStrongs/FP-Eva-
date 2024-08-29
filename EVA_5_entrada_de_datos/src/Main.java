import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String nombre;

        //captura de datos del teclado
        //Scaner--> herramientas(clase)
        //Scaner es un tipo  de datos

        Scanner captu; //incorporar herramienta al codigo
                       //no existe, hay que crearla

        captu = new Scanner(System.in);//creamos la herramienta
                                       //Darle instrucciones al usuario

        System.out.println("Dame tu nombre completo"); //capturar
        nombre = captu.nextLine();//capturamos los datos hasta el ªenter"

        //imprimir datos
        System.out.println("<<<<<<<<<<<Datos a capturar>>>>>>>>>>>>>");
        System.out.println(nombre);



    }
}