package Ficha1;
import java.util.Scanner;

public class Exercicio5
{

    public static void main (String[] args)
    {
        areatriangulo();
    }

    public static void areatriangulo ()
    {
        Scanner sc = new Scanner(System.in);
        float base = 1.0f, altura = 1.0f;

        while (base > 0.0f)
        {
            System.out.println("Introduza base e altura:");
            base = sc.nextFloat();
            altura = sc.nextFloat();
            if (base<0 || altura<0)
            {
                System.out.println("Valores devem ser maiores que zero.");
                continue;
            }
            System.out.printf("A área do triângulo é: %.5f\n", base*altura/2);
        }
        sc.close();
    }
}