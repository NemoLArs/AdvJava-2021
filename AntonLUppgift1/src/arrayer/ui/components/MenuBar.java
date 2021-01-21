package arrayer.ui.components;

import javax.swing.*;

public class MenuBar extends JMenuBar {
    public MenuBar(ExitButton exitButton) {
        final Menu menu = new Menu(exitButton);
        this.setBounds(0, 0, 500, 20);
        this.add(menu);
    }
}
