package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClickyGUI implements ActionListener {

    int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public ClickyGUI(){




        frame = new JFrame();
        panel = new JPanel();
        JButton button = new JButton("Click me");
        label = new JLabel("Number of Clicks: 0");
        button.addActionListener(this);
        panel.add(button);
        panel.add(label);


        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);



    }
    public static void main(String[] args) {

        new ClickyGUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks: " + count);
    }
}
