package Prova;
/**
 *
 * @author Joao Antonio
 */
public class Correcao {
    private Pergunta pergunta;
    private String respostaAluno;
    private String statusCorrecao;

    public Correcao() {
    }

    public Correcao(Pergunta pergunta, String respostaAluno, String statusCorrecao) {
        this.pergunta = pergunta;
        this.respostaAluno = respostaAluno;
        this.statusCorrecao = statusCorrecao;
    }
    
    public Pergunta getPergunta() {
        return pergunta;
    }
    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }
    public String getRespostaAluno() {
        return respostaAluno;
    }
    public void setRespostaAluno(String respostaAluno) {
        this.respostaAluno = respostaAluno;
    }

    public String getStatusCorrecao() {
        return statusCorrecao;
    }
    
    public void setStatusCorrecao(String statusCorrecao) {
        this.statusCorrecao = statusCorrecao;
    }

    @Override
    public String toString() {
        return "Correcao{" + "pergunta=" + pergunta + ", respostaAluno=" + respostaAluno + ", statusCorrecao=" + statusCorrecao + '}';
    }
}
