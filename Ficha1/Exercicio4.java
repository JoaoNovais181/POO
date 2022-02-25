import java.util.Scanner;

public class Exercicio4
{

    public static void main (String[] args)
    {
        temperaturas();
    }

    public static int media (int[] arr)
    {
        int s = 0;
        for (int i=0 ; i<arr.length ; i++) s+= arr[i];

        return s/arr.length;
    }

    public static void temperaturas ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza o número de temperaturas a ler (pelo menos 2): ");
        int N = sc.nextInt();
        int[] temperaturas = new int[N];
        int variacaoMaxima = 0, dia = 0;
        temperaturas[0] = sc.nextInt();

        for (int i = 1 ; i<N ; i++)
        {
            temperaturas[i] = sc.nextInt();
            int aux = temperaturas[i] - temperaturas[i-1];
            if (Math.abs(aux) >= Math.abs(variacaoMaxima))
            {
                variacaoMaxima = aux;
                dia = i;
            }
        }

        sc.close();
        System.out.println("A média das  temperaturas foi de " + media(temperaturas) + " graus.\nA maior variação registou-se entre os dias " + dia + " e " + (dia+1) + ", tendo a temperatura " + ((variacaoMaxima>0) ?"subido " :"descido ") + Math.abs(variacaoMaxima) + " graus.");
    }
}