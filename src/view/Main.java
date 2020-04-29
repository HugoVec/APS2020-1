
package view;

import view.menu.Menu;

public class Main {
    private String title;
    private Menu menu;

    public Main(String title) {
        this.title = title;
    }

    public Main(String title, Menu menu) {
        this.title = title;
        this.menu = menu;
    }

    public void draw() {
        System.out.println("--------------------");
        System.out.println(title);
        System.out.println("--------------------");

        if (menu != null) {
            menu.draw();
        }
    }
}
