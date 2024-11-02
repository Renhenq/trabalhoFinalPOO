public abstract class Estudante extends Pessoa{
    protected float CRA;

    public Estudante(String CPF, String nome, String dataNascimento, float CRA){
        super(CPF, nome, dataNascimento);
        this.CRA = CRA;
    }
    
    public void alterarCRA(float CRA) throws CraException{
        if(CRA < 0){
            throw new CraException("CRA não pode ser inferior a zero.");
        }
        if(CRA > 100){
            throw new CraException("CRA não pode ser superior a cem.");
        }
        this.CRA = CRA;
        System.out.println("CRA alterado com sucesso.");
    }

    public void setCRA(float CRA){
        try {
            alterarCRA(CRA);
        } catch (CraException e) {
            System.out.println(e.getMessage());
        }
    }

    public float getCRA() {
        return CRA;
    }

    @Override
    public abstract String toString();
}
