package Ficha1;

import java.util.Scanner;

public class Exemplo3
{
    /** Calcular o somatório de 10 numeros introduzidos pelo utilizador */
    public static void somatorio ()
    {
        int soma = 0;
        Scanner sc = new Scanner(System.in);

        for (int i=0 ; i<10 ; i++)
        {
            System.out.print("Insira o proximo inteiro: ");
            soma += sc.nextInt();
        }

        sc.close();
        System.out.println("O somatório é: " + soma);
    }
    /** Iniciar o programa */
    public static void main (String[] args)
    {
        somatorio();
    }
}
