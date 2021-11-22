public class Aluno{

    private String ra;
    private String nome;
    private String turma;

    public Aluno(String ra, String nome, String turma) {
        this.ra = ra;
        this.nome = nome;
        this.turma = turma;
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

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
