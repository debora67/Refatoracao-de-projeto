package CodigoRefatorado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CodigoRefatorado.FactoryMethod.AlunoFactory;
import CodigoRefatorado.FactoryMethod.CursoFactory;
import CodigoRefatorado.FactoryMethod.DisciplinaFactory;
import CodigoRefatorado.FactoryMethod.ProfessorFactory;

public class SistemaMatriculas {
    private static List<Aluno> alunos = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();
    private static List<Curso> cursos = new ArrayList<>();
    private static List<Disciplina> disciplinas = new ArrayList<>();

    private static final AlunoFactory alunoFactory = new AlunoFactory();
    private static final ProfessorFactory professorFactory = new ProfessorFactory();
    private static final CursoFactory cursoFactory = new CursoFactory();
    private static final DisciplinaFactory disciplinaFactory = new DisciplinaFactory();

    public static void main(String[] args) {
        carregarDados();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Matrículas");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Cadastrar Curso");
            System.out.println("4. Listar Cursos");
            System.out.println("5. Cadastrar Disciplina");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno(scanner);
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    cadastrarCurso(scanner);
                    break;
                case 4:
                    listarCursos();
                    break;
                case 5:
                    cadastrarDisciplina(scanner);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }

    private static void cadastrarAluno(Scanner scanner) {
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        alunos.add(alunoFactory.criar(nome, senha));
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private static void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Alunos cadastrados:");
            for (Aluno aluno : alunos) {
                System.out.println("- " + aluno.getNome());
            }
        }
    }

    private static void cadastrarCurso(Scanner scanner) {
        System.out.print("Nome do curso: ");
        String nome = scanner.nextLine();
        System.out.print("Créditos: ");
        int credito = scanner.nextInt();
        scanner.nextLine();
        cursos.add(cursoFactory.criar(nome, credito));
        System.out.println("Curso cadastrado com sucesso!");
    }

    private static void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
        } else {
            System.out.println("Cursos cadastrados:");
            for (Curso curso : cursos) {
                System.out.println("- " + curso.getNome());
            }
        }
    }

    private static void cadastrarDisciplina(Scanner scanner) {
        System.out.print("Nome da disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Valor da disciplina: ");
        int valor = scanner.nextInt();
        disciplinas.add(disciplinaFactory.criar(nome, valor));
        System.out.println("Disciplina cadastrada com sucesso!");
    }

    private static void carregarDados() {
        System.out.println("[Simulação] Dados carregados.");
    }
}
