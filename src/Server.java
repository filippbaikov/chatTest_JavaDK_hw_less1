import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Server extends JFrame {
    Scanner scanner = new Scanner(System.in);

    private final JButton start = new JButton("start Server");
    private final JButton stop = new JButton("stop Server");
    private JTextArea textArea = new JTextArea();


    public Server() {
        setTitle("Chat server");
        setBounds(200, 200, 500, 500);
        setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(start, BorderLayout.WEST);
        add(stop, BorderLayout.EAST);
        add(textArea, BorderLayout.CENTER);
        textArea.append("если ты уже зарегистрирован\n " +
                "введи логин и пароль \n" +
                "если нет, введи логин и пароль и создай аккаунт,\n в любом случае нажми start server");
        setVisible(true);
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("\n \n клиент запущен\n" +
                        "если нужно запустить еще один клиент \nнажми еще раз " +
                        "start server");

                Client client = new Client();

            }
        });



    }


    }


