import java.util.Scanner;
 class Main {
    public static void main(String[] args) {

        int Kilometros;
        int Tiempo;
        Scanner captu;
        captu = new Scanner(System.in);

        //captura
        System.out.println("Ingrese el numero de Kilometros:");
        Kilometros = captu.nextInt();
        System.out.println("Ingrese el numero de Tiempo en meses:");
        Tiempo = captu.nextInt();

        //condicion
        if (Kilometros >=5000 || Tiempo >5) {
            System.out.println("necesitas un cambio de aceite");
        }
        else {
            System.out.println("Todo bien");
        }



        }
    }
