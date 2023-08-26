package pg.pgfinder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PgFinder extends JFrame implements ActionListener {

    JButton newuser,next;

    PgFinder(){
        setLayout(null);
        setTitle("PG Availability Checker");
        setSize(1400, 565);
        setLocation(100,100);

        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("proimg/mountrooms.jpg"));
        Image img2 = im.getImage().getScaledInstance(1400,565,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);

        image.setBounds(0,0,1400,565);
        add(image);



        //JPanel title = new JPanel();
        JLabel text = new JLabel("PG AVAILABILITY CHECKER");
        text.setBounds(80, 400, 1200, 100 );
        text.setForeground(Color.white);
        text.setFont(new Font("serif",Font.BOLD, 60));
        image.add(text);

        next = new JButton("Admin");
        next.setBounds(920, 35, 100, 40);
        next.setForeground(Color.black);
        next.setBackground(Color.white);
        next.addActionListener(this);
        next.setFont(new Font("serif",Font.PLAIN, 20));
        text.add(next);

        newuser = new JButton("New User");
        newuser.setForeground(Color.black);
        newuser.setBackground(Color.white);
        newuser.setBounds(1050, 35, 100, 40);
        newuser.setFont(new Font("serif",Font.PLAIN, 20));
        newuser.addActionListener(this);
        text.add(newuser);

        setVisible(true);

        }

        public void actionPerformed(ActionEvent ae){

            if (ae.getSource() == newuser){
                new Dashboard();
                setVisible(false);
            }
            if (ae.getSource() == next){
                new Login();
                setVisible(false);
            }

        }

    public static void main(String[] args){

         new PgFinder();
    }
}
