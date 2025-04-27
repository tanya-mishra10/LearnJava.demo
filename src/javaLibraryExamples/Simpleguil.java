package javaLibraryExamples;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simpleguil implements ActionListener {
    private JButton button;
    public static void main(String[] args) {
        Simpleguil sm = new Simpleguil();
        sm.go();
    }
        public void go () {
            JFrame frame = new JFrame();
            button = new JButton("click me");
            button.addActionListener(this);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(button);
            frame.setSize(300, 300);
            frame.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("i have been clicked");
    }
}

