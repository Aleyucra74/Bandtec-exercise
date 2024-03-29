import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GravaArquivo2 {

    public static void gravaRegistro (String nomeArq, String registro) {
        BufferedWriter saida = null;
        try {
            // o argumento true é para indicar que o arquivo não será sobrescrito e sim
            // gravado com append (no final do arquivo)
            saida = new BufferedWriter(new FileWriter(nomeArq, true));
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }

        try {
            saida.append(registro + "\n");
            saida.close();

        } catch (IOException e) {
            System.err.printf("Erro ao gravar arquivo: %s.\n", e.getMessage());
        }
    }



    public static void main(String[] args) {

        String nomeArq = "ArquivoNotas.txt";
        String header = "";
        String corpo = "";
        String trailer = "";
        int contRegDados = 0;
        List<Aluno> alunos = new ArrayList<>();

        Date dataDeHoje = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        header += "00NOTA20202";
        header += formatter.format(dataDeHoje);
        header += "01";

        gravaRegistro(nomeArq, header);

        Scanner sc = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        Scanner f = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        String[] opcoes = {"Add aluno","sair"};
        boolean s =true;
        while (s){
            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((i+1)+". "+opcoes[i]);
            }
            String opcao = sc.next();

            switch (opcao){
                case "1" :
                    System.out.println("add um aluno (ra,nome,disciplina,media,faltas,curso)");
                    String ra = r.next();
                    String nome = n.next();
                    String disciplina = d.next();
                    Double media = m.nextDouble();
                    Integer faltas = f.nextInt();
                    String curso = c.next();

                    Aluno aluno = new Aluno(ra,nome,disciplina,media,faltas);
                    alunos.add(aluno);
                    contRegDados++;
                    if (contRegDados > 0){
                        corpo = "02";
                    }else{
                        corpo += "02";
                    }
                    corpo += String.format("%-5s", curso);
                    corpo += aluno.getRa();
                    corpo += String.format("%-50s", aluno.getNome());
                    corpo += String.format("%-40s", aluno.getDisciplina());
                    corpo += String.format("%05.2f", aluno.getMedia());
                    corpo += String.format("%03d", aluno.getQntdFaltas());
                    gravaRegistro(nomeArq,corpo);
                    break;
                case "2" :
                    s=false;
                    break;
                default:
                    System.out.println("erro");
                    break;
            }

        }
        trailer += "01";
        trailer += String.format("%010d", contRegDados);
        gravaRegistro(nomeArq,trailer);

//        // 1o registro de dados
//        corpo += "02";
//        // %-5s : para strings, usamos s
//        //        - alinha para a esquerda, campo de 5 caracteres, completa
//        //        espaços com brancos à direita
//        corpo += String.format("%-5s", "ADS");     // aluno.getCurso()
//        corpo += "01181070";
//        corpo += String.format("%-50s", "Maria Aparecida da Silva");  // aluno.getNome()
//        corpo += String.format("%-40s", "Banco de Dados");
//        // %05.2f : para número com casas decimais, usamos f
//        //          alinha para a direita, porque não tem o -
//        //          completa com zeros à esquerda
//        //          formata com 2 casas decimais, separado por vírgula
//        corpo += String.format("%05.2f", 7.5);
//        // %03d : para número inteiro, usamos d
//        //        alinha para a direita e completa com zeros à esquerda
//        corpo += String.format("%03d", 10);
//        // incrementa o contador de registros de dados
//        contRegDados++;
//        // chama o método para gravar um registro
//        gravaRegistro(nomeArq,corpo);

//        // 2o registro de dados - OBS.: Não usar += no primeiro campo do corpo agora!
//        corpo = "02";
//        corpo += String.format("%-5s", "BD");  // aluno.getCurso()
//        corpo += "01181080";
//        corpo += String.format("%-50s", "José Oliveira");
//        corpo += String.format("%-40s", "Algoritmos");
//        corpo += String.format("%05.2f", 5.75);
//        corpo += String.format("%03d", 7);
//        contRegDados++;
//        gravaRegistro(nomeArq,corpo);

//        // 3o registro de dados
//        corpo = "02";
//        corpo += String.format("%-5s", "REDES");
//        corpo += "01181090";
//        corpo += String.format("%-50s", "Fulano Teixeira");
//        corpo += String.format("%-40s", "Segurança");
//        corpo += String.format("%05.2f", 8.0);
//        corpo += String.format("%03d", 15);
//        contRegDados++;
//        gravaRegistro(nomeArq,corpo);


        // monta o trailer
    }
}
