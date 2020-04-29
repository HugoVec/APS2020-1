package main;

import view.menu.Menu;
import view.menu.MenuItem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Alunos", () -> System.out.println("Alunos Selecionado")));
        menuItems.add(new MenuItem("Turmas", () -> System.out.println("Turmas Selecionado")));
        menuItems.add(new MenuItem("Cursos", () -> System.out.println("Cursos Selecionado")));

        view.Main main = new view.Main("Sistema de Gerenciamento\n Universidade Amazonas");
        main.draw();

        Menu menu = new Menu(menuItems);
        menu.draw();
    }
}
