public class Aluno {

    private String ra;
    private String nome;
    private String disciplina;
    private Double media;
    private Integer qntdFaltas;

    public Aluno(String ra, String nome, String disciplina, Double media, Integer qntdFaltas) {
        this.ra = ra;
        this.nome = nome;
        this.disciplina = disciplina;
        this.media = media;
        this.qntdFaltas = qntdFaltas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", media=" + media +
                ", qntdFaltas=" + qntdFaltas +
                '}';
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Integer getQntdFaltas() {
        return qntdFaltas;
    }

    public void setQntdFaltas(Integer qntdFaltas) {
        this.qntdFaltas = qntdFaltas;
    }
}
