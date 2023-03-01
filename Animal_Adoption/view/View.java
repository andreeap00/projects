package view;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    public JButton makeGetCertificateButton;
    public JTextField nameTextField;
    public JTextField surnameTextField;
    public JTextField adressTextField;
    public JTextField animalsAtHomeTextField;
    public JTextField dogAgeTextField;

    JLabel certificateLabel;
    JLabel nameLabel;
    JLabel surnameLabel;
    JLabel adressLabel;
    JLabel animalsAtHomeLabel;
    JLabel dogAgeLabel;
    JFrame frame;

    public View() {
        frame = new JFrame();
        frame.setSize(1300, 700);
        frame.setTitle("Adoption Certificate");
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // the first panel
        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder());
        panel.setLayout(null);
        panel.setBounds(180, 80, 500, 500);
        panel.setBackground(Color.WHITE);
        panel.setVisible(true);
        frame.add(panel);

        // the one the text is to be displayed on
        JPanel panel2 = new JPanel();
        panel2.setBorder(new EtchedBorder());
        panel2.setLayout(null);
        panel2.setBounds(750, 80, 350, 500);
        panel2.setBackground(new Color(20, 54, 156));
        panel2.setVisible(true);
        frame.add(panel2);


        nameLabel = new JLabel("Adopter's name: ");
        nameLabel.setBounds(17, 50, 250, 37);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        nameLabel.setForeground(new Color(20, 54, 156));
        panel.add(nameLabel);

        surnameLabel = new JLabel("Surname: ");
        surnameLabel.setBounds(17, 100, 250, 37);
        surnameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        surnameLabel.setForeground(new Color(20, 54, 156));
        panel.add(surnameLabel);

        adressLabel = new JLabel("Adress: ");
        adressLabel.setBounds(17, 150, 250, 37);
        adressLabel.setFont(new Font("Arial", Font.BOLD, 20));
        adressLabel.setForeground(new Color(20, 54, 156));
        panel.add(adressLabel);

        animalsAtHomeLabel = new JLabel("Number of animals at home");
        animalsAtHomeLabel.setBounds(17, 200, 250, 37);
        animalsAtHomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        animalsAtHomeLabel.setForeground(new Color(20, 54, 156));
        panel.add(animalsAtHomeLabel);

        dogAgeLabel = new JLabel("Dog age: ");
        dogAgeLabel.setBounds(17, 250, 250, 37);
        dogAgeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        dogAgeLabel.setForeground(new Color(20, 54, 156));
        panel.add(dogAgeLabel);


        nameTextField = new JTextField();
        nameTextField.setBounds(280, 50, 200, 37);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 20));
        nameTextField.setForeground(Color.WHITE);
        nameTextField.setBackground(new Color(20, 54, 156));
        panel.add(nameTextField);

        surnameTextField = new JTextField();
        surnameTextField.setBounds(280, 100, 200, 37);
        surnameTextField.setFont(new Font("Arial", Font.BOLD, 20));
        surnameTextField.setForeground(Color.WHITE);
        surnameTextField.setBackground(new Color(20, 54, 156));
        panel.add(surnameTextField);

        adressTextField = new JTextField();
        adressTextField.setBounds(280, 150, 200, 37);
        adressTextField.setFont(new Font("Arial", Font.BOLD, 20));
        adressTextField.setForeground(Color.WHITE);
        adressTextField.setBackground(new Color(20, 54, 156));
        panel.add(adressTextField);

        animalsAtHomeTextField = new JTextField();
        animalsAtHomeTextField.setBounds(280, 200, 200, 37);
        animalsAtHomeTextField.setFont(new Font("Arial", Font.BOLD, 20));
        animalsAtHomeTextField.setForeground(Color.WHITE);
        animalsAtHomeTextField.setBackground(new Color(20, 54, 156));
        panel.add(animalsAtHomeTextField);

        dogAgeTextField = new JTextField();
        dogAgeTextField.setBounds(280, 250, 200, 37);
        dogAgeTextField.setFont(new Font("Arial", Font.BOLD, 20));
        dogAgeTextField.setForeground(Color.WHITE);
        dogAgeTextField.setBackground(new Color(20, 54, 156));
        panel.add(dogAgeTextField);


        certificateLabel = new JLabel();
        certificateLabel.setBounds(35, 20, 300, 400);
        certificateLabel.setFont(new Font("Arial", Font.BOLD, 25));
        certificateLabel.setForeground(Color.WHITE);
        panel2.add(certificateLabel);
        panel2.setVisible(true);

        makeGetCertificateButton = new JButton("GET CERTIFICATE");
        makeGetCertificateButton.setFocusable(false);
        makeGetCertificateButton.setBounds(90, 350, 340, 80);
        makeGetCertificateButton.setBackground(new Color(20, 54, 156));
        makeGetCertificateButton.setFont(new Font("Arial", Font.BOLD, 15));
        makeGetCertificateButton.setForeground(Color.WHITE);
        makeGetCertificateButton.setBorderPainted(false);
        panel.add(makeGetCertificateButton);
        makeGetCertificateButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == makeGetCertificateButton) {
                }
            }
        });

        frame.setVisible(true);
    }

    // in order to print the message from the certificate on different lines (br)
    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }

    // using actionlistener in order to my make the button for getting the certificate
    public void makeCertificateListener(ActionListener listenforbutton) {
        makeGetCertificateButton.addActionListener(listenforbutton);
    }

    // show the text from the certificate
    public void setTextToCertificateLabel(String s) {
        certificateLabel.setText(convertToMultiline(s));
    }
}
