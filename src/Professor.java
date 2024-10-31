public class Professor {
    protected String CPF;
    protected String nome;
    protected String dataNascimento;
    protected String inicioContrato;
    protected String departamentoVinculado;

    public Professor(String CPF, String nome, String dataNascimento, String inicioContrato, String  departamentoVinculado){
        this.CPF = CPF;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.inicioContrato = inicioContrato;
        this.departamentoVinculado = departamentoVinculado;
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

    public void setInicioContrato(String inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public void setDepartamentoVinculado(String departamentoVinculado) {
        this.departamentoVinculado = departamentoVinculado;
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
