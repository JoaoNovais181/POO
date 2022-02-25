public class OlaAlguem
{
    final double pi = 3.14;

    /**Método Auxiliar */
    public static String geraSaudacao (String nome)
    {
        return "Olá " + nome + "!";
    }
    /** Início do programa */
    public static void main (String[] args)
    {
        String saudacao = geraSaudacao("Mundo");
        System.out.println(saudacao);
    }
}