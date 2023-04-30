import java.io.*;

public class TablasMultiplicacion2
{
    public static void main(String[] args) {
        //ventas
        int[][] ventas = new int[4][6];
        ventas[0][0] = 3;
        ventas[0][1] = 5;
        ventas[0][2] = 7;
        ventas[0][3] = 9;
        ventas[0][4] = 1;
        ventas[0][5] = 9;
        ventas[1][0] = 7;
        ventas[1][1] = 2;
        ventas[1][2] = 9;
        ventas[1][3] = 1;
        ventas[1][4] = 3;
        ventas[1][5] = 8;
        ventas[2][0] = 9;
        ventas[2][1] = 9;
        ventas[2][2] = 9;
        ventas[2][3] = 9;
        ventas[2][4] = 9;
        ventas[2][5] = 9;
        ventas[3][0] = 0;
        ventas[3][1] = 5;
        ventas[3][2] = 4;
        ventas[3][3] = 6;
        ventas[3][4] = 1;
        ventas[3][5] = 0;
        System.out.print("VENTAS:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println();
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print(ventas[i][j] + " ");
            }
        }
        System.out.println("");
        System.out.println("--------------------------------");
        //temperaturas
        double[][] temperaturas = new double[3][4];
        temperaturas[0][0] = 3.7;
        temperaturas[0][1] = 5.9;
        temperaturas[0][2] = 7.9;
        temperaturas[0][3] = 9.0;
        temperaturas[1][0] = 7.2;
        temperaturas[1][1] = 2.1;
        temperaturas[1][2] = 9.3;
        temperaturas[1][3] = 1.7;
        temperaturas[2][0] = 9.8;
        temperaturas[2][1] = 9.9;
        temperaturas[2][2] = 9.3;
        temperaturas[2][3] = 9.8;
        System.out.print("TEMPERATURAS:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println();
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.print(temperaturas[i][j] + " ");
            }
        }
        System.out.println("");
        System.out.println("--------------------------------");
        //irregular
        System.out.println("IRREGULAR:");
        int num[][] = new int[3][];
        num[0] = new int[1];
        num[1] = new int[3];
        num[2] = new int[1];

        int count = 0;
        for (int i = 0; i < num.length; i++)
            for (int j = 0; j < num[i].length; j++)
                num[i][j] = count++;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++)
                System.out.print(num[i][j] + " ");
            System.out.println();
        }
        System.out.println("--------------------------------");
        //numeros
        System.out.println("NUMEROS:");
        int[][] numeros = {{6, 7, 5}, {3, 8, 4}, {1, 0, 2}, {9, 5, 2}};
        System.out.println("");
        System.out.println(numeros[0][0] + (" ") + numeros[0][1] + (" ") + numeros[0][2]);
        System.out.println(numeros[1][0] + (" ") + numeros[1][1] + (" ") + numeros[1][2]);
        System.out.println(numeros[2][0] + (" ") + numeros[2][1] + (" ") + numeros[2][2]);
        System.out.println(numeros[3][0] + (" ") + numeros[3][1] + (" ") + numeros[3][2]);
        System.out.println("--------------------------------");
        //a
        System.out.println("A:");
        int[][] A ={{5,1,0},{3,2,0},{5,3,0}};
        System.out.println(A[0][0] +(" ")+ A[0][1] +(" ")+ A[0][2]);
        System.out.println(A[1][0] +(" ")+ A[1][1] +(" ")+ A[1][2]);
        System.out.println(A[2][0] +(" ")+ A[2][1] +(" ")+ A[2][2]);
        System.out.println("--------------------------------");



    }
}





