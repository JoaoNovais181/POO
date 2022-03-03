import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a dimensão do array: ");
        int dimensao = sc.nextInt();
        
        Ficha2ex1 ex1 = new Ficha2ex1(dimensao, sc);

        System.out.println("O mínimo é: " + ex1.ex1a());

        System.out.println("Introduza 2 indices do array: ");
        int a = sc.nextInt(),b = sc.nextInt();

        System.out.println("Array resultante é: " + Arrays.toString(ex1.ex1b(a,b)));
        
        int[] v2 = new int[dimensao];
        System.out.println("Introduza " + dimensao + " valores inteiros para o segundo array:");
        for (int i=0 ; i<dimensao ; i++) 
            v2[i] = sc.nextInt();

        System.out.println("O array com os elementos comuns entre os dois arrays lidos é: " + Arrays.toString(ex1.ex1c(v2)));
        
        Ficha2ex2 ex2 = new Ficha2ex2();

        for (int i=0 ; i<5 ; i++)
            for (int j=0 ; j<5 ; j++)
            {
                System.out.println("Insira a nota para o aluno " + i + " à UC " + j);
                ex2.atualizaNota(i, j, sc.nextInt());
            }

        System.out.println("Introduza o numero da UC (0 a 4): ");  
        int UC = sc.nextInt();      
        System.out.println("A soma das notas da UC " + UC + " é " + ex2.somaNotasUC(UC));

        System.out.println("Introduza o numero do aluno (0 a 4): ");  
        int aluno = sc.nextInt();      
        System.out.println("A media do aluno " + aluno + " é " + ex2.mediaAluno(aluno));

        System.out.println("Introduza o numero da UC (0 a 4): ");  
        UC = sc.nextInt();      
        System.out.println("A media das notas da UC " + UC + " é " + ex2.mediaUC(UC));

        
        
        sc.close();
    }
} 