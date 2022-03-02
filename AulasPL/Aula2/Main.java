import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a dimensão do array: ");
        int dimensao = sc.nextInt();
        
        Ficha2 aula2 = new Ficha2(dimensao, sc);

        System.out.println("O mínimo é: " + aula2.ex1a());

        System.out.println("Introduza 2 indices do array: ");
        int a = sc.nextInt(),b = sc.nextInt();

        System.out.println("Array resultante é: " + Arrays.toString(aula2.ex1b(a,b)));

        sc.close();
    }
} 