package ExemplosStor;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Turma
{
    private List<Aluno> turma;
    private String nome;

    public Turma ()
    {
        this.turma = new ArrayList<>();
        this.nome = "PL8";
    }

    public Turma (ArrayList<Aluno> turma, String nome)
    {
        this.nome = nome;
        this.turma = new ArrayList<>();

        /* Iterador externo com for each
        for (Aluno iteracao : turma)
        {
            this.turma.add(iteracao.clone());
        }
        */

        /* Iterador externo Iterator */
        Iterator<Aluno> iterator = turma.iterator();
        while(iterator.hasNext())
        {
            Aluno aux = iterator.next();
            this.turma.add(aux.clone());
        }
        

        // Iterador interno
        // this.turma = (ArrayList<Aluno>)turma.stream().map(Aluno::clone).collect(Collectors.toList());
    }
    
    public Turma (Turma umaTurma)
    {
        this.nome = umaTurma.getNome();
        this.turma = new ArrayList<>();

        Iterator<Aluno> iterator = umaTurma.getTurma().iterator();
        while(iterator.hasNext())
        {
            Aluno aux = iterator.next();
            this.turma.add(aux.clone());
        }
    }

    public void setTurma (ArrayList<Aluno> turma)
    {
        this.turma = new ArrayList<Aluno>(turma);
    }

    public List<Aluno> getTurma ()
    {
        return this.turma.stream().map(Aluno::clone).collect(Collectors.toList());
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public String getNome ()
    {
        return this.nome;
    }

    public boolean existeAluno(String numero)
    {
        /*
        for (Aluno iteracao : this.turma)
        {
            if (iteracao.getNumer().equals(numero))
            {
                return true;
            }
        }

        */

        // Iterador interno
        return this.turma.stream().anyMatch(aluno -> aluno.getNumero().equals(numero));
    }

    public Set<Aluno> ordenaTurma()
    {
        Set<Aluno> turma_ordenada = new TreeSet<>();
        Iterator<Aluno> iterator = this.turma.iterator();
        while (iterator.hasNext()) 
        {
            turma_ordenada.add(iterator.next().clone());
        }

        return turma_ordenada;
    }

    public Set<Aluno> ordenaCriterio ()
    {
        ComparadorAlunos comparadorAlunos = new ComparadorAlunos();
        Set<Aluno> turma_ordenada = new TreeSet<>(comparadorAlunos);

        Iterator<Aluno> iterator = this.turma.iterator();
        while (iterator.hasNext()) 
        {
            turma_ordenada.add(iterator.next().clone());
        }

        return turma_ordenada;
    }
}