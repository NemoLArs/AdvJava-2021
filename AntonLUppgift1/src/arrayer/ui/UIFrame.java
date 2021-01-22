package arrayer.ui;

import arrayer.ui.components.*;
import arrayer.code.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UIFrame extends JFrame implements ActionListener {


    private final ExitButton exitButton = new ExitButton(this);
    private final PartOneButton partOneButton = new PartOneButton(this);
    public LabelResults labelResults = new LabelResults();

    public UIFrame() {
        addComponents(new MenuBar(exitButton), partOneButton, new LabelInfo(),labelResults , new PartTwoButton(this), new PartThreeButton(this));
        setupFrameData();
    }

    private void setupFrameData() {
        this.setSize(500, 700);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * @param components All components to add
     */
    private void addComponents(JComponent... components) {
        for(JComponent component : components) {
            add(component);
        }
    }

    @Override
    public void actionPerformed(ActionEvent action) {

        if (exitButton.equals(action.getSource())) {
            System.exit(0);
        }
        if (partOneButton.equals(action.getSource())){
            ArrayCollector arrayCollector = new ArrayCollector();
            arrayCollector.readArrayFile(this);
        }
    }

}
