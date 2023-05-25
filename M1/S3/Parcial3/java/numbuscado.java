import java.io.*;
public class buscar
{
    public static void main(String[] args){
        int[] listanumeros = {0,9,4,1,3,7};
        int encontrado = 0,numbuscado = 1;
        for (int i = 0; i < listanumeros.length;i++)
        {
            encontrado = 1;
        }
        if(encontrado == 1)
            System.out.print("Numero: "+numbuscado+", encontrado");
        else{
            System.out.print("Numero: "+numbuscado+", No encontrado");
        }


    }
}
