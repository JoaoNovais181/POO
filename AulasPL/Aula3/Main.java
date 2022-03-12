import java.util.Arrays;

public class Main
{

    public static void main(String[] args) 
    {
        Telemovel t = new Telemovel("Huawei", "P20 Lite", 1920, 1080, (byte)100, (byte)100, (byte)100, 64000);
    
        t.instalaApp("Flappy Bird", 5);
        t.instalaApp("Instagram", 2);
        t.instalaApp("GTA San Andreas", 65);
        // t.removeApp("Flappy Bird", 5);    
        t.recebeMsg("Come-me!!!");
        t.recebeMsg("O Drikz é BUES da gay!!!");
        System.out.println(t.maiorMsg());
        System.out.println(t.tamMedioApps());
        String[] apps = t.getApps();
        for (int i=0 ; i<t.getNumApps() ; i++)
        {
            System.out.print(apps[i] + " ");
        }
        System.out.println("\nAcabou!!\n");
    }
}