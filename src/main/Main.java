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

public class Main extends Application {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        AlunoModel test = new AlunoModel();
        Aluno aluno = new Aluno();
        
        System.out.println("ESCOLHA! ");
        System.out.println("INSERIR ALUNO = 1 ");

        int choice = scanner.nextInt();
        
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
        }
        
        System.out.println(choice);
        
        
        
        
        
        
        
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("APS2020-1");
        stage.show();

    }
}
