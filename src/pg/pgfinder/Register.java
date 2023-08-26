package pg.pgfinder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Register extends JFrame implements ActionListener {

    JTextField username;
    JPasswordField password;
    JButton login;
    Register(){
        setLayout(null);
        setSize(1400, 565);
        setLocation(100,100);

        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("proimg/login.png"));
        Image img2 = im.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);

        image.setBounds(400,30,150,150);
        add(image);

        JLabel user = new JLabel("Username");
        user.setBounds(100,20,100,30);
        user.setForeground(Color.black);

        add(user);

        username = new JTextField();
        username.setBounds(210,20,150,30);
        add(username);

        JLabel pass = new JLabel("Password");
        pass.setBounds(100,70,100,30);
        pass.setForeground(Color.black);
        add(pass);

        password = new JPasswordField();
        password.setBounds(210,70,150,30);
        add(password);

        login = new JButton("Login");
        login.setBounds(150,150,100,40);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);



        setBounds(500, 200, 600, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
    }

    public static void main(String[] args){
        new Register();
    }
}

