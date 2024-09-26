import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int dia_de_la_semana;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca un numero de la semana del 1 al 7");
        dia_de_la_semana = input.nextInt();

        switch (dia_de_la_semana) {
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("LUNES");
                break;

                case 3: System.out.println("MARTES");
                        break;

                case 4:
                    System.out.println("MIERCOLES");
                    break;

                        case 5:
                            System.out.println("JUEVES");
                            break;

                            case 6:
                                System.out.println("VIERNES");
                                break;

                                case 7:
                                    System.out.println("SABADO");
                                    break;

                                    default:
                                        System.out.println("ERROR");

        }




        }
    }
