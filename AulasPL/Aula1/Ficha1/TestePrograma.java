import java.util.Scanner;
import java.lang.Integer;

public class TestePrograma
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Ficha1 ficha1 = new Ficha1();

        System.out.println("Insira Temperatura em Celcius");
        double celcius = sc.nextDouble();
        double f = ficha1.celsiusParaFarenheit(celcius);
        System.out.println(celcius + "ºC == " + f + "ªF");

        System.out.println("Introduza dois valores");
        int a = sc.nextInt(), b = sc.nextInt();
        int m = ficha1.maximoNumeros(a, b);
        System.out.println("O maior é: " + m);

        System.out.println("Introduza o seu nome(String) e o seu saldo (decimal)");
        sc.nextLine();
        String nome = sc.nextLine();
        double saldo = sc.nextDouble();
        String descr = ficha1.criaDescricaoConta(nome, saldo);
        System.out.println(descr);

        System.out.println("Introduza um valor em euros e uma taxa de conversao para libras");
        double valor = sc.nextDouble(), taxaConversao = sc.nextDouble();
        double libras = ficha1.eurosParaLibras(valor, taxaConversao);
        System.out.println(valor + "€ == " + libras + "£");

        ficha1.doisIntMedia(sc);

        if (args.length > 0) 
        {
            Integer num = Integer.parseInt(args[0]);
            long fact = ficha1.factorial(num);
            System.out.println("Factorial de " + num + " é " + fact);
        }

        long t = ficha1.tempoGasto();
        System.out.println("Gastou " + t + "ms");
        sc.close();
    }
}