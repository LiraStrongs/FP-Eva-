import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String usu, pwd;
        Scanner captu = new Scanner(System.in);




        System.out.print("Introduzca el usuario: ");
        usu = captu.nextLine();
        System.out.println("introduzca la contraseña");
        pwd = captu.nextLine();


       if(usu.equals("Admin")&& pwd.equals("1234")){
          System.out.println("acceso concedido");
       }
       else if(usu.equals("User")&& pwd.equals("1234")){
           System.out.println("acceso denegado");
       }







        }
    }
