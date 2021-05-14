import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Teste {

    public static void gravaLista(ListaObj<Atletas> lista, boolean isCSV, String nomeArquivo) {
        FileWriter arq = null;
        Formatter saida = null;
        boolean deuRuim = false;

        if (isCSV) {
            nomeArquivo += ".csv";
        }
        else {
            nomeArquivo += ".txt";
        }

        try {
            arq = new FileWriter(nomeArquivo, true);
            saida = new Formatter(arq);
        }
        catch (IOException erro) {
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        }

        try {
            for (int i=0; i< lista.getTamanho(); i++) {
                Atletas atleta = lista.getElemento(i);
                if (isCSV) {
                    saida.format("%d;%s;%s;%.2f;%s;%s;%s%n",
                            atleta.getId(),
                            atleta.getNome(),
                            atleta.getTipoAtleta(),
                            atleta.getAltura(),
                            atleta.getTipoExercicio(),
                            atleta.getClube(),
                            atleta.getSexo());
                }
                else {
                    saida.format("%d %s %s %.2f %s %s %s %s%n",
                            atleta.getId(),
                            atleta.getNome(),
                            atleta.getTipoAtleta(),
                            atleta.getAltura(),
                            atleta.getTipoExercicio(),
                            atleta.getClube(),
                            atleta.getSexo());
                }
            }
        }
        catch (FormatterClosedException erro) {
            System.err.println("Erro ao gravar no arquivo");
            deuRuim= true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivo(boolean isCSV, String nomeArquivo) {
        FileReader arq= null;
        Scanner entrada = null;
        boolean deuRuim= false;

        if (isCSV) {
            nomeArquivo += ".csv";
        }
        else {
            nomeArquivo += ".txt";
        }

        try {
            arq = new FileReader(nomeArquivo);
            if (isCSV) {
                entrada = new Scanner(arq).useDelimiter(";|\\r\\n");
            }
            else {
                entrada = new Scanner(arq);
            }
        }
        catch (FileNotFoundException erro) {
            System.err.println("Arquivo não encontrado");
            System.exit(1);
        }

        try {
            System.out.printf("%-8s%-20s%-20s%-5s%-25s%-25s%-1s\n",
                    "ID",
                    "NOME",
                    "TIPO ATLETA",
                    "ALTURA",
                    "TIPO EXERCICIO",
                    "CLUBE",
                    "SEXO" );
            while (entrada.hasNext()) {
                Integer id = entrada.nextInt();
                String nome = entrada.next();
                String tipoAtleta = entrada.next();
                Double altura = entrada.nextDouble();
                String tipoExercicio = entrada.next();
                String clube = entrada.next();
                String sexo = entrada.next();
                System.out.printf("%-8d%-20s%-20s%-5.2f%-25s%-25s%-1s\n",
                        id,
                        nome,
                        tipoAtleta,
                        altura,
                        tipoExercicio,
                        clube,
                        sexo);  // 30.0
            }
        }
        catch (NoSuchElementException erro)
        {
            System.err.println("Arquivo com problemas.");
            deuRuim = true;
        }
        catch (IllegalStateException erro)
        {
            System.err.println("Erro na leitura do arquivo.");
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

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

        ListaObj<Atletas> atleta = new ListaObj<>(10);
        Atletas atletaClasse = null;
        Scanner scanner = new Scanner(System.in);
        Scanner atletaScanner = new Scanner(System.in);

        String[] opcoes = {
                "add atleta",
                "exibir a lista de atletas",
                "gravar arquivo CSV da lista",
                "ler arquivo csv",
                "gravar arquivo em TXT da lista",
                "fim"
        };
        String nomeArquivo = "ArquivoAtletas.txt";
        String header = "";
        String corpo = "";
        String trailer = "";
        int contRegDados = 0;
        Date dataDeHoje = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        header += "00ATLETAS02201001";
        header += formatter.format(dataDeHoje);
        header += "00";

        gravaRegistro(nomeArquivo, header);


        boolean pediuPraSair=false;
        while (!pediuPraSair){

            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((i+1)+". "+opcoes[i]);
            }
            String opcao = scanner.next();
            String nome, tipoAtleta, tipoExercicio, clube, sexo;
            Integer id;
            Double altura;

            switch (opcao){
                case "1":
                    contRegDados++;
                    System.out.println("adicionando um atleta:(id,nome,tipoAtleta,altura,tipoExercicio,clube,sexo)");
                    String atletaInput = atletaScanner.next();
                    id = Integer.parseInt(atletaInput.split(",")[0]);
                    nome = atletaInput.split(",")[1];
                    tipoAtleta = atletaInput.split(",")[2];
                    altura = Double.parseDouble(atletaInput.split(",")[3]);
                    tipoExercicio = atletaInput.split(",")[4];
                    clube = atletaInput.split(",")[5];
                    sexo = atletaInput.split(",")[6];
                    atletaClasse = new Atletas(id,nome,tipoAtleta,altura,tipoExercicio,clube,sexo);
                    atleta.adiciona(atletaClasse);
                    break;
                case "2":
                    System.out.println("exibe a lista de atletas...");
                    atleta.exibe();
                    break;
                case "3":
                    System.out.println("gravando um arquivo em CSV da lista dos atletas");
                    gravaLista(atleta,true,"ArquivoAtletas");
                    break;
                case "4":
                    System.out.println("lendo um arquivo CSV de atletas");
                    leExibeArquivo(true,"ArquivoAtletas");
                    break;
                case "5":
                    System.out.println("Gravando um arquivo em TXT da lista de atletas");

                    for (int i = 0; i < contRegDados; i++) {
                        if (contRegDados > 0){
                            corpo = "01";
                        }else{
                            corpo += "01";
                        }
                        Atletas atletas = atleta.getElemento(i);
                        corpo += String.format("%-8d", atletas.getId());
                        corpo += String.format("%-20s", atletas.getNome());
                        corpo += String.format("%-20s", atletas.getTipoAtleta());
                        corpo += String.format("%-5.2f", atletas.getAltura());
                        corpo += String.format("%-25s", atletas.getTipoExercicio());
                        corpo += String.format("%-25s", atletas.getClube());
                        corpo += String.format("%-1s", atletas.getSexo());
                        gravaRegistro(nomeArquivo,corpo);
                    }

                    break;
                case "6":
                    System.out.println("saindo");
                    pediuPraSair=true;
                    break;
                default:
                    System.out.println("Numero invalido, tente novamente.");
                    break;
            }

        }
        trailer += "02";
        trailer += String.format("%010d", contRegDados);
        gravaRegistro(nomeArquivo, trailer);


    }

}
