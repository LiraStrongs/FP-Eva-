import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int Dia_De_La_Semana;
        Scanner input = new Scanner(System.in);


        System.out.print("Digite el dia da semana: ");
        Dia_De_La_Semana = input.nextInt();

        //conditionals
        if(Dia_De_La_Semana == 1){
            System.out.println("Domingo");
        }
        else if(Dia_De_La_Semana == 2){
            System.out.println("Lunes");
        }
        else if(Dia_De_La_Semana == 3){
            System.out.println("Martes");
        }
        else if(Dia_De_La_Semana == 4){
            System.out.println("Miercoles");
        }
        else if(Dia_De_La_Semana == 5){
            System.out.println("Jueves");
        }
        else if(Dia_De_La_Semana == 6){
            System.out.println("Viernes");
        }
        else if(Dia_De_La_Semana == 7){
            System.out.println("Sabado");
        }
        else {
            System.out.println("Error");
        }



        }
    }
