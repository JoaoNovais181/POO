package Ficha2;
import java.security.cert.CertPathParameters;

public class Ficha2ex5
{
    String[] array;
    int occupation;

    public Ficha2ex5 ()
    {
        array = new String[10];
        occupation = 0;
    }

    public Ficha2ex5 (int capacity)
    {
        array = new String[capacity];
        occupation = 0;
    }

    public int search (String key)
    {
        int i;

        for (i=0 ; i<occupation ; i++)
            if (array[i].equals(key))
                return i;

        return -1;
    }

    public String[] semRep ()
    {
        String[] v = new String[array.length];
        int j=0;

        for (String s : array)
            if ()
    }
}