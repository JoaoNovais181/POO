package Ficha3;


public class Lampada
{
    private double consumoMax, consumoEco, consumoAtual;
    private long msCriacao, msUltimoReset;

    public Lampada ()
    {
        this.consumoMax = 10;
        this.consumoEco = 3;
        this.consumoAtual = 0;
        this.msCriacao = System.currentTimeMillis();
        this.msUltimoReset = this.msCriacao;
    }

    public Lampada (double consumoMax, double consumoEco)
    {
        this.consumoMax = consumoMax;
        this.consumoEco = consumoEco;
        this.consumoAtual = 0;
        this.msCriacao = System.currentTimeMillis();
        this.msUltimoReset = this.msCriacao;
    }

    public Lampada (Lampada umaLampada)
    {
        this.consumoMax = umaLampada.getConsumoMax();
        this.consumoEco = umaLampada.getConsumoEco();
        this.consumoAtual = umaLampada.getConsumoAtual();
        this.msCriacao = umaLampada.getMsCriacao();
        this.msUltimoReset = umaLampada.getMsUltimoReset();
    }

    public void setConsumoMax (double consumoMax)
    {
        this.consumoMax = consumoMax;
    }

    public double getConsumoMax ()
    {
        return this.consumoMax;
    }

    public void setConsumoEco (double consumoEco)
    {
        this.consumoEco = consumoEco;
    }

    public double getConsumoEco ()
    {
        return this.consumoEco;
    }

    public double getConsumoAtual()
    {
        return this.consumoAtual;
    }

    public long getMsCriacao ()
    {
        return this.msCriacao;
    }

    public long getMsUltimoReset()
    {
        return this.msUltimoReset;
    }

    public String toStiString ()
    {
        String modo;
        if (this.consumoAtual == this.consumoMax)
        {
            modo = "em Modo Normal";
        }
        else if (this.consumoAtual == this.consumoEco)
        {
            modo = "em Modo ECO";
        }
        else
        {
            modo = "Desligada";
        }

        return "Lampada está " + modo + "\n"; 
    }

    public boolean equals (Object obj)
    {
        if (this==obj)
        {
            return true;
        }

        if (obj==null || (this.getClass() != obj.getClass()))
        {
            return false;
        }

        Lampada l = (Lampada)obj;

        return (this.consumoAtual==l.getConsumoAtual()) && (this.consumoEco==l.getConsumoEco()) && (this.consumoMax==l.getConsumoMax()) && (this.msCriacao==l.getMsCriacao()) && (this.msUltimoReset==l.getMsUltimoReset());
    }

    public Lampada clone ()
    {
        return new Lampada (this);
    }

    public void reset ()
    {
        this.consumoAtual = 0;
        this.msUltimoReset = 0;
    }

    public void lampOn ()
    {
        this.consumoAtual = this.consumoMax;
    }

    public void lampOff ()
    {
        this.consumoAtual = 0;
    }

    public void lampEco()
    {
        this.consumoAtual = this.consumoEco;
    }

    public double totalConsumo ()
    {
        long ms = System.currentTimeMillis();
        return (ms - this.msCriacao)*this.consumoAtual;
    }

    public double periodoConsumo ()
    {
        long ms = System.currentTimeMillis();
        return (ms - this.msUltimoReset)*this.consumoAtual;
    }
}