import java.util.Arrays;

public class Turma {
    protected String semestre;
    protected String ano;
    protected Estudante [] alunos;

    public Turma(String semestre, String ano, Estudante[] alunos){
        this.semestre = semestre;
        this.ano = ano;
        this.alunos = alunos;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setAlunos(Estudante[] alunos) {
        this.alunos = alunos;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getAno() {
        return ano;
    }

    public Estudante[] getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "    >>>Turma{Semestre: " + semestre + ", Ano: " + ano + "}\n" + Arrays.toString(alunos) + "\n";
    }
}
