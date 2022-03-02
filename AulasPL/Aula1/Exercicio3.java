import java.util.Scanner;

public class Exercicio3
{
    /** Função de inicio do programa */
    public static void main (String[] args)
    {
        classificacoes();
    }

    /** Função que lê do utilizador uma nota entre 0 e 20 
    *
    * @param sc Objeto do tipo scanner usado para ler o input do user
    * @return Nota introduzida pelo user
    */
    public static int lerNota(Scanner sc)
    {
        int nota = -1;

        while (nota<0 || nota>20)
        {
            System.out.println("Introduza uma classificação de 0 a 20: ");
            nota = sc.nextInt();
        }

        return nota;
    }

    /** Função que lê o numero de notas a receber e as notas e imprime a quantidade de notas nos intervalos [0,5[, [5,10[, [10,15[ e [15,20] */
    public static void classificacoes ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza o numero de notas a receber: ");
        int N = sc.nextInt();
        int[] notas = new int[] {0,0,0,0};

        for (int i=0 ; i<N ; i++)
        {
            int nota = lerNota(sc);
            if (nota==20) notas[3]++;
            else notas[nota/5]++;
        }

        sc.close();
        System.out.println("Notas nos intervalos:\n\t[0 ,5 [ -> " + notas[0] + "\n\t[5 ,10[ -> " + notas[1] + "\n\t[10,15[ -> " + notas[2] + "\n\t[15,20] -> " + notas[3]);
    }
}