package arrayer.ui.components;


import arrayer.ui.UIFrame;

import javax.swing.*;

public class PartThreeButton extends JButton {

    public PartThreeButton(UIFrame uiFrame) {

        this.setBounds(100, 200, 300, 50);
        this.setText("Del 3");
        this.addActionListener(uiFrame);
    }
}
