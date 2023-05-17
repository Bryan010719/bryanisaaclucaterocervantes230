import java.io.*;
public class tablamultiplicar3
{
    public static void main(String[] args){
        int tabla [][] = {{3,1,0},{3,2,0},{3,3,0},{3,4,0},{3,5,0}};



        for (int i = 0; i < tabla.length; i++) {
            System.out.println();
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
                tabla [i][2] = tabla [i][0] * tabla [i][1];

            }
        }


    }
}
