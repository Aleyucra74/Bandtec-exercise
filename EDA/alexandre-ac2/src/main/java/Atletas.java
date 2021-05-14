public class Atletas {

    private Integer id;
    private String nome;
    private String tipoAtleta;
    private Double altura;
    private String tipoExercicio;
    private String clube;
    private String sexo;

    public Atletas(Integer id, String nome, String tipoAtleta, Double altura, String tipoExercicio, String clube, String sexo) {
        this.id = id;
        this.nome = nome;
        this.tipoAtleta = tipoAtleta;
        this.altura = altura;
        this.tipoExercicio = tipoExercicio;
        this.clube = clube;
        this.sexo = sexo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAtleta() {
        return tipoAtleta;
    }

    public void setTipoAtleta(String tipoAtleta) {
        this.tipoAtleta = tipoAtleta;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getTipoExercicio() {
        return tipoExercicio;
    }

    public void setTipoExercicio(String tipoExercicio) {
        this.tipoExercicio = tipoExercicio;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Atletas{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipoAtleta='" + tipoAtleta + '\'' +
                ", altura=" + altura +
                ", tipoExercicio='" + tipoExercicio + '\'' +
                ", clube='" + clube + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
