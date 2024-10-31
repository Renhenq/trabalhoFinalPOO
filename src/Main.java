//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudante [] estudantes1 = new Estudante[4];
        estudantes1[0] = new AlunosGraduacao("836.289.018-77", "Ana", "03/07/2001", 67.5f, "ML");
        estudantes1[1] = new AlunosGraduacao("937.289.786-89", "Fabio", "25/04/2002", 78.7f, "TI");
        estudantes1[2] = new AlunosGraduacao("384.728.999-86", "Luana", "03/11/1999", 88.4f, "Ciberseguranca");
        estudantes1[3] = new AlunosGraduacao("352.244.276-34", "Marcelo", "21/03/2002", 65.4f, "TI");

        Estudante [] estudantes2 = new Estudante[4];
        estudantes2[0] = new AlunosPos("465.345.243-00", "Rafaela", "03/11/2002", 87.5f, "Computação grafica");
        estudantes2[1] = new AlunosPos("937.289.786-89", "Eduarda", "23/05/2002", 72.7f, "PDI");
        estudantes2[2] = new AlunosPos("384.728.999-86", "Otavio", "11/12/1999", 68.4f, "ML");
        estudantes2[3] = new AlunosPos("352.244.276-34", "Beto", "01/09/2003", 69.5f, "Jogos Digitais");

        Estudante [] estudantes3 = new Estudante[4];
        estudantes3[0] = new AlunosGraduacao("847.382.339-78", "Ana Luiza", "04/12/2003", 87.6f, "Não informado");
        estudantes3[1] = new AlunosGraduacao("923.349.455-23", "Alexandre", "27/08/2002", 79.4f, "TI");
        estudantes3[2] = new AlunosGraduacao("239.103.255-38", "Amelia", "23/11/1998", 91.2f, "Dev front-end");
        estudantes3[3] = new AlunosGraduacao("203.673.882-45", "Adalton", "09/04/2001", 88.3f, "TI");

        Turma [] turmas = new Turma[3];
        turmas[0] = new Turma("1", "2017", estudantes1);
        turmas[1] = new Turma("1", "2023", estudantes2);
        turmas[2] = new Turma("2", "2017", estudantes3);

        Professor professor = new Professor("879.488.326-11", "Roberto", "02/08/1972", "16/01/2008", "FACOM");
        Disciplina POO = new Disciplina("GBC2009", "Programação Orientada a Objetos", 60, turmas, professor);

        System.out.println(professor);
        System.out.println(POO);
    }
}