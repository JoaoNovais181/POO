
public class Ficha2ex2
{
    int[][] pauta;

    public Ficha2ex2 ()
    {
        pauta = new int[5][5];
    }

    public void atualizaNota (int aluno, int uc, int nota)
    {
        pauta[aluno][uc] = nota;
    }

    public int somaNotasUC (int uc)
    {
        int soma = 0;
        for (int i=0 ; i<5 ; i++) soma += pauta[i][uc];

        return soma;
    }

    public float mediaAluno (int aluno)
    {
        int soma = 0;
        for (int nota : pauta[aluno]) soma+=nota;
        return soma / 5.0f;
    }

    public float mediaUC (int UC)
    {
        return somaNotasUC(UC) / 5.0f; 
    }
}