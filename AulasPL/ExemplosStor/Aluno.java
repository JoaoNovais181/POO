package ExemplosStor;

public class Aluno  implements Comparable<Aluno>
{
    private String numero;
    private int nota;
    private String nome;
    private String curso;

    public Aluno()
    {
        this.numero = "XXXXXXXXXX";
        this.nota = 0;
        this.nome = "XXXXXXXXXX";
        this.curso = "XXXXXXXXXX";
    }

    public Aluno(String numero, int nota, String nome, String curso)
    {
        this.numero = numero;
        this.nota = nota;
        this.nome = nome;
        this.curso = curso;
    }

    public Aluno(Aluno umAluno)
    {
        this.numero = umAluno.getNumero();
        this.nota = umAluno.getNota();
        this.nome = umAluno.getNome();
        this.curso = umAluno.getCurso();
    }

    public String getNumero()
    {
        return this.numero;
    }

    public void setNumero (String numero)
    {
        this.numero = numero;
    }

    public int getNota ()
    {
        return this.nota;
    }

    public void setNota (int nota)
    {
        this.nota = nota;
    }

    public String getNome ()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCurso()
    {
        return this.curso;
    }

    public void setCurso (String curso)
    {
        this.curso = curso;
    }

    public String toString()
    {
        return "Numero: " + this.numero + "\nNota: " + this.nota + "\nNome: " + this.nome + "\nCurso: " + this.curso + "\n";
    }

    public boolean equals (Object obj)
    {
        if (this==obj)
        {
            return true;
        }

        if (obj==null || (this.getClass() != obj.getClass()))
        {
            return false;
        }

        Aluno a = (Aluno) obj;

        return (this.numero.equals(a.getNumero())) && (this.nota==a.getNota()) && (this.nome.equals(a.getNome())) && (this.curso.equals(a.getCurso()));
    }

    public Aluno clone ()
    {
        return new Aluno(this);
    }

    public int compareTo(Aluno o) {
        return this.getNome().compareTo(o.getNome());
    }
}