public abstract class Pessoa {
    protected String CPF;
    protected String nome;
    protected String dataNascimento;

    public Pessoa(String cpf, String nome, String data){
        this.CPF = cpf;
        this.nome = nome;
        this.dataNascimento = data;
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

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    //Método abstrato
    @Override
    public abstract String toString();
}
