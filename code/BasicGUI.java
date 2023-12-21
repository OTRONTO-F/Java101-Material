package code;

import javax.swing.*;

public class BasicGUI {
    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("My Basic GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("Hello, world!");

        // Create a button
        JButton button = new JButton("Click me!");

        // Add components to the frame
        frame.add(label);
        frame.add(button);

        // Pack the components to make them fit nicely within the frame
        frame.pack();

        // Set the frame visibility to display it
        frame.setVisible(true);
    }
}
