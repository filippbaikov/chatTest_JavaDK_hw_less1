import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Client extends JFrame {
    public static JTextField logintext = null;
    private JPanel gridLayout = new JPanel(new GridLayout(1, 2));
    private final JButton login = new JButton("login");
    private final JButton password = new JButton("password");
    private Authorization authorization = new Authorization();
    public static JPasswordField passwordText;


    Client() {
        setBounds(800, 200, 500, 500);
        setTitle("Chat client");

        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        logintext = new JTextField(10);
        logintext.setToolTipText("your login");

        passwordText = new JPasswordField(10);
        passwordText.setToolTipText("your password");
        passwordText.setEchoChar('*');
        logintext.setVisible(false);
        passwordText.setVisible(false);

        gridLayout.add(login);
        gridLayout.add(logintext);

        gridLayout.add(password);
        gridLayout.add(passwordText);

        add(gridLayout, BorderLayout.NORTH);
        add(gridLayout, BorderLayout.NORTH);
        setVisible(true);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logintext.setVisible(true);


            }
        });
        password.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordText.setVisible(true);
            }
        });
        logintext.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                logintext.getText();
                if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
                    authorization.isAuthorized();
                    logintext.setEditable(false);
                    logintext.setEnabled(false);
                }
            }
        });
        passwordText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                passwordText.getPassword();
                if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
                    passwordText.setEditable(false);
                    passwordText.setEnabled(false);
                }
            }
        });


    }


}
