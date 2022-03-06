import java.util.Arrays;

import javax.print.attribute.standard.MediaSize.NA;

public class Ficha2ex2
{
    int[][] pauta;
    int nAlunos;
    int nUC;

    public Ficha2ex2 ()
    {
        pauta = new int[5][5];
        nAlunos = 5;
        nUC = 5;
    }

    public void atualizaNota (int aluno, int uc, int nota)
    {
        pauta[aluno][uc] = nota;
    }

    public int somaNotasUC (int uc)
    {
        int soma = 0;
        for (int i=0 ; i<nAlunos ; i++) soma += pauta[i][uc];

        return soma;
    }

    public float mediaAluno (int aluno)
    {
        int soma = 0;
        for (int nota : pauta[aluno]) soma+=nota;
        return (float)soma / nUC;
    }

    public float mediaUC (int UC)
    {
        return (float)somaNotasUC(UC) / nAlunos; 
    }

    public int notaMaisAlta (int aluno)
    {
        int r = -1;
        for (int nota : pauta[aluno])
            if (nota > r) r = nota;

        return r;
    }

    public int notaMaisBaixa (int aluno)
    {
        int r = 21;
        for (int nota : pauta[aluno])
            if (nota < r) r = nota;

        return r;
    }

    public int[] maisAltoQue (int notaLimite)
    {
        int[] notas = new int[nAlunos*nUC];
        int i = 0;
        for (int[] aluno : pauta)
            for (int nota : aluno)
                if (nota > notaLimite) notas[i++] = nota;
                
        int[] r = new int[i];
        System.arraycopy(notas, 0, r, 0, i);
        return r;
    }

    public String stringDasNotas ()
    {
        String str = new String("");
        for (int aluno=0 ; aluno<nAlunos ; aluno++) 
        {
            String aux = new String("Aluno " + aluno + ": ");
            for (int nota : pauta[aluno])
                aux += nota + " ,";
            str += aux + "\n";
        }

        return str;
    }

    public int UCmaiorMedia ()
    {
        int r = -1;
        float m=-1;
        for (int UC=0 ; UC<nUC ; UC++)
            if (mediaUC(UC) > m) 
            {
                r = UC;
                m = mediaUC(UC);
            }
        
        return r;
    }
}