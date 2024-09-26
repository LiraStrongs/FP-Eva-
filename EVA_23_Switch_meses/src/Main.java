import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int meses_año;
        Scanner input = new Scanner(System.in);

        System.out.println("introduzca el numero del mes");
        meses_año = input.nextInt();

        switch (meses_año){
            case 1:
                System.out.println("Mes de enero");
                break;
                case 2:
                    System.out.println("Mes de febrero");
                    break;
                    case 3:
                        System.out.println("Mes de marzo");
                        break;
                        case 4:
                            System.out.println("Mes de abril");
                            break;
                            case 5:
                                System.out.println("Mes de mayo");
                                break;
                                case 6:
                                    System.out.println("Mes de junio");
                                    break;
                                    case 7:
                                        System.out.println("Mes de julio");
                                        break;
                                        case 8:
                                            System.out.println("Mes de agosto");
                                            break;
                                            case 9:
                                                System.out.println("Mes de septiembre");
                                                break;
                                                case 10:
                                                    System.out.println("Mes de octubre");
                                                    break;
                                                    case 11:
                                                        System.out.println("Mes de noviembre");
                                                        break;
                                                        case 12:
                                                            System.out.println("Mes de diciembre");
                                                            break;
                                                            case 13:
            default:
        }



        }
    }
