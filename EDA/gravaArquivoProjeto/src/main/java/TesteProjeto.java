import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TesteProjeto {

    public static void main(String[] args) {

        Exportacao recordArchive = new Exportacao();
        List<Projeto> projetos = new ArrayList<>();
        Projeto projeto1, projeto2, projeto3, projeto4;
        projeto1 = new Projeto("TECH brazil ltda","projeto para front","react e js", "proatividade");
        projeto2 = new Projeto("TECH2 brazil ltda","projeto para front","react e js", "proatividade");
        projeto3 = new Projeto("TECH3 brazil ltda","projeto para front","react e js", "proatividade");
        projeto4 = new Projeto("TECH4 brazil ltda","projeto para front","react e js", "proatividade");
        projetos.add(projeto1);
        projetos.add(projeto2);
        projetos.add(projeto3);
        projetos.add(projeto4);

        String nomeArq = "CargaProjetos.txt";
        String header = "";
        String detail = "";
        String trailer = "";
        int contRegister = 0;

        Date todayData = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        SimpleDateFormat formatterMonth = new SimpleDateFormat("MM");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");
        int semester = (Integer.parseInt(formatterMonth.format(todayData)) > 6)? 02 : 01 ;

        header += "00PROJETO"+formatterYear.format(todayData)+semester;
        header += formatter.format(todayData)+"01";

        recordArchive.gravaRegistro(nomeArq,header);

        for (Projeto projeto : projetos) {
            detail = contRegister>0 ? "01" : detail+"01";

            contRegister++;
            detail += String.format("%02d",contRegister);
            detail += String.format("%-50s", projeto.getNomeEmpresa());
            detail += String.format("%-50s", projeto.getTituloDemanda());
            detail += String.format("%-25s", projeto.getTecnologia());
            detail += String.format("%-25s", projeto.getSoftSkills());

            recordArchive.gravaRegistro(nomeArq,detail);
        }

        trailer += "02";
        trailer += String.format("%010d",contRegister);
        recordArchive.gravaRegistro(nomeArq,trailer);

    }

}
