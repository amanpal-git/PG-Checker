package pg.pgfinder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class removePg extends JFrame implements ActionListener {

    JTextField tfname, tfmobile, tfcity, tfaddr;
    JButton rem,back;


    removePg() {
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setTitle("Remove PG");

        JLabel lbldtl = new JLabel("Enter Your Details");
        lbldtl.setBounds(60, 10, 180, 30);
        add(lbldtl);
        lbldtl.setFont(new Font("tahoma", Font.BOLD, 17));
        add(lbldtl);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60, 80, 120, 30);
        add(lblname);
        lblname.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(200, 80, 150, 30);
        add(tfname);


        JLabel lblcon = new JLabel("Mobile");
        lblcon.setBounds(60, 150, 120, 30);
        add(lblcon);
        lblcon.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblcon);

        tfmobile = new JTextField();
        tfmobile.setBounds(200, 150, 150, 30);
        add(tfmobile);

        JLabel lblcity = new JLabel("City");
        lblcity.setBounds(60, 230, 120, 30);
        add(lblcity);
        lblcity.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblcity);

        tfcity = new JTextField();
        tfcity.setBounds(200, 230, 150, 30);
        add(tfcity);


        JLabel lbladdr = new JLabel("PG Address");
        lbladdr.setBounds(60, 310, 120, 30);
        add(lbladdr);
        lbladdr.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbladdr);

        tfaddr = new JTextField();
        tfaddr.setBounds(200, 310, 150, 30);
        add(tfaddr);


        rem = new JButton("REMOVE PG");
        rem.setBackground(Color.black);
        rem.setForeground(Color.white);
        rem.setBounds(100, 420, 120, 40);
        rem.addActionListener(this);
        add(rem);

        back = new JButton("BACK");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(270, 420, 120, 40);
        back.addActionListener(this);
        add(back);

        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("proimg/thank-you.png"));
        Image img2 = im.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);

        image.setBounds(500, 100, 250, 250);
        add(image);


        setBounds(350, 200, 850, 540);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == back){
            setVisible(false);
        }
else {
            String name = tfname.getText();
            String mobile = tfmobile.getText();

            try {

                Conn conn = new Conn();

                String query = "DELETE FROM listpg WHERE name = '" + name + "' AND mobile = '" + mobile + "'";


                conn.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Your PG has been removed Successfully");
                setVisible(false);

            } catch (SQLException ae) {
                ae.printStackTrace();
            }
        }

    }
    public static void main (String[] args){
        new removePg();
    }
}
