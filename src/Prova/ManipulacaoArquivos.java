package Prova;

import static Prova.tela.perguntas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Joao Antonio
 */
public class ManipulacaoArquivos {
    File diretorio;
    public void pegaPerguntas() throws IOException{
        try {
            FileReader arq = new FileReader("C:/Users/Public/Documents/prova/perguntas.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            String linha = lerArq.readLine(); // lê a primeira linha
            String[] linha2=linha.split(",");
            
            int cod;
            String enunciado,opcao1,opcao2,opcao3,opcao4,resposta;
            
            cod=Integer.parseInt(linha2[0]);
            enunciado=linha2[1];
            opcao1=linha2[2];
            opcao2=linha2[3];
            opcao3=linha2[4];
            opcao4=linha2[5];
            resposta=linha2[6];
            Pergunta pergunta = new Pergunta(cod, enunciado, opcao1, opcao2, opcao3, opcao4, resposta);
            perguntas.add(pergunta);
            while (linha != null) {
                linha = lerArq.readLine(); // lê da segunda até a última linha
                if(linha==null){
                    break;
                }
                else{
                    String[] linha3=linha.split(",");
                    int cod1=Integer.parseInt(linha3[0]);
                    String enunciado1=linha3[1];
                    String opcao1a=linha3[2];
                    String opcao2a=linha3[3];
                    String opcao3a=linha3[4];
                    String opcao4a=linha3[5];
                    String respostaa=linha3[6];
                    Pergunta pergunta1 = new Pergunta(cod1, enunciado1, opcao1a, opcao2a, opcao3a, opcao4a, respostaa);
                    perguntas.add(pergunta1);
                }
            }
            arq.close();
        }
        catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage());
        }
    }
    public void gravaRelatorio(Prova prova){
        int questoes=prova.getCorrecoes().size();
        int contCerto=0;
        File dir = new File("C:/Users/Public/Documents/prova");
        File arq = new File(dir,"relatorio_"+prova.getAluno().getNomeAluno()+".txt");
        try {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            printWriter.println("Prova Informatica e Sociedade\n");
            printWriter.println("\n");
            printWriter.println("\nAluno: "+prova.getAluno().getNomeAluno());
            printWriter.println("\nHorario Inicio: "+prova.getHoraInicio());
            printWriter.println("\nHorario Fim: "+prova.getHoraFim());
            printWriter.println("\n");
            //printWriter.println("\nHorario Inicio: "+prova.());
            printWriter.println("\nPerguntas: ");
            int i=0;
            while(i<prova.getCorrecoes().size()){
                Correcao c=prova.getCorrecoes().get(i);
                System.out.println(c.toString());
                printWriter.println("\n\tPergunta: "+c.getPergunta().getEnunciado());
                printWriter.println("\n\tResposta: "+c.getRespostaAluno());
                
                if(c.getStatusCorrecao()=="Errado"){
                    printWriter.println("\n\tStatus: Errado");
                }
                else{
                    contCerto+=1;
                    printWriter.println("\n\tStatus: Certo");
                }
                printWriter.println("\n\t--------------------------");
                i+=1;
            }
            printWriter.println("\nQuestoes Certas: "+contCerto+"/"+questoes);
            //
            printWriter.flush();
            printWriter.close();
         }catch (IOException e) {
            e.printStackTrace();
        }
    }
}