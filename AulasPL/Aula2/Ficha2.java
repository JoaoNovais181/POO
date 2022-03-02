import java.util.Arrays;
import java.util.Scanner;

public class Ficha2
{
    
    int [] valores;
    Scanner scanner;

    public Ficha2 (int N, Scanner sc)
    {
        valores = new int[N];
        scanner = sc;
    }

    public int ex1a ()
    {
        System.out.println("Insira " + valores.length + " inteiros");
        int min = Integer.MAX_VALUE;
        for (int i=0 ; i<valores.length ; i++)
        {
            valores[i] = scanner.nextInt();
            // min = Integer.min(min, valores[i]);
            if (valores[i] < min) min = valores[i];
        }
        // System.out.println("O array é: " + Arrays.toString(valores));
        return min;
    }

    // Assumindo que foi chamado primeiro o ex1a para popular o array
    public int[] ex1b (int a, int b)
    {
        int len = Math.abs(a-b) + 1;
        // System.out.println("Insira " + valores.length + " inteiros");
        // for (int i=0 ; i<valores.length ; i++) 
            // valores[i] = scanner.nextInt();
        int[] r = new int[len];
        System.arraycopy(valores, Math.min(a,b), r, 0, len);
        return r;
    }

    public int[] ex1c ()
    {
        int[] v2 = new int[valores.length];
        System.out.println("Insira " + valores.length + " inteiros para o segundo array");
        for (int i=0 ; i<v2.length ; i++) 
            v2[i] = scanner.nextInt();

        int[] v = new int[valores.length];
        int j=0;
        for (int i=0 ; i<valores.length ; i++)
            for (int valor: valores)
                if (valor==v2[i]) v[j++] = v2[i];


        return v;
    }
 
}