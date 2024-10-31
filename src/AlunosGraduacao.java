public class AlunosGraduacao extends Estudante{
    protected String estagio;

    public AlunosGraduacao(String CPF, String nome, String dataNascimento, float CRA, String estagio){
        super(CPF, nome, dataNascimento, CRA);
        this.estagio = estagio;
    }

    @Override
    public void setCPF(String CPF) {
        super.setCPF(CPF);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setDataNascimento(String dataNascimento) {
        super.setDataNascimento(dataNascimento);
    }

    @Override
    public void setCRA(float CRA) {
        super.setCRA(CRA);
    }

    public void setEstagio(String estagio) {
        this.estagio = estagio;
    }

    @Override
    public String getCPF() {
        return super.getCPF();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getDataNascimento() {
        return super.getDataNascimento();
    }

    @Override
    public float getCRA() {
        return super.getCRA();
    }

    public String getEstagio() {
        return estagio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estagio: " + estagio + "\n";
    }
}
