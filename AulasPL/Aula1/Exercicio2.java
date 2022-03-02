import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio2
{
    /** Função de inicio do programa */
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LocalDate date1 = getDate(sc);
        LocalDate date2 = getDate(sc);
        sc.close();
        String s = somadatas(date1, date2);
        System.out.println(s);
    }

    /** Função que retorna um objeto do tipo LocalDate contendo uma data introduzida pelo utilizador 
    * 
    * @param sc Objeto do tipo scanner usado para ler o input do user
    * @return data introduzida pelo utilizador atraves de um objeto do tipo LocalDate
    */
    public static LocalDate getDate (Scanner sc)
    {
        System.out.println("Insida dia, mes e ano: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();
        LocalDate date = LocalDate.of(ano, mes, dia);
        return date;
    }

    /** Função que retorna uma string no formato “ddD hhH mmM ssS” correspondente à soma de duas datas
    * 
    * @param date1 Objeto do tipo sLocalDate correspondente à primeira data a somar
    * @param date2 Objeto do tipo sLocalDate correspondente à segunda data a somar
    * @return string no formato “ddD hhH mmM ssS” correspondente à soma de date1 e date2
    */
    public static String somadatas (LocalDate date1, LocalDate date2)
    {
        int ano1 = date1.getYear();
        int ano2 = date2.getYear();

        long dias = ano1*365 + (ano1/4) + date1.getDayOfYear() + ano2*365 + (ano2/4) + date2.getDayOfYear();

        String r = new String(dias + "D " + dias*24 + "H " + dias*24*60 + "M " + dias*24*60*60 + "S");
        return r;
    }
}