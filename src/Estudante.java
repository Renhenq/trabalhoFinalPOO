public class Estudante {
    protected String CPF;
    protected String nome;
    protected String dataNascimento;
    protected float CRA;

    public Estudante(String CPF, String nome, String dataNascimento, float CRA){
        this.CPF = CPF;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CRA = CRA;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCRA(float CRA) {
        this.CRA = CRA;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public float getCRA() {
        return CRA;
    }

    @Override
    public String toString() {
        return "        >>>Aluno [CPF: " + CPF + ", Nome: " + nome +
                ", Data de Nascimento: " + dataNascimento + ", CRA:" + CRA;
    }
}
