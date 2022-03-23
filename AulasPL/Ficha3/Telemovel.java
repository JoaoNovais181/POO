package Ficha3;

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

    public Telemovel (String marca, String modelo, int displayX, int displayY, byte armMsg, byte armFoto, byte armApp, int armMax)
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

    public String getMarca ()
    {
        return this.marca;
    }

    public String getModelo ()
    {
        return this.modelo;
    }

    public int getDisplayX ()
    {
        return this.displayX;
    }

    public int getDisplayY ()
    {
        return this.displayY;
    }

    public int getArmOcupado ()
    {
        return this.armOcupado;
    }

    public int getArmFotoAppTotal ()
    {
        return this.armFotoAppTotal;
    }

    public int getArmMax ()
    {
        return this.armMax;
    }

    public int getNumMsg ()
    {
        return this.numMsg;
    }

    public int getNumApps ()
    {
        return this.numApps;
    }

    public int getNumFoto ()
    {
        return this.numFoto;
    }

    public byte getArmMsg ()
    {
        return this.armMsg;
    }

    public byte getArmFoto ()
    {
        return this.armFoto;
    }

    public byte getArmApp ()
    {
        return this.armApp;
    }

    public String[] getMsgs ()
    {
        return this.msgs.clone();
    }

    public String[] getApps ()
    {
        return this.apps.clone();
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
     * @param obj Objeto a comparar
     * @return true se o objeto for um objeto do tipo telemovel equivalente a este telemóvel
     */
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if ( (obj==null) || (this.getClass() != obj.getClass()))
            return false;

        Telemovel o = (Telemovel) obj;
        
        return (this.marca.equals(o.getMarca())) && (this.modelo.equals(o.getModelo()))
            && (this.displayX == o.getDisplayX()) && (this.displayY == o.getDisplayY())
            && (this.armMsg == o.getArmMsg()) && (this.armFoto == o.getArmFoto())
            && (this.armApp == o.getArmApp()) && (this.armFotoAppTotal == o.getArmFotoAppTotal())
            && (this.armOcupado == o.getArmOcupado()) && (this.armMax == o.getArmMax())
            && (this.numApps == o.getNumApps()) && (this.numFoto == o.getNumFoto())
            && (this.numMsg == o.getNumMsg()) && (this.apps.equals(o.getApps()))
            && (this.msgs.equals(o.getMsgs()));
    }

    public boolean existeEspaco (int numeroBytes)
    {
        return ((this.armOcupado + numeroBytes) < (this.armMax));
    }

    public void instalaApp (String nome, int tamanho)
    {
        if (existeEspaco(tamanho) && (tamanho<this.armApp))
        {
            if (this.apps.length <= this.numApps)
            {
                String[] novo = new String[(int)(this.apps.length*0.3)];
                System.arraycopy(this.apps, 0, novo, 0, this.numApps);
                this.apps = novo;
            }
            this.apps[this.numApps++] = new String(nome);
            this.armOcupado += tamanho;
            this.armFotoAppTotal += tamanho;
        }
    }

    public void recebeMsg (String msg)
    {
        if (existeEspaco(msg.length()) && (msg.length() < this.armMsg))
        {
            if (this.msgs.length <= this.numMsg)
            {
                String[] novo = new String[(int)(this.msgs.length*0.3)];
                System.arraycopy(this.msgs, 0, novo, 0, this.numMsg);
                this.msgs = novo;
            }
            this.msgs[this.numMsg++] = new String(msg);
            this.armOcupado += msg.length();
        }
    }

    public double tamMedioApps ()
    {
        return (double)this.armFotoAppTotal / this.numApps;
    } 

    public String maiorMsg()
    {
        if (this.numMsg > 0)
        {
            int maior = this.msgs[0].length(), mindx = 0;

            for (int i=1 ; i<this.numMsg ; i++)
            {
                if (this.msgs[i].length() > maior)
                {
                    mindx = i;
                }    
            }

            return this.msgs[mindx];
        }

        return "Não há Msgs";
    }

    public void removeApp(String nome, int tamanho)
    {
        boolean found = false;

        for (int i=0 ; i<this.numApps && !found ; i++)
        {
            if (this.apps[i].equals(nome))
            {
                for (int j=i ; j<this.numApps-1 ; j++)
                {
                    this.apps[j] = this.apps[j+1];
                }
                this.numApps--;
                this.armOcupado -= tamanho;
                this.armFotoAppTotal -= tamanho;
                found = true;
            }
        }
    }
}