import javax.swing.*;

/**
 * @author Matus Jakab
 */
public class Udumb {
    private JButton yesButton;
    private JButton noButton;
    private JPanel panel1;
    private static JFrame frame;

    public Udumb() {
        yesButton.addActionListener( (e) -> {
            Iknew.createUIComponent();
            frame.dispose();
        });

        noButton.addActionListener( (e) -> {
            frame.dispose();
            Udumb.createUIComponent();
        });
    }

    public static void createUIComponent() {

        frame = new JFrame("Welcome screen");
        frame.setSize(300, 150);
        frame.setContentPane(new Udumb().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
