import java.io.*;

public class TablasMultiplicacion
{
    public static void main(String[] args)
    {
        int [] [] ventas = new int [4][6];
        double [] [] temperaturas= new double[3][4];
        int [][] m =new int[3][];
        m[0] = new int [3];
        m[1] = new int [5];
        m[2] = new int [2];
        int [] [] numeros = {{6,7,5},{3,8,4},{1,0,2},{9,5,2}};
        int[] [] A = {{6,7,5,0,4},{3,8,4},{1,0,2,7},{9,5}};


        System.out.println("Valores introducidos:");
        for(int f = 0; f < A.length; f++)
        {
            for(int C = 0; C < A[f].length; C++)
            {
                System.out.println(A[f][C]+" ");
            }
        }
    }
}


