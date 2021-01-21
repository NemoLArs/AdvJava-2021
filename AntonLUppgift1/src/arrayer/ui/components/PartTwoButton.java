package arrayer.ui.components;


import arrayer.ui.UIFrame;

import javax.swing.*;

public class PartTwoButton extends JButton {

    public PartTwoButton(UIFrame uiFrame) {

        this.setBounds(100, 150, 300, 50);
        this.setText("Del 2");
        this.addActionListener(uiFrame);
    }
}