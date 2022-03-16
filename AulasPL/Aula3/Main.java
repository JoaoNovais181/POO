import java.time.LocalDate;
import java.util.ArrayList;

// import java.util.Arrays;

public class Main
{

    public static void main(String[] args) 
    {
        // Telemovel t = new Telemovel("Huawei", "P20 Lite", 1920, 1080, (byte)100, (byte)100, (byte)100, 64000);
    
        // t.instalaApp("Flappy Bird", 5);
        // t.instalaApp("Instagram", 2);
        // t.instalaApp("GTA San Andreas", 65);
        // t.removeApp("Flappy Bird", 5);    
        // t.recebeMsg("Come-me!!!");
        // t.recebeMsg("O Drikz é BUES da gay!!!");
        // System.out.println(t.maiorMsg());
        // System.out.println(t.tamMedioApps());
        // String[] apps = t.getApps();
        // for (int i=0 ; i<t.getNumApps() ; i++)
        // {
        //     System.out.print(apps[i] + " ");
        // }
        // System.out.println("\nAcabou!!\n");

        // System.out.println(le.toString());
        // System.out.println("O valor da linha de encomenda é: " + le.calculaValorLinhaEnc());
        // System.out.println("O valor do desconto é: " + le.calculaValorDesconto());
        // LinhaEncomenda l2 = le.clone();
        // System.out.println(le.equals(l2));
        // l2.setQuantidade(50);
        // System.out.println(l2.toString());
        
        Encomenda enc = new Encomenda("Joao", "257451756", "Rua do crlh", 2354, LocalDate.of(2018, 1, 1), new ArrayList<LinhaEncomenda>()); 
        System.out.println(enc.toString());    
        LinhaEncomenda le = new LinhaEncomenda("783263899", "Bifes do Lombo Marca Continente 0.5Kg", 25, 2.49, 0.06, 0.05);
        enc.adicionaLinha(le);
        System.out.println("\n\n" + enc.toString());    
        enc.removeProduto("213");
        System.out.println("\n\n" + enc.toString());    
    }
}