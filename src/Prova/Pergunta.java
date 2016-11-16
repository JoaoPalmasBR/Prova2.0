package Prova;
/**
 *
 * @author Joao Antonio
 */
public class Pergunta {
    private int cod;
    private String enunciado;
    private String opcao1,opcao2,opcao3,opcao4;
    private String reposta;

    public Pergunta() {
    }

    public Pergunta(int cod, String enunciado, String opcao1, String opcao2, String opcao3, String opcao4, String reposta) {
        this.cod = cod;
        this.enunciado = enunciado;
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
        this.opcao3 = opcao3;
        this.opcao4 = opcao4;
        this.reposta = reposta;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getOpcao1() {
        return opcao1;
    }

    public void setOpcao1(String opcao1) {
        this.opcao1 = opcao1;
    }

    public String getOpcao2() {
        return opcao2;
    }

    public void setOpcao2(String opcao2) {
        this.opcao2 = opcao2;
    }

    public String getOpcao3() {
        return opcao3;
    }

    public void setOpcao3(String opcao3) {
        this.opcao3 = opcao3;
    }

    public String getOpcao4() {
        return opcao4;
    }

    public void setOpcao4(String opcao4) {
        this.opcao4 = opcao4;
    }

    public String getReposta() {
        return reposta;
    }

    public void setReposta(String reposta) {
        this.reposta = reposta;
    }

    @Override
    public String toString() {
        return "Pergunta{" + "cod=" + cod + ", enunciado=" + enunciado + ", opcao1=" + opcao1 + ", opcao2=" + opcao2 + ", opcao3=" + opcao3 + ", opcao4=" + opcao4 + ", reposta=" + reposta + '}';
    }

    
}
