public class AlunosGraduacao extends Estudante{
    protected String estagio;

    public AlunosGraduacao(String CPF, String nome, String dataNascimento, float CRA, String estagio){
        super(CPF, nome, dataNascimento, CRA);
        this.estagio = estagio;
    }

    public void setEstagio(String estagio) {
        this.estagio = estagio;
    }

    public String getEstagio() {
        return estagio;
    }

    @Override
    public String toString(){
        return "        >>>Aluno [CPF: " + super.CPF + ", Nome: " + super.nome +
                ", Data de Nascimento: " + super.dataNascimento + ", CRA:" + super.CRA + ", Estagio: " + estagio + "\n";
    }
}