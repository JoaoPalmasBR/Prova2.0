package Prova;
import java.util.ArrayList;
/**
 *
 * @author Joao Antonio
 */
public class Prova {
    private Aluno aluno;
    private double nota;
    private String horaInicio,horaFim;
    private ArrayList<Correcao> correcoes;

    public Prova() {
        correcoes = new ArrayList<>();
    }

    public Prova(Aluno aluno, double nota, ArrayList<Correcao> correcoes) {
        this.aluno = aluno;
        this.nota = nota;
        this.correcoes = correcoes;
        correcoes = new ArrayList<>();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public ArrayList<Correcao> getCorrecoes() {
        return correcoes;
    }
    
    public void addCorrecao(Correcao correcao){
        correcoes.add(correcao);
    }
    
    
    public void removeCorrecao(Correcao correcao){
        correcoes.remove(correcao);
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }
    
    @Override
    public String toString() {
        return "Prova{" + "aluno=" + aluno + ", nota=" + nota + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + ", correcoes=" + correcoes + '}';
    }
    
    
}
