import java.util.Arrays;

public class Disciplina {
    protected String codigo;
    protected String nome;
    protected int cargaHoraria;
    protected Turma [] turmas;

    public Disciplina(String codigo, String nome, int cargaHoraria, Turma turmas[]){
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.turmas = turmas;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return ">>>Disciplina\nCódigo: " + codigo + "\nNome: " + nome +
                "\nCarga Horaria: " + cargaHoraria + "\nProfessor da disciplina: " + "\nTurmas:\n" + Arrays.toString(turmas);
    }
}
