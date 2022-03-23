package Ficha2;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public static void main (String[] args)
    {
        if (args.length < 1) return;

        Scanner sc = new Scanner(System.in);

        for (String arg : args)
        {
            if (arg.equals("1"))
            {
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
            }
            else if (arg.equals("2"))
            {
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

                for (aluno=0 ; aluno<5 ; aluno++)
                    System.out.println("A nota mais alta do aluno " + aluno + " foi " + ex2.notaMaisAlta(aluno));

                for (aluno=0 ; aluno<5 ; aluno++)
                    System.out.println("A nota mais baixa do aluno " + aluno + " foi " + ex2.notaMaisBaixa(aluno));

                System.out.println("Introduza a nota mais baixa aceitável: ");
                int notaLimite = sc.nextInt();
                System.out.println("O array com as notas mais altas que " + notaLimite + " é " + Arrays.toString(ex2.maisAltoQue(notaLimite)));

                System.out.println("A string com a nota de todos os alunos é:");
                System.out.print(ex2.stringDasNotas());

                System.out.println("A UC com a media mais alta é: " + ex2.UCmaiorMedia());
            }
            else if (arg.equals("3"))
            {
                Ficha2ex3 ex3 = new Ficha2ex3();

                LocalDate d1 = LocalDate.of(1990, 1, 3);
                LocalDate d2 = LocalDate.of(2000, 1, 3);
                LocalDate d3 = LocalDate.of(2010, 1, 3);

                ex3.insereData(d1);
                ex3.insereData(d2);
                ex3.insereData(d3);

                System.out.println("A data mais proxima de agora é: " + ex3.dataMaisProxima(LocalDate.now()).toString());

                System.out.println("As datas sao: " + ex3.toString());
            }
            else if (arg.equals("4"))
            {
                int[] v = {9, 4, 14, 51, 1, -14, -1, 93, 2, 9, 0};
                Ficha2ex4 ex4 = new Ficha2ex4(v);
                System.out.println("Array antes de ordenar: " + Arrays.toString(ex4.getArray()));
                ex4.sort(0, v.length);
                System.out.println("Array após ordenar: " + Arrays.toString(ex4.getArray()));
                System.out.println("Procura de 9 no array: " + ex4.search(9));
                System.out.println("Procura de 3 no array: " + ex4.search(3));
            }
        }

        sc.close();
    }

} 