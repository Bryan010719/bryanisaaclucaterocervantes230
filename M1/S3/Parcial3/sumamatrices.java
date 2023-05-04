import java.io.*;

public class sumamatrices
{
    public static void main(String[] args)
    {
        int suma = 0;
        int[][] A = {{5, 1}, {3, 2}};
        for (int f = 0; f < A.length; f++)
        {
            for (int c = 0; c < A[f].length; c++)
            {
                {
               System.out.print(A[f][c]+" ");
                }
                suma = suma + A[f][c];







                }
            System.out.println();




        }
        System.out.println("la suma es: ");
        System.out.println(suma);

    }
}




