package qora;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {

    JFrame frame;
    JPanel panel;
    CardLayout cLayout;

    public Main() {
        frame = new JFrame("Qora");

        cLayout = new CardLayout();
        panel = new JPanel(cLayout);

        Login login = new Login(this);
        ManageStudent student = new ManageStudent(this);
        ManageEvent event = new ManageEvent(this);
        ManageAttendance attendance = new ManageAttendance(this);
        QRScanner qr = new QRScanner(this);

        panel.add(login, "login");
        panel.add(student, "student");
        panel.add(event, "event");
        panel.add(attendance, "attendance");
        panel.add(qr, "qr");

        frame.add(panel);

        frame.setSize(1100, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void showPage(String page) {
        cLayout.show(panel, page);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main();
        });
    }
}
