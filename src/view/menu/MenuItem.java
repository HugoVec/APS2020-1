package view.menu;

public class MenuItem {
    private final String title;
    private final OnItemSelected callback;

    public MenuItem(String title, OnItemSelected callback) {
        this.title = title;
        this.callback = callback;
    }

    public void draw(int index) {
        System.out.println(String.format("[%d] %s", index, title));
    }

    public void select() {
        callback.onSelect();
    }
}
