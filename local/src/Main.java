import javax.swing.*;

class LoginDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Email:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JLabel successLabel = new JLabel("");
        successLabel.setBounds(10, 110, 300, 25);
        panel.add(successLabel);

        loginButton.addActionListener(e -> {
            String email = userText.getText();
            String password = new String(passwordText.getPassword());

            // Replace this with your own logic for authentication
            if (email.equals("parmminder@example.com") && password.equals("varas11")) {
                successLabel.setText("Login Successful!");
            } else {
                successLabel.setText("Incorrect Email or Password!");
            }
        });
    }
}