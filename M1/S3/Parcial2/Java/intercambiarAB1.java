import java.io.*;
public class intercambiar
{
    public static void main(String[] args) 
        {
           int a = 3, b = 8, t = 0;
           t = a;
           a = b;
           b = t;
           System.out.println("El valor de A es: "+a);
           System.out.println("El valor de B es: "+b);
        }
}
