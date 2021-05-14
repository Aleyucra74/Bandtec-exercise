public class Projeto {

    private String nomeEmpresa;
    private String tituloDemanda;
    private String tecnologia;
    private String softSkills;

    public Projeto(String nomeEmpresa, String tituloDemanda, String tecnologia, String softSkills) {
        this.nomeEmpresa = nomeEmpresa;
        this.tituloDemanda = tituloDemanda;
        this.tecnologia = tecnologia;
        this.softSkills = softSkills;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getTituloDemanda() {
        return tituloDemanda;
    }

    public void setTituloDemanda(String tituloDemanda) {
        this.tituloDemanda = tituloDemanda;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "nomeEmpresa='" + nomeEmpresa + '\'' +
                ", tituloDemanda='" + tituloDemanda + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                ", softSkills='" + softSkills + '\'' +
                '}';
    }

}
