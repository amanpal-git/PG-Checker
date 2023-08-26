package pg.pgfinder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.*;

public class adminDashboard extends JFrame  implements ActionListener {

    JTable table;
    JLabel slogan,name,phn,AdhaarCard,Occupation,anywords,contPeople;
    JButton back;


    adminDashboard() {
        setLayout(null);
        setBounds(350, 200, 800, 570);
        getContentPane().setBackground(Color.WHITE);

        slogan = new JLabel("We'll get higher with SUPPORT.");
        slogan.setBounds(150,0,500,100);
        slogan.setFont(new Font("tahoma", Font.BOLD, 30));
        add(slogan);

        name = new JLabel("Name");
        name.setBounds(20,250,200,100);
        name.setFont(new Font("tahoma", Font.BOLD, 14));
        add(name);

        phn = new JLabel("Phone");
        phn.setBounds(180,250,200,100);
        phn.setFont(new Font("tahoma", Font.BOLD, 14));
        add(phn);

        AdhaarCard = new JLabel("Adhaar Card");
        AdhaarCard.setBounds(340,250,200,100);
        AdhaarCard.setFont(new Font("tahoma", Font.BOLD, 14));
        add(AdhaarCard);

        Occupation = new JLabel("Occupation");
        Occupation.setBounds(495,250,200,100);
        Occupation.setFont(new Font("tahoma", Font.BOLD, 14));
        add(Occupation);

        anywords = new JLabel("Thoughts");
        anywords.setBounds(658,250,200,100);
        anywords.setFont(new Font("tahoma", Font.BOLD, 14));
        add(anywords);

        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("proimg/4207.jpg"));
        Image img2 = im.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);

        image.setBounds(230,75,300,200);
        add(image);

        contPeople = new JLabel("People who Contacted");
        contPeople.setBounds(18,210,260,100);
        contPeople.setFont(new Font("tahoma", Font.BOLD, 17));
        add(contPeople);

        table = new JTable();
        table.setBounds(20,310,800,400);
//        table.setBackground(Color.black);
        add(table);

        back = new JButton("Close");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(680, 40, 80, 30);
        back.addActionListener(this);
        add(back);



        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from contact");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception e){
            e.printStackTrace();
        }

        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == back) {
            setVisible(false);
        }
    }


    public static void main(String[] args) {

        new adminDashboard();
    }

}


