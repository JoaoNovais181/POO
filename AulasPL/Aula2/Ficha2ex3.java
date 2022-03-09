import java.time.LocalDate;

public class Ficha2ex3
{
    private LocalDate[] datas;
    private int capacidade, pos;

    public Ficha2ex3 (int cap)
    {
        capacidade = cap;
        datas = new LocalDate[capacidade]; 
        pos = 0;
    }

    public Ficha2ex3 ()
    {
        capacidade = 5;
        datas = new LocalDate[capacidade]; 
        pos = 0;
    }

    public void insereData(LocalDate data)
    {
        datas[pos++] = data;
    }

    private long LocalDateparaDias (LocalDate data)
    {
        long dias = (data.getYear()*365) + (data.getYear()/4) + data.getDayOfYear();
        return dias;
    }

    public LocalDate dataMaisProxima (LocalDate data)
    {
        int r=0;
        long dias = LocalDateparaDias(data), dif = Math.abs(dias - LocalDateparaDias(datas[r]));
        for (int i=1 ; i<pos ; i++)
        {
            long aux = Math.abs(LocalDateparaDias(datas[i]) - dias);
            if (aux < dif) 
            {
                dif = aux;
                r = i;
            }
        }
        return datas[r];
    }

    public String toString ()
    {
        String str = "[";
        for (int i=0; i<pos-1 ; i++)
            str += datas[i].toString() + ", ";
        return str + datas[pos-1] + "]";
    }
}