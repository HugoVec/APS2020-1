package main;

import entity.Curso;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
//import model.CursoSql;
import model.AlunoModel;
import entity.Aluno;
import java.sql.SQLException;
import model.CursoModel;
import entity.Disciplina;
import entity.Nota;
import model.DiciplinaModel;
import model.NotaModel;

public class Main extends Application {

    public static void main(String[] args) throws SQLException {
        int choice;
        
        Scanner scanner = new Scanner(System.in);
        AlunoModel test = new AlunoModel();
        CursoModel cursoM = new CursoModel();
        DiciplinaModel diciplinaM = new DiciplinaModel();
        NotaModel notaM = new NotaModel();
        Scanner ch = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        Disciplina disciplina = new Disciplina();
        Nota nota = new Nota();
        
        do{
            System.out.println("\n  =========================");
            System.out.println("|     (1)INSERIR ALUNO       |");
            System.out.println("|     (2)DELETAR ALUNO       |");
            System.out.println("|     (3)BUSCAR ALUNO        |");
            System.out.println("|     (4)ATUALIZAR ALUNO     |");
            System.out.println("|     (5)INSERIR CURSO       |");
            System.out.println("|     (6)DELETAR CURSO       |");
            System.out.println("|     (7)BUSCAR CURSO        |");
            System.out.println("|     (8)ATUALIZAR CURSO     |");
            System.out.println("|     (9)INSERIR DISCIPLINA  |");
            System.out.println("|     (10)DELETAR DISCIPLINA |");
            System.out.println("|     (11)BUSCAR DISCIPLINA  |");
            System.out.println("|     (12)INSERIR NOTAS      |");
            System.out.println("|     (13)DELETAR NOTAS      |");
            System.out.println("|     (14)EXIBIR NOTAS       |");
            System.out.println("|     (0)SAIR DO MENU        |");
            System.out.println("  =========================\n");
            System.out.println("Escolha uma opção: ");

            choice = ch.nextInt();
        
            switch (choice) {
            case 1:
                System.out.println("INSIRA O NOME DO ALUNO: ");
                String nome = scanner.next();
                aluno.setNome(nome);
            
                System.out.println("INSIRA O DOCUMENTO: ");
                String documento = scanner.next();
                aluno.setDocumento(documento);
            
                System.out.println("INSIRA O SEXO (M) OU (F): ");
                String sexo = scanner.next();
                aluno.setSexo(sexo);
            
                System.out.println("INSIRA A IDADE: ");
                int idade = scanner.nextInt();
                aluno.setIdade(idade);
            
                test.salvar(aluno);
            
                break;
        
            case 2:
                System.out.println("INFORME O ALUNO A SER DELETADO (RA): ");
                String ra = scanner.next();
                AlunoModel.deletar(ra);
                System.out.println("DELETADO COM SUCESSO!!!");
            
                break;
            
            case 3:
                System.out.println("BUSQUE UM ALUNO (RA): ");
                ra = scanner.next();
                System.out.println(AlunoModel.encontrar(ra));
            
                break;
            
            case 4:
                System.out.println("ATUALIZE UM ALUNO (RA): ");
                ra = scanner.next();
                Aluno alunoAtt = AlunoModel.encontrar(ra);
                alunoAtt.setNome("HUGOOO");
                alunoAtt.salvar();
            
                break;
            
            case 5:            
                System.out.println("INSIRA O NOME DO CURSO: ");
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
            
            case 9:
                System.out.println("QUAL O CURSO DA DISCIPLINA: ");
                nomeC = scanner.next();
                CursoModel.getCurso(nomeC);
                System.out.println(CursoModel.getCurso(nomeC));
                System.out.println("INSIRA O NOME DA DISCIPLINA: ");
                String nomeDis = scanner.next();
                disciplina.setNome(nomeDis);
                
            break;
                
            case 10:
                System.out.println("INFORME A DISPLINA A SER DELETADO: ");
                nomeDis = scanner.next();
                DiciplinaModel.deletar(nomeDis);
                System.out.println("DELETADO COM SUCESSO!!!");
            
            break;
            
            case 11:
                System.out.println("INFORME O CURSO DA DISCIPLINA: ");
                nomeC = scanner.next();
                CursoModel.getCurso(nomeC);
                System.out.println(CursoModel.getCurso(nomeC));
                System.out.println("INFORME A DISCIPLINA: ");
                nomeDis = scanner.next();
                System.out.println(DiciplinaModel.encontrar(nomeDis));
                
            break;
            
            case 12:
                System.out.println("INFORME A DISCIPLINA AVALIADA: ");
                nomeDis = scanner.next();
                DiciplinaModel.encontrar(nomeDis);
                System.out.println(DiciplinaModel.encontrar(nomeDis));
                System.out.println("INSIRA A NOTA (NP1): ");
                int np1 = scanner.nextInt();
                nota.setNp1(np1);
                System.out.println("INSIRA A NOTA (NP2): ");
                int np2 = scanner.nextInt();
                nota.setNp2(np2);
                System.out.println("INSIRA A NOTA (SUB): ");
                int sub = scanner.nextInt();
                nota.setSub(sub);
                System.out.println("INSIRA A NOTA (EXAME): ");
                int exame = scanner.nextInt();
                nota.setExame(exame);
                
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
