
/**
 * LinhaEncomenda
 */
public class LinhaEncomenda {

    private String referencia, descricao;
    private int quantidade;
    private double precoProduto, regime, desconto;

    public LinhaEncomenda ()
    {
        this.referencia = "Sem produto";
        this.descricao = "Sem produto";
        this.quantidade = -1;
        this.precoProduto = -1;
        this.regime = 0;
        this.desconto = 0;
    }

    public LinhaEncomenda (String referencia, String descricao, int quantidade, double precoProduto, double regime, double desconto)
    {
        this.referencia = referencia;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoProduto = precoProduto;
        this.regime = regime;
        this.desconto = desconto;
    }

    public LinhaEncomenda (LinhaEncomenda le)
    {
        this.referencia = le.referencia;
        this.descricao = le.descricao;
        this.quantidade = le.quantidade;
        this.precoProduto = le.precoProduto;
        this.regime = le.regime;
        this.desconto = le.desconto;
    }

    public String getReferencia ()
    {
        return this.referencia;
    }

    public String getDescricao ()
    {
        return this.descricao;
    }
    public int getQuantidade ()
    {
        return this.quantidade;
    }
    public double getPrecoProduto ()
    {
        return this.precoProduto;
    }
    public double getRegime ()
    {
        return this.regime;
    }
    public double getDesconto ()
    {
        return this.desconto;
    }

    public void setReferencia (String referencia)
    {
        this.referencia = referencia;
    }

    public void setDescricao (String descricao)
    {
        this.descricao = descricao;
    }
    public void setQuantidade (int quantidade)
    {
        this.quantidade = quantidade;
    }
    public void setPrecoProduto (double precoProduto)
    {
        this.precoProduto = precoProduto;
    }
    public void setRegime (double regime)
    {
        this.regime = regime;
    }
    public void setDesconto (double desconto)
    {
        this.desconto = desconto;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if ((obj == null) || (obj.getClass() != this.getClass()))
            return false;

        LinhaEncomenda le = (LinhaEncomenda) obj;
        return (this.referencia.equals(le.getReferencia())) && (this.descricao.equals(le.getDescricao()))
            && (this.quantidade == le.getQuantidade()) && (this.precoProduto == le.getPrecoProduto())
            && (this.regime == le.getRegime()) && (this.desconto == le.getDesconto());
    }

    public LinhaEncomenda clone ()
    {
        return new LinhaEncomenda(this);
    }

    public String toString() {
        return "Referencia: " + this.referencia + "\nDescrição do produto: " + this.descricao +
                "\nQuantidade: " + this.quantidade + "\nPreco do produto: " + this.precoProduto +
                "\nRegime de imposto que se aplica ao produto: " + this.regime + "\nDesconto Comercial: " + this.desconto;
    }

    public double calculaValorLinhaEnc ()
    {
        double preco = (this.quantidade * this.precoProduto);
        preco -= preco*this.desconto;
        return preco + (preco*this.regime);
    }

    public double calculaValorDesconto ()
    {
        return (this.quantidade * this.precoProduto) * this.desconto;
    }
}