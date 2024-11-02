public class AlunosPos extends Estudante{
    protected String temaPesquisa;

    public AlunosPos(String CPF, String nome, String dataNascimento, float CRA, String temaPesquisa){
        super(CPF, nome, dataNascimento, CRA);
        this.temaPesquisa = temaPesquisa;
    }

    public void setTemaPesquisa(String temaPesquisa) {
        this.temaPesquisa = temaPesquisa;
    }

    public String getTemaPesquisa() {
        return temaPesquisa;
    }

    @Override
    public String toString() {
        return "        >>>Aluno [CPF: " + CPF + ", Nome: " + nome +
                ", Data de Nascimento: " + dataNascimento + ", CRA:" + CRA + ", Tema de Pesquisa: " + temaPesquisa + "\n";
    }
}