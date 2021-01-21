package arrayer.ui.components;


import arrayer.ui.UIFrame;

import javax.swing.*;

public class PartOneButton extends JButton {

    public PartOneButton(UIFrame uiFrame) {

        this.setBounds(100, 100, 300, 50);
        this.setText("Del 1");
        this.addActionListener(uiFrame);
    }
}