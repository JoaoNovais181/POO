package Ficha1;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Exercicio7
{

    public static void main (String[] args)
    {
        idadeatual();
    }

    public static long LocalDateTimetoHour (LocalDateTime date)
    {
        long ano = date.getYear() - 1900;
        long dias = ano*365;
        dias += (ano/4);
        dias += date.getDayOfYear();
        return dias*24 + date.getHour();
    }

    public static void idadeatual ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza dia, mes e ano");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();
        
        LocalDateTime datanascimento = LocalDateTime.of(ano, mes, dia, 0, 0, 0);
        LocalDateTime atual = LocalDateTime.now();

        long nascHoras = LocalDateTimetoHour(datanascimento);
        long atualHoras = LocalDateTimetoHour(atual);

        sc.close();
        System.out.print("Tem atualmente " + (atualHoras-nascHoras) + " horas de idade.\nCalculo feito em ");
        System.out.printf("%02d-%02d-%04d %02d:%02d:%02d\n", atual.getDayOfMonth(), atual.getMonthValue(), atual.getYear(), atual.getHour(), atual.getMinute(), atual.getSecond());
    }
}