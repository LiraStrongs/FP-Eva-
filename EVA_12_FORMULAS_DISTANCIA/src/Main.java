import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Asignacion
        double tiempo,velocidadinicial,aceleracioninicial;
        double distancia;
        Scanner capcut
                = new Scanner(System.in);

        //datos y captura
        System.out.println("vamos a calcular la distanca!!");
        System.out.println("Ingrese el velocidad de inicial");
        velocidadinicial = capcut.nextDouble();
        System.out.println("Ingrese el tiempo");
        tiempo = capcut.nextDouble();
        distancia = velocidadinicial*tiempo; // google me dijo eso pero tmb esta esta formula---> d = Vi. t+1/2. a.t^2
        System.out.println("la distancia fue: "+distancia);

        System.out.println("Bien, ahora lo mismo pero con la aceleracion" );
        System.out.println("vamos a calcular la distanca!!");
        System.out.println("Ingrese el velocidad de inicial");
        velocidadinicial = capcut.nextDouble();
        System.out.println("Ingrese el tiempo");
        tiempo = capcut.nextDouble();
        System.out.println("ingrese la aceleracion:");
        aceleracioninicial = capcut.nextDouble();
        distancia = velocidadinicial*tiempo+(aceleracioninicial*tiempo*tiempo)*1/2;
        System.out.println("la distancia fue: "+distancia);




    }
    }
