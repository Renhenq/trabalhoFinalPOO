public class AlunosPos extends Estudante{
    protected String temaPesquisa;

    public AlunosPos(String CPF, String nome, String dataNascimento, float CRA, String temaPesquisa){
        super(CPF, nome, dataNascimento, CRA);
        this.temaPesquisa = temaPesquisa;
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

    public void setTemaPesquisa(String temaPesquisa) {
        this.temaPesquisa = temaPesquisa;
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

    public String getTemaPesquisa() {
        return temaPesquisa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tema de Pesquisa: " + temaPesquisa + "\n";
    }
}
