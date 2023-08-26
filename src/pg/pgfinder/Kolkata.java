package pg.pgfinder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Kolkata extends JFrame implements ActionListener{

    JButton back,  contact1, contact2, contact3;

    Kolkata(){
        setLayout(null);
        setTitle("PG in Kolkata");
        setSize(1400, 640);
        setLocation(100,100);

        JMenuBar ab = new JMenuBar();
        ab.setBounds(0, 0, 1550, 80);
        ab.setBackground(Color.darkGray);
        add(ab);

        JMenu mum = new JMenu("PG IN Kolkata");
        mum.setForeground(Color.white);
        mum.setBorder(new EmptyBorder(5, 25, 0, 20));
        mum.setFont(new Font("tahoma",Font.BOLD, 50));
        ab.add(mum);


        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("proimg/kolkata.png"));
        Image img2 = im.getImage().getScaledInstance(356, 220, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);

        image.setBounds(100, 130, 356, 220);
        add(image);

        JLabel text = new JLabel("NAYA GHAR");
        text.setBounds(100, 330, 150, 100 );
        text.setForeground(Color.black);
        text.setFont(new Font("serif",Font.BOLD, 20));
        add(text);

        JLabel addr1 = new JLabel("Nayabad, Calcutta, 700094, Nayabad Kolkata");
        addr1.setBounds(100, 360, 400, 100 );
        addr1.setForeground(Color.gray);
        addr1.setFont(new Font("serif",Font.PLAIN, 20));
        add(addr1);

        JLabel rent1 = new JLabel("₹ 9000 per month onwards");
        rent1.setBounds(100, 390, 400, 100 );
        rent1.setForeground(Color.gray);
        rent1.setFont(new Font("serif",Font.PLAIN, 15));
        add(rent1);

        contact1 = new JButton("Contact");
        contact1.setBounds(100,480,100,40);
        contact1.setBackground(Color.black);
        contact1.setForeground(Color.white);
        contact1.setFont(new Font("tahoma",Font.PLAIN, 18));
        contact1.addActionListener(this);
        add(contact1);


        ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("proimg/kolkata.png"));
        Image img4 = im1.getImage().getScaledInstance(356, 220, Image.SCALE_DEFAULT);
        ImageIcon img5 = new ImageIcon(img4);
        JLabel image1 = new JLabel(img5);

        image1.setBounds(500, 130, 356, 220);
        add(image1);

        JLabel text2 = new JLabel("NAYA GHAR");
        text2.setBounds(500, 330, 150, 100 );
        text2.setForeground(Color.black);
        text2.setFont(new Font("serif",Font.BOLD, 20));
        add(text2);

        JLabel addr2 = new JLabel("Nayabad, Calcutta, 700094, Nayabad Kolkata");
        addr2.setBounds(500, 360, 400, 100 );
        addr2.setForeground(Color.gray);
        addr2.setFont(new Font("serif",Font.PLAIN, 20));
        add(addr2);

        JLabel rent2 = new JLabel("₹ 11000 per month onwards");
        rent2.setBounds(500, 390, 400, 100 );
        rent2.setForeground(Color.gray);
        rent2.setFont(new Font("serif",Font.PLAIN, 15));
        add(rent2);

        contact2 = new JButton("Contact");
        contact2.setBounds(500,480,100,40);
        contact2.setBackground(Color.black);
        contact2.setForeground(Color.white);
        contact2.setFont(new Font("tahoma",Font.PLAIN, 18));
        contact2.addActionListener(this);
        add(contact2);


        ImageIcon im2 = new ImageIcon(ClassLoader.getSystemResource("proimg/kolkata.png"));
        Image img6 = im2.getImage().getScaledInstance(356, 220, Image.SCALE_DEFAULT);
        ImageIcon img7 = new ImageIcon(img6);
        JLabel image2 = new JLabel(img7);

        image2.setBounds(900, 130, 356, 220);
        add(image2);

        JLabel text3 = new JLabel("NAYA GHAR");
        text3.setBounds(900, 330, 150, 100 );
        text3.setForeground(Color.black);
        text3.setFont(new Font("serif",Font.BOLD, 20));
        add(text3);

        JLabel addr3 = new JLabel("Nayabad, Calcutta, 700094, Nayabad Kolkata");
        addr3.setBounds(900, 360, 400, 100 );
        addr3.setForeground(Color.gray);
        addr3.setFont(new Font("serif",Font.PLAIN, 20));
        add(addr3);

        JLabel rent3 = new JLabel("₹ 10000 per month onwards");
        rent3.setBounds(900, 390, 400, 100 );
        rent3.setForeground(Color.gray);
        rent3.setFont(new Font("serif",Font.PLAIN, 15));
        add(rent3);

        contact3 = new JButton("Contact");
        contact3.setBounds(900,480,100,40);
        contact3.setBackground(Color.black);
        contact3.setForeground(Color.white);
        contact3.setFont(new Font("tahoma",Font.PLAIN, 18));
        contact3.addActionListener(this);
        add(contact3);

        back = new JButton("Back");
        back.setBounds(1200,540,100,40);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("tahoma",Font.PLAIN, 18));
        back.addActionListener(this);
        add(back);

        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == contact1){
            new contactForm();
        } else if (ae.getSource()==contact2) {
            new contactForm();

        }else if (ae.getSource()==contact3) {
            new contactForm();

        } else
            setVisible(false);

    }


    public static void main(String[] args){

        new Kolkata();
    }

}
