package view.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private final ArrayList<MenuItem> menuItems;

    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void draw() {
        System.out.println("\n-- Menu Principal --\n");

        int index = 1;
        for (MenuItem item : menuItems) {
            item.draw(index);
            index++;
        }

        System.out.print('\n');

        waitForInput();
    }

    public void waitForInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        menuItems.get(input - 1).select();

        draw();
        waitForInput();
    }
}
