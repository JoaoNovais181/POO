import java.util.Scanner;

public class Exemplo1
{
        /** Função para retornar o maior entre 2 numeros introduzidos pelo utilizador*/
        public static void maior ()
        {
            int a, b;
            Scanner sc = new Scanner(System.in);

            System.out.println("Indique dois inteiros: ");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("O maior é: " + Math.max(a,b));
            sc.close();
        }

        /** Início do programa */
        public static void main (String[] args)
        {
            maior();
        }
}