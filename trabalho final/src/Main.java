//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

//import sc.nextLine;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String CPF, nome, dataNascimento, estagio, temaPesq, inicioContrato, departamentoVinculado, codigo, semestre, ano;
        int caraH;
        float CRA;
    
        ArrayList<AlunosGraduacao> alunosGraduacao = new ArrayList<>();
        ArrayList<AlunosPos> alunosPos = new ArrayList<>();
        ArrayList<Professor> professores  = new ArrayList<>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        int opcao;
        do {
            System.out.println("----------MENU----------");
            System.out.println("1) Popular o sistema\n2) Cadastrar novo aluno de Graduação\n3) Cadastrar novo aluno de Pos Graduação\n4) Cadastrar Professor\n5) Cadastrar Disciplina\n6) Cadastrar Turma\n7) Mostrar informações do sistema\n8) Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1: 
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

                    Turma [] turmasAut = new Turma[3];
                    turmasAut[0] = new Turma("1", "2017", estudantes1);
                    turmasAut[1] = new Turma("1", "2023", estudantes2);
                    turmasAut[2] = new Turma("2", "2017", estudantes3);

                    Professor professor = new Professor("879.488.326-11", "Roberto", "02/08/1972", "16/01/2008", "FACOM");
                    Disciplina POO = new Disciplina("GBC2009", "Programação Orientada a Objetos", 60, turmas);

                    System.out.println(professor);
                    System.out.println(POO);
                    break;
                case 2:
                    AlunosGraduacao grad;
                    System.out.println("Qual o CPF do aluno?");
                    CPF = sc.nextLine();
                    System.out.println("Qual o nome do aluno?");
                    nome = sc.nextLine();
                    System.out.println("Qual a data de nascimento do aluno?");
                    dataNascimento = sc.nextLine();
                    System.out.println("Qual o CRA do aluno?");
                    CRA = sc.nextFloat();
                    System.out.println("Qual o estágio do aluno?");
                    estagio = sc.nextLine();
                    sc.next();
                    grad = new AlunosGraduacao(CPF, nome, dataNascimento, CRA, estagio);
                    alunosGraduacao.add(grad);
                    break;
                case 3:
                    AlunosPos pos;
                    System.out.println("Qual o CPF do aluno?");
                    CPF = sc.nextLine();
                    System.out.println("Qual o nome do aluno?");
                    nome = sc.nextLine();
                    System.out.println("Qual a data de nascimento do aluno?");
                    dataNascimento = sc.nextLine();
                    System.out.println("Qual o CRA do aluno?");
                    CRA = sc.nextFloat();
                    sc.next();
                    System.out.println("Qual o tema da pesquisa do aluno?");
                    temaPesq = sc.nextLine();
                    pos = new AlunosPos(CPF, nome, dataNascimento, CRA, temaPesq);
                    alunosPos.add(pos);
                    break;
                
                case 4:
                    Professor prof;
                    System.out.println("Qual o CPF do professor?");
                    CPF = sc.nextLine();
                    System.out.println("Qual o nome do professor?");
                    nome = sc.nextLine();
                    System.out.println("Qual a data de nascimento do professor?");
                    dataNascimento = sc.nextLine();
                    System.out.println("Qual a data de inicio do contratoo?");
                    inicioContrato = sc.nextLine();
                    System.out.println("Qual o departamento ao qual o professor está vinculado?");
                    departamentoVinculado = sc.nextLine();
                    prof = new Professor(CPF, nome, dataNascimento, inicioContrato, departamentoVinculado);
                    professores.add(prof);
                case 5:
                    Disciplina disci;
                    ArrayList<Turma> turmas = new ArrayList<>();
                    System.out.println("Qual o codigo da disciplina?");
                    codigo = sc.nextLine();
                    System.out.println("Qual o nome da disciplina?");
                    nome = sc.nextLine();
                    System.out.println("Qual a carga horaria da disciplina?");
                    caraH = sc.nextInt();
                    sc.next();
                    
                    System.out.println("Voce deseja cadastrar uma nova turma? 1 - sim 2 - nao");
                    int op = sc.nextInt();
                    sc.next();
                    if(op == 1){
                        System.out.println("Qual o semestre da disciplina?");
                        semestre = sc.nextLine();
                        System.out.println("Qual o ano da disciplina?");
                        ano = sc.nextLine();
                        System.out.println("Você deseja cadastrar alunos? 1 - sim 2 - nao");
                        int op2 = sc.nextInt();
                        sc.next();
                        ArrayList<AlunosPos> alunosDisci = new ArrayList<>();
                        if(op2 == 1 && tipo == ""){

                        }
                    }
                    
                case 6:
                    Turma turma;
                    System.out.println("De qual semestre é esta turma?");
                    semestre = sc.nextLine();
                    System.out.println("De qual ano é esta turma?");
                    ano = sc.nextLine();
                    System.out.println("É uma disciplina de graduação ou pós graduação?");
                    String tipo = sc.nextLine().toLowerCase();
                    System.out.println("Voce deseja cadastrar alunos na turma? 1 - sim 2 - nao");
                    int op6 = sc.nextInt();

                    if(op6 == 1){
                        for()
                    }
                        
                    break;
                case 7:
                    System.out.println("Professores cadastrados: ");

                    for(Professor p : professores){
                        p.toString();
                    }

                    System.out.println("Disciplinas cadastradas: ");

                    for(Disciplina d : disciplinas){
                        d.toString();
                        System.out.println();
                    }
                
                    break;
                case 8:
                        System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }         
        } while (opcao != 8);
        
        //Fechar o Scanner
        sc.close();
    }

}