import java.util.Scanner;

public class Exercicio6
{

    public static void main (String[] args)
    {
        primos();
    }

    public static boolean isPrime (int n)
    {
        if (n<=1) return false;

        if (n==2) return true;
        
        if (n%2 == 0) return false;

        for (int i=3 ; i<=Math.sqrt(n) ; i+=2)
            if (n%i == 0) return false;

        return true;
    }

    public static void primos ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza o numero máximo: ");
        int N = sc.nextInt();

        for (int i=1 ; i<N ; i++)
            if (isPrime(i))
                System.out.println(i + " é primo");
    
        sc.close();
    }
}