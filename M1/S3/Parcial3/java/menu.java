import java.io.*;
import java.util.Scanner;
public class menu
{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;//Guardaremos la opcion del usuario
        do{
            System.out.println("1.opcion 1");
            System.out.println("2.opcion 2");
            System.out.println("3.opcion 3");
            System.out.println("4.salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("Has seleccionado opcion 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado opcion 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado opcion 3");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo numeros entre 1 y 4");
            }
        } while (opcion < 1 &&opcion > 3);



    }
}

