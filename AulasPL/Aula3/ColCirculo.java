import java.util.ArrayList;

/**
 * ColCirculo
 */
public class ColCirculo {

    private ArrayList<Circulo> colecao;

    public ColCirculo ()
    {
        this.colecao = new ArrayList<Circulo>();
    }

    public ColCirculo (ArrayList<Circulo> colecao)
    {
        this.colecao = new ArrayList<Circulo>(colecao);
    }

    public ColCirculo (ColCirculo umaColCirculo)
    {
        this.setColecao(umaColCirculo.getColecao());
    }

    public int qualEoIndice (Circulo circulo)
    {
        return this.colecao.indexOf(circulo);
    }

    public void remove (Circulo circulo)
    {
        if (this.colecao.contains(circulo))
        {
            this.colecao.remove(circulo);
        }
    }

    public ArrayList<Circulo> getColecao()
    {
        return new ArrayList<Circulo>(this.colecao);
    }

    public void setColecao (ArrayList<Circulo> colecao)
    {
        this.colecao = new ArrayList<Circulo>(colecao);
        // this.colecao = new ArrayList<Circulo>();
        // for (Circulo aux : colecao)
        // {
            // this.colecao.add(aux);
        // }
    }

    public String toString ()
    {
        return "ColCirculo: " + this.colecao.toString();
    }

    public ColCirculo clone ()
    {
        return new ColCirculo(this);
    }

    public boolean equals (Object obj)
    {
        return true;
    }
}