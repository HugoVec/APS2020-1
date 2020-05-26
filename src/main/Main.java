package main;

import entity.Curso;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
//import model.CursoSql;
import model.AlunoMateriaSql;
import model.AlunoModel;
import entity.Aluno;
import java.sql.SQLException;
import model.CursoModel;

public class Main extends Application {

    public static void main(String[] args) throws SQLException {

        int choice;
        
        Scanner scanner = new Scanner(System.in);
        AlunoModel test = new AlunoModel();
        CursoModel cursoM = new CursoModel();
        Scanner ch = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        
        do{
            System.out.println("\n  =========================");
            System.out.println("|     (1)Inserir Aluno      |");
            System.out.println("|     (2)Deletar Aluno      |");
            System.out.println("|     (3)Buscar Aluno       |");
            System.out.println("|     (4)Atualizar Aluno    |");
            System.out.println("|     (5)Inserir Curso      |");
            System.out.println("|     (6)Deletar Curso      |");
            System.out.println("|     (7)Buscar Curso       |");
            System.out.println("|     (8)Atualizar Curso    |");
            System.out.println("|     (9)Inserir Turma      |");
            System.out.println("|     (0)Sair do menu       |");
            System.out.println("  =========================\n");
            System.out.println("Escolha uma opção: ");

            choice = ch.nextInt();
        
            switch (choice) {
            case 1:
                System.out.println("INSIRA O NOME: ");
                String nome = scanner.next();
                aluno.setNome(nome);
            
                System.out.println("INSIRA O DOCUMENTO: ");
                String documento = scanner.next();
                aluno.setDocumento(documento);
            
                System.out.println("INSIRA O SEXO: ");
                String sexo = scanner.next();
                aluno.setSexo(sexo);
            
                System.out.println("INSIRA O IDADE: ");
                int idade = scanner.nextInt();
                aluno.setIdade(idade);
            
                test.salvar(aluno);
            
                break;
        
            case 2:
                System.out.println("INFORME O ALUNO A SER DELETADO: ");
                String ra = scanner.next();
                AlunoModel.deletar(ra);
                System.out.println("DELETADO COM SUCESSO!!!");
            
                break;
            
            case 3:
                System.out.println("BUSQUE UM ALUNO: ");
                ra = scanner.next();
                System.out.println(AlunoModel.encontrar(ra));
            
                break;
            
            case 4:
                System.out.println("ATUALIZE UM ALUNO: ");
                ra = scanner.next();
                Aluno alunoAtt = AlunoModel.encontrar(ra);
                alunoAtt.setNome("HUGOOO");
                alunoAtt.salvar();
            
                break;
            
            case 5:            
                System.out.println("INSIRA O NOME: ");
                String nomeC = scanner.next();// nextLine da erro
                curso.setNome(nomeC);
            
                System.out.println("INSIRA A MENSALIDADE: ");
                Double mensalidade = scanner.nextDouble();
                curso.setMensalidade(mensalidade);
            
                curso.salvar();
            
                break;
            
            
            case 6:
                System.out.println("INFORME O CURSO A SER DELETADO: ");
                nomeC = scanner.next();
                CursoModel.deletar(nomeC);
                System.out.println("DELETADO COM SUCESSO!!!");
            
                break;
            
            
            case 7:
                System.out.println("BUSQUE UM CURSO: ");
                nomeC = scanner.next();
                System.out.println(CursoModel.getCurso(nomeC));             
            
                break;
            
            
            case 8:
                System.out.println("ATUALIZE UM CURSO: ");
                nomeC = scanner.next();
                Curso cursoAtt = CursoModel.getCurso(nomeC);
                cursoAtt.setNome("HUGO LINDO");
                cursoAtt.salvar();
            
            break;
            
        }
        }while(choice != 0);
        
        System.out.println("Sessão encerrada...");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("APS2020-1");
        stage.show();

    }
}
