import java.text.CollationElementIterator;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Desktop {
    private JFrame frame;
    private JPanel panel;
    private JPanel smallPanel;

    private JButton resetGame;
    private JButton changeColor;

    private JLabel colorLabel;

    public Desktop(){
        frame = new JFrame();
        panel = new JPanel();
        smallPanel = new JPanel(); 
        resetGame = new JButton("Reset");
        changeColor = new JButton("Color");
        colorLabel = new JLabel("RED");
        panelOptions();
        frameOptions();
    }


    private void frameOptions(){
        frame.setSize(600, 600);
        frame.setTitle("Turtle game");
        frame.setLayout(new BorderLayout());

        frame.add(smallPanel, BorderLayout.NORTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void panelOptions(){
        smallPanel.setBackground(Color.LIGHT_GRAY);
        smallPanel.setLayout(new FlowLayout());
        smallPanel.add(resetGame);
        smallPanel.add(changeColor);
        smallPanel.add(colorLabel);

    }
}
