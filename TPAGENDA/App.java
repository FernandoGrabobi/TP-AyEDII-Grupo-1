package TPAGENDA;
import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

    
        int menu = 9;
        int op1 = 0;
        ArrayList<Evento> events = new ArrayList<Evento>();
        ArrayList<Tarea> tasks = new ArrayList<Tarea>();
        ArrayList<Recordatorio> remiders = new ArrayList<Recordatorio>();

        while(menu != 0){
            System.out.println("\n Presione 1 para cargar una nueva Tarea-Evento-Recordatorio a tu agenda ");
            System.out.println("\n Presione 2 para buscar una Tarea-Evento-Recordatorio de tu agenda y modificarla ");
            System.out.println("\n Presione 3 para eliminar una Tarea-Evento-Recordatorio de tu agenda ");
            System.out.println("\n Presione 0 para salir del programa ");
            menu = input.nextInt();
            input.nextLine();

            switch(menu){
                case 1:
                System.out.print("\033[H\033[2J");                
                System.out.println("\n Que desea ingresar: \n 1 para ingresar una tarea \n 2 para ingresar un evento \n 3 para ingresar un recordatorio\n");
                op1 = input.nextInt();
                input.nextLine();

                switch(op1){
                    case 1:

                    break;
                    case 2:

                    break;
                    case 3:

                    break;
                    default:
                    System.out.print("\033[H\033[2J");
                    System.out.println("\n Ingrese una opcion valida ");
                    break;
                }
                
                break;
                case 2:
                System.out.print("\033[H\033[2J");



                break;
                case 3:
                System.out.print("\033[H\033[2J");
                

                break;
                case 0:
                System.out.print("\033[H\033[2J");
                System.out.println(" El programa a finalizado correctamente ");
                break;
                default:
                System.out.print("\033[H\033[2J");
                System.out.println(" \n Ingrese una opcion valida ");
                break;

            }
            


        }

        input.close();
    }

}
