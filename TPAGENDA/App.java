package TPAGENDA;
import java.util.Scanner;
///import java.text.SimpleDateFormat;
///import java.util.Date;

public class App {

    ///public static SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/YYYY"); 
    public static void main(String[] args) {
    
 
        
        ///Date fechaActual = new Date();       
        Scanner input = new Scanner(System.in);

        int menu = 9;
 
        while(menu != 0){
            System.out.println(" Presione 1 para cargar una nueva Tarea-Evento-Recordatorio a tu agenda ");
            System.out.println(" Presione 2 para buscar una Tarea-Evento-Recordatorio de tu agenda y modificarla");
            System.out.println(" Presione 3 para eliminar una Tarea-Evento-Recordatorio de tu agenda");
            System.out.println(" Presione 0 para salir del programa");
            menu = input.nextInt();
            input.nextLine();

            switch(menu){
                case 1:
                System.out.print("\033[H\033[2J");                


                
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
                System.out.println(" Ingrese una opcion valida ");
                break;

            }
            


        }

        input.close();
    }







}
