package arrayer.ui.components;

import javax.swing.*;

public class LabelResults extends JTextPane {
        public LabelResults() {
                this.setText("TEST");
                this.setBounds(100, 300, 300, 300);
                this.setVisible(false);
        }

        public void AddResults(long one, long two, long three, Double four, Integer five, boolean six, boolean seven) {



                String finalText =
                        "Resultat från del 1\n1. " + (one) +"\n2. " + (two) +
                        "\n3. " + (three) +
                        "\n4. " + (four) +
                        "\n5. " + (five) +
                        "\n6. " + (six) +
                        "\n7. " + (seven);

                       this.setText(finalText);
                       this.setVisible(true);
        }

}