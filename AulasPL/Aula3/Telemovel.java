
public class Telemovel {

    private String marca, modelo;
    private int displayX, displayY;
    private byte armMsg, armFoto, armApp;
    private int armOcupado, armFotoAppTotal, armMax;
    private String[] msgs, apps;
    private int numMsg, numFoto, numApps;

    public Telemovel ()
    {
        this.marca = "N/A";
        this.modelo = "N/A";
        this.displayX = 0;
        this.displayY = 0;
        this.armMsg = 0;
        this.armFoto = 0;
        this.armApp = 0;
        this.armOcupado = 0;
        this.armFotoAppTotal = 0;
        this.armMax = 0;
        this.msgs = new String[10];
        this.apps = new String[10];
        this.numMsg = 0;
        this.numFoto = 0;
        this.numApps = 0;
    }

    public Telemovel (String marca, String modelo, int displayX, int displayY, byte armMsg, byte armFoto, byte armApp, byte armMax)
    {
        this.marca = new String(marca);
        this.modelo = new String(modelo);
        this.displayX = displayX;
        this.displayY = displayY;
        this.armMsg = armMsg;
        this.armFoto = armFoto;
        this.armApp = armApp;
        this.armFotoAppTotal = (int) (0.8*armMax);
        this.armMax = armMax;
        this.armOcupado = 0;
        this.msgs = new String[10];
        this.apps = new String[10];
        this.numMsg = 0;
        this.numFoto = 0;
        this.numApps = 0;
    }

    public Telemovel (String marca, String modelo, int displayX, int displayY, byte armMsg, byte armFoto, byte armApp, int armMax, int armOcupado, int numMsg, int numFoto, int numApps, String[] msgs, String[] aps)
    {
        this.marca = new String(marca);
        this.modelo = new String(modelo);
        this.displayX = displayX;
        this.displayY = displayY;
        this.armMsg = armMsg;
        this.armFoto = armFoto;
        this.armApp = armApp;
        this.armMax = armMax;
        this.armOcupado = armOcupado;
        this.armFotoAppTotal = (int) (0.8*armMax);
        this.msgs = new String[msgs.length];
        System.arraycopy(msgs, 0, this.msgs, 0, numMsg);
        this.apps = new String[apps.length];
        System.arraycopy(apps, 0, this.apps, 0, numApps);
        this.numMsg = numMsg;
        this.numFoto = numFoto;
        this.numApps = numApps;
    }

    public Telemovel (Telemovel t)
    {
        this.marca = new String(t.marca);
        this.modelo = new String(t.modelo);
        this.displayX = t.displayX;
        this.displayY = t.displayY;
        this.armMsg = t.armMsg;
        this.armFoto = t.armFoto;
        this.armApp = t.armApp;
        this.armOcupado = t.armOcupado;
        this.armFotoAppTotal = t.armFotoAppTotal;
        this.armMax = t.armMax;
        this.msgs = new String[t.msgs.length];
        System.arraycopy(t.msgs, 0, this.msgs, 0, numMsg);
        this.apps = new String[t.apps.length];
        System.arraycopy(t.apps, 0, this.apps, 0, numApps);
        this.numMsg = t.numMsg;
        this.numFoto = t.numFoto;
        this.numApps = t.numApps;
    }

    public Telemovel clone ()
    {
        return new Telemovel(this);
    }
    // Alterar
    public String toString() {
        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nDimensao do Display: " + this.displayX + "x" + this.displayY +
            "\nArmazenamento total de Mensagens: " + this.armMsg + "\n Armazenamento total de Fotos: " + this.armFoto + 
            "\nArmazenamento total de Apps: " + this.armApp + "\nArmazenamento total ocupado: " + this.armOcupado + 
            "\nNumero de Mensagens: " + this.numMsg + ", Numero de Fotos: " + this.numFoto + ", Numero de Apps: " + this.numApps;
    }

    /**
     * Metodo para verificar se é igual a outro objeto
     * Falta acabar de definir o metodo
     */
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if ( (obj==null) || (this.getClass() != obj.getClass()))
            return false;

        //todo acabar isto
        return true;
    }

    public boolean existeEspaco (int numeroBytes)
    {
        return ((this.armOcupado + numeroBytes) < (this.armMax));
    }

    public void instalaApp (String nome, int tamanho)
    {
        if (existeEspaco(tamanho) && (tamanho<this.armApp))
        {
            apps[this.numApps++] = new String(nome);
            this.armOcupado += tamanho;
        }
    }
}