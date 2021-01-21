package arrayer.ui.components;

import javax.swing.*;

public class Menu extends JMenu{

    public Menu(ExitButton exitButton) {
        this.add(exitButton);
        this.setText("Menu");
    }
}
