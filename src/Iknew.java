import javax.swing.*;

/**
 * @author Matus Jakab
 */
public class Iknew {
    private JPanel panel1;
    private JPanel text;
    private JButton fuckYouButton;
    private static JFrame frame;


    public Iknew() {
        fuckYouButton.addActionListener( (e) -> frame.dispose());
    }

    public static void createUIComponent() {

        frame = new JFrame("Welcome screen");
        frame.setSize(300, 150);
        frame.setContentPane(new Iknew().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
