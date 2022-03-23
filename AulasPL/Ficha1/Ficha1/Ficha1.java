package Ficha1.Ficha1;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;

public class Ficha1
{

    public double celsiusParaFarenheit(double graus)
    {
        return graus*1.8 + 32.0;
    }

    public int maximoNumeros(int a, int b)
    {
        return (a>b) ?a :b;
    }

    public String criaDescricaoConta(String nome, double saldo)
    {
        String r = new String(nome + " tem " + saldo + "€ na sua conta!!");
        return r;
    }

    public double eurosParaLibras(double valor, double taxaConversao)
    {
        return valor*taxaConversao;
    }

    public void doisIntMedia (Scanner sc)
    {
        System.out.println("Introduza 2 inteiros");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b)
        {
            a += b;
            b =  a;
            a -= b;
        }

        System.out.println(a + ", " + b + ", média = " + ((float)(a+b)/2));
    }

    public long factorial(int num)
    {
        if (num < 0) return -1;

        if (num==0) return 1;
        
        long r = num;

        for(int i=num-1 ; i>0 ; r*=i, i--);

        return r;
    }

    public long tempoGasto()
    {
        LocalDateTime inicio = LocalDateTime.now();
        factorial(5000);
        LocalDateTime fim = LocalDateTime.now();

        Duration dif = Duration.between(inicio, fim);

        return dif.toMillis();
    }
}