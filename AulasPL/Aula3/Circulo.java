/**Classe que implementa um Circulo no plano 2D 
 * 
 * @author 181 T-Bag
 * @version 1.0
*/
public class Circulo
{
    private double x,y, raio;

    /**Construtores da classe Circulo.
     * Declaraçao dos construtores por omissao, parametrizado e de cópia
     */

    /** Construtor por omissao de um Circulo */
    public Circulo()
    {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    /** Construtor parametrizado de um Circulo
     * 
     * @param x Coordenada no eixo das abcissas do centro do Círculo
     * @param y Coordenada no eixo das ordenadas do centro do Círculo
     * @param raio Valor do raio do Círculo
    */
    public Circulo(double x, double y, double raio)
    {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    /**  Construtor de cópia da Classe Circulo
     * 
     * @param c Variavel do tipo Circulo a copiar
    */
    public Circulo(Circulo c)
    {
        this.x = c.getX();
        this.y = c.getY();
        this.raio = c.getRaio();
    }

    /** Devolve o valor da coordenada em x do centro do Circulo
     * 
     * @return coordenada em x do centro do Circulo
     */
    public double getX()
    {
        return x;
    }    

    /** Devolve o valor da coordenada em y do centro do Circulo
     * 
     * @return coordenada em y do centro do Circulo
     */
    public double getY()
    {
        return y;
    }

    /** Devolve o valor do raio do circulo
     * 
     * @return valor do raio do Circulo
     */
    public double getRaio()
    {
        return raio;
    }

    /**
     * Atualizar o valor da coordenada em x do centro do circulo
     * @param x novo valor para a coordenada em x do centro do circulo
     */
    public void setX (double x)
    {
        this.x = x;
    }
    
    /**
     * Atualizar o valor da coordenada em y do centro do circulo
     * @param y novo valor para a coordenanda em x do centro do circulo
     */
    public void setY (double y)
    {
        this.y = y;
    }

    public void setRaio (double raio)
    {
        this.raio = raio;
    }

    public String toString() 
    {
        return "X: " + this.x + " Y: " + this.y + " Raio: " + this.raio;
    }

    public Circulo clone()
    {
        return new Circulo(this);
    }

    public boolean equals (Object o)
    {
        if (this == o)
            return true;
        
        if ((o==null) || (this.getClass() != o.getClass()))
            return false;
        
        Circulo c = (Circulo) o;
        return (this.x == c.getX()) && (this.y == c.getY()) && (this.raio == c.getRaio());
    }

    public void alteraCentro(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double calculaArea()
    {
        return Math.PI*Math.pow(this.raio, 2);
    }

    public double calculaPerimetro()
    {
        return 2*Math.PI*this.raio;
    }
}