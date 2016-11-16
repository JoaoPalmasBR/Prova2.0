package Prova;
/**
 *
 * @author Joao Antonio
 */
public class Aluno {
    private int codAluno;
    private String nomeAluno;
    
    public Aluno() {
    }
    public Aluno(int codAluno, String nomeAluno) {
        this.codAluno = codAluno;
        this.nomeAluno = nomeAluno;
    }
    public int getCodAluno() {
        return codAluno;
    }
    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" + "codAluno=" + codAluno + ", nomeAluno=" + nomeAluno + '}';
    }
    
}
