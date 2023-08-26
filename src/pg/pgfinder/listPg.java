package pg.pgfinder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listPg extends JFrame  implements ActionListener{

    JTextField tfname,tfmobile,tfcity,tfaddr,mail;
    JRadioButton jr,jrweek;
    JButton sub,back;


    listPg(){
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setTitle("List PG");

        JLabel lbldtl = new JLabel("Enter Your Details");
        lbldtl.setBounds(60,10,180,30);
        add(lbldtl);
        lbldtl.setFont(new Font("tahoma", Font.BOLD, 17));
        add(lbldtl);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60,80,120,30);
        add(lblname);
        lblname.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(200,80,150,30);
        add(tfname);


        JLabel lblcon = new JLabel("Mobile");
        lblcon.setBounds(60,130,120,30);
        add(lblcon);
        lblcon.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblcon);

        tfmobile = new JTextField();
        tfmobile.setBounds(200,130,150,30);
        add(tfmobile);

        JLabel lblcity = new JLabel("City");
        lblcity.setBounds(60,180,120,30);
        add(lblcity);
        lblcity.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblcity);

        tfcity = new JTextField();
        tfcity.setBounds(200,180,150,30);
        add(tfcity);

        JLabel lbltime = new JLabel("Preferred time to call");
        lbltime.setBounds(60,230,200,30);
        add(lbltime);
        lbltime.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbltime);

        jr = new JRadioButton("10am-6pm");
        jr.setBounds(250,230,120,30);
        jr.setFont(new Font("tahoma", Font.PLAIN, 17));
        jr.setBackground(Color.white);
        add(jr);

        jrweek = new JRadioButton("Weekends");
        jrweek.setBounds(380,230,120,30);
        jrweek.setFont(new Font("tahoma", Font.PLAIN, 17));
        jrweek.setBackground(Color.white);
        add(jrweek);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jr);
        bg.add(jrweek);


        JLabel lbladdr = new JLabel("PG Address");
        lbladdr.setBounds(60,280,120,30);
        add(lbladdr);
        lbladdr.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbladdr);

        tfaddr = new JTextField();
        tfaddr.setBounds(200,280,150,30);
        add(tfaddr);

        JLabel lblmail = new JLabel("Email");
        lblmail.setBounds(60,330,120,30);
        add(lblmail);
        lblmail.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblmail);

        mail = new JTextField();
        mail.setBounds(200,330,150,30);
        add(mail);

        sub = new JButton("SUBMIT");
        sub.setBackground(Color.black);
        sub.setForeground(Color.white);
        sub.setBounds(100,420,120,40);
        sub.addActionListener(this);
        add(sub);

        back = new JButton("BACK");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(270, 420, 120, 40);
        back.addActionListener(this);
        add(back);

        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("proimg/pngwing.com.png"));
        Image img2 = im.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);

        image.setBounds(500,205,300,300);
        add(image);


        setBounds(350,200,850,540);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == back) {
            setVisible(false);
        } else {

            String name = tfname.getText();
            String mobile = tfmobile.getText();
            String city = tfcity.getText();
            String pgaddr = tfaddr.getText();
            String email = mail.getText();
            String PreferredTimeToCall = null;
            if (jr.isSelected()) {
                PreferredTimeToCall = "10am-6pm";
            } else if (jrweek.isSelected()) {
                PreferredTimeToCall = "Weekends";
            }
            try {

                Conn conn = new Conn();

                String query = "insert into listpg values('" + name + "', '" + mobile + "','" + city + "','" + PreferredTimeToCall + "','" + pgaddr + "','" + email + "')";
                conn.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Our executive will call you and your PG is Listed Successfully");
                setVisible(false);
            } catch (Exception ae) {

                ae.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new listPg();
    }


}
