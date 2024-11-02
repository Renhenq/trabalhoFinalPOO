public class Professor extends Pessoa{
    protected String inicioContrato;
    protected String departamentoVinculado;

    public Professor(String CPF, String nome, String dataNascimento, String inicioContrato, String  departamentoVinculado){
        super(CPF, nome, dataNascimento);
        this.inicioContrato = inicioContrato;
        this.departamentoVinculado = departamentoVinculado;
    }

    public void setInicioContrato(String inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public void setDepartamentoVinculado(String departamentoVinculado) {
        this.departamentoVinculado = departamentoVinculado;
    }

    public String getInicioContrato() {
        return inicioContrato;
    }

    public String getDepartamentoVinculado() {
        return departamentoVinculado;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "CPF: " + CPF +
                ", Nome: " + nome +
                ", Data de Nascimento: " + dataNascimento +
                ", Inicio do Contrato: " + inicioContrato +
                ", Departamento Vinculado: " + departamentoVinculado +
                "}\n";
    }
}
