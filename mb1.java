import javax.swing.*;
import java.awt.*;
class mb1
{
    public static void main(String args[]) {
        //Creating the Frame
        JFrame frame = new JFrame("FEEDBACK BOX");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("HELP");
        JMenu m3 = new JMenu("TOOLS");
        mb.add(m1);
        mb.add(m3);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save");
        m1.add(m11);
        m1.add(m22);
        JMenuItem m111 = new JMenuItem("About");
        JMenuItem m222 = new JMenuItem("License");
        m2.add(m111);
        m2.add(m222);
        JMenuItem edit = new JMenuItem("EDIT");
        JMenuItem size = new JMenuItem("SIZE");
        m3.add(edit);
        m3.add(size);
        JMenuItem quitButton = new JMenuItem("Quit");
        quitButton.addActionListener((event) -> System.exit(0));
        m1.add(quitButton);
        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Name of writer");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        // Text Area at the Center
        JTextArea ta = new JTextArea();
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}