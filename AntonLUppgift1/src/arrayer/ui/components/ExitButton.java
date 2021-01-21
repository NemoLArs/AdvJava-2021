package arrayer.ui.components;

import arrayer.ui.UIFrame;

import javax.swing.*;

public class ExitButton extends JMenuItem {

    public ExitButton(UIFrame uiFrame) {
        this.addActionListener(uiFrame);
        this.setText("Exit Program");
    }
}