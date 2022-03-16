import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Encomenda
 */
public class Encomenda {

    private String nomeCliente, NIFCliente, moradaCliente;
    private int numeroEncomenda;
    private LocalDate dataEncomenda;
    private ArrayList<LinhaEncomenda> linhasEncomenda;
    // private LinhaEncomenda[] linhasEncomenda;

    public Encomenda ()
    {
        this.nomeCliente = "Nao tem";
        this.NIFCliente = "Nao tem";
        this.moradaCliente = "Nao tem";
        this.numeroEncomenda = -1;
        this.dataEncomenda = null;
        this.linhasEncomenda = new ArrayList<LinhaEncomenda>();
    }

    public Encomenda (String nomeCliente, String NIFCliente, String moradaCliente, int numeroEncomenda, LocalDate dataEncomenda, ArrayList<LinhaEncomenda> le)
    {
        this.nomeCliente = nomeCliente;
        this.NIFCliente = NIFCliente;
        this.moradaCliente = moradaCliente;
        this.numeroEncomenda = numeroEncomenda;
        this.dataEncomenda = dataEncomenda;
        this.linhasEncomenda = new ArrayList<LinhaEncomenda>(le);
    }

    public Encomenda (Encomenda enc)
    {
        this.nomeCliente = enc.getNomeCliente();
        this.NIFCliente = enc.getNIFCliente();
        this.moradaCliente = enc.getMoradaCliente();
        this.numeroEncomenda = enc.getNumeroEncomenda();
        this.dataEncomenda = enc.getDataEncomenda();
        this.linhasEncomenda = new ArrayList<LinhaEncomenda>(enc.getLinhaEncomenda());  
    }

    public String toString ()
    {
        return "Nome Cliente: " + this.nomeCliente + "\nNIF do Cliente: " + this.NIFCliente + 
            "\nMorada do Cliente: " + this.moradaCliente + "\nNumero da encomenda: " + this.numeroEncomenda
            + "\nData da encomenda: " + this.dataEncomenda.toString() + "\nLinhas de Encomenda: " + this.linhasEncomenda.toString();
    }

    public String getNomeCliente ()
    {
        return this.nomeCliente;
    }

    public void setNomeCliente (String nomeCliente)
    {
        this.nomeCliente = nomeCliente;
    }

    public String getNIFCliente ()
    {
        return this.NIFCliente;
    }

    public void setNIFCliente (String NIFCliente)
    {
        this.NIFCliente = NIFCliente;
    }

    public String  getMoradaCliente ()
    {
        return this.moradaCliente;
    }

    public void setMoradaCliente (String moradaCliente)
    {
        this.moradaCliente = moradaCliente;
    }

    public int getNumeroEncomenda ()
    {
        return this.numeroEncomenda;
    }

    public void setNumeroEncomenda (int numeroEncomenda)
    {
        this.numeroEncomenda = numeroEncomenda;
    }

    public LocalDate getDataEncomenda ()
    {
        return this.dataEncomenda;
    }

    public void setDataEncomenda (LocalDate dataEncomenda)
    {
        this.dataEncomenda = dataEncomenda;
    }

    public ArrayList<LinhaEncomenda> getLinhaEncomenda ()
    {
        return new ArrayList<LinhaEncomenda> (this.linhasEncomenda);
    }

    public void setLinhasEncomenda (ArrayList<LinhaEncomenda> le)
    {
        this.linhasEncomenda = new ArrayList<LinhaEncomenda>(le);
    }

    public double calculaValorTotal ()
    {
        double valorTotal = 0;

        for (LinhaEncomenda le : this.linhasEncomenda)
            valorTotal += le.calculaValorLinhaEnc();

        return valorTotal;
    }

    public double calculaValorDesconto ()
    {
        double valorDesconto = 0;
        for (LinhaEncomenda le : this.linhasEncomenda)
            valorDesconto += le.calculaValorDesconto();

        return valorDesconto;
    }

    public int numeroTotalProdutos ()
    {
        int numeroTotalProdutos = 0;
        for (LinhaEncomenda le : this.linhasEncomenda)
            numeroTotalProdutos += le.getQuantidade();

        return numeroTotalProdutos;
    }

    public boolean existeProdutoEncomenda (String refProduto)
    {
        for (LinhaEncomenda le : this.linhasEncomenda)
            if (refProduto.equals(le.getReferencia()))
                return true;

        return false;
    }

    public void adicionaLinha (LinhaEncomenda linha)
    {
        this.linhasEncomenda.add(linha.clone());
    }

    public void removeProduto (String codProd)
    {
        int i=0;
        for (LinhaEncomenda le : this.linhasEncomenda)
        {
            if (codProd.equals(le.getReferencia()))
                break;
            i++;
        }

        if (i<this.linhasEncomenda.size())
        {
            this.linhasEncomenda.remove(i);
        }
    }

}