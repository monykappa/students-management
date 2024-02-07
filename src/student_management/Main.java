package student_management;

import Login.LoginApplication;
import Test.Test;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Login Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Instantiate LoginApplication panel
//        Test test = new Test();

        LoginApplication LoginPanel = new LoginApplication();

        // Add the LoginApplication panel to the JFrame
        frame.getContentPane().add(LoginPanel);

        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }
}
