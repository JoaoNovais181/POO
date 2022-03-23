/**Classe que implementa um Circulo no plano 2D 
 * 
 * @author 181 T-Bag
 * @version 1.0
*/
public class Circulo
{
    private Ponto centro;
    private double raio;

    /**Construtores da classe Circulo.
     * Declaraçao dos construtores por omissao, parametrizado e de cópia
     */

    /** Construtor por omissao de um Circulo */
    public Circulo()
    {
        this.centro = new Ponto();
        this.raio = 0;
    }

    /** Construtor parametrizado de um Circulo
     * 
     * @param x Coordenada no eixo das abcissas do centro do Círculo
     * @param y Coordenada no eixo das ordenadas do centro do Círculo
     * @param raio Valor do raio do Círculo
    */
    public Circulo(Ponto centro, double raio)
    {
        this.centro = new Ponto(centro);
        this.raio = raio;
    }

    /**  Construtor de cópia da Classe Circulo
     * 
     * @param c Variavel do tipo Circulo a copiar
    */
    public Circulo(Circulo c)
    {
        this.centro = new Ponto(c.getCentro());
        this.raio = c.getRaio();
    }

    /** Devolve o valor das coordenadas do centro do Circulo
     * 
     * @return instancia da classe Ponto representante do centro do circulo
     */
    public Ponto getCentro()
    {
        return new Ponto(centro); 
    }

    /** Devolve o valor do raio do circulo
     * 
     * @return valor do raio do Circulo
     */
    public double getRaio()
    {
        return this.raio;
    }

    /**
     * Atualizar o valor da coordenada em x do centro do circulo
     * @param centro Novo valor para as coordenadas do centro
     */
    public void setCentro (Ponto centro)
    {
        this.centro = new Ponto(centro);
    }

    public void setRaio (double raio)
    {
        this.raio = raio;
    }

    public String toString() 
    {
        return "Circulo: " + this.centro.toString() + " Raio: " + this.raio;
    }

    public Circulo clone()
    {
        return new Circulo(this);
    }

    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;
        
        if ((obj==null) || (this.getClass() != obj.getClass()))
            return false;
        
        Circulo c = (Circulo) obj;
        return (this.centro.equals(c.getCentro())) && (this.raio == c.getRaio());
    }

    public void alteraCentro(Ponto umPonto)
    {
        this.setCentro(umPonto);
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