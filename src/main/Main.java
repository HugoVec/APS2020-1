package main;

import entity.Curso;
import javafx.application.Application;
import javafx.stage.Stage;
import model.CursoSql;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("APS2020-1");
        stage.show();

    }
}
