package pg.pgfinder;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
//    private String selectedCity;
    Dashboard() {
        setLayout(null);
        setBounds(100, 50, 1350, 750);
//        getContentPane().setBackground(Color.DARK_GRAY);


        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("proimg/mount2.jpg"));
        Image img2 = im.getImage().getScaledInstance(1400,800,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);

        image.setBounds(0,0,1400,800);
        add(image);


        JLabel title = new JLabel("Welcome to Naya Ghar");
        title.setBounds(250, 70, 1200, 80);
        title.setForeground(Color.black);
        title.setFont(new Font("Tahoma", Font.BOLD, 70));
        image.add(title);

        JMenuBar ab = new JMenuBar();
        ab.setBounds(0, 0, 1550, 30);
        image.add(ab);
        JMenu home = new JMenu("Home");
        home.setBorder(new EmptyBorder(0, 10, 0, 10));
        ab.add(home);

        JMenu pgowners = new JMenu("For PG Owners");
        pgowners.setBorder(new EmptyBorder(0, 10, 0, 10));
        ab.add(pgowners);

        JMenuItem list = new JMenuItem("LIST PG");
        list.addActionListener(this);
        pgowners.add(list);

        JMenuItem rvlist = new JMenuItem("Remove your PG");
        rvlist.addActionListener(this);
        pgowners.add(rvlist);

        JMenu city = new JMenu("Select City");
        city.setBorder(new EmptyBorder(0, 10, 0, 10));
        ab.add(city);

        JMenuItem mum = new JMenuItem("Mumbai");
        mum.addActionListener(this);
        JMenuItem hyd = new JMenuItem("Hyderabad");
        hyd.addActionListener(this);
        JMenuItem klk = new JMenuItem("Kolkata");
        klk.addActionListener(this);
        JMenuItem ga = new JMenuItem("Delhi");
        ga.addActionListener(this);


        city.add(mum);
        city.add(hyd);
        city.add(klk);
        city.add(ga);

        JMenu cnt = new JMenu("Contact us");
        ab.add(cnt);
        JMenuItem contactItem = new JMenuItem("Contact Us");
        contactItem.addActionListener(this);
        cnt.add(contactItem);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("LIST PG")) {
            new listPg();

        }
        if (ae.getActionCommand().equals("Remove your PG")) {
            new removePg();

        }
        if (ae.getActionCommand().equals("Mumbai")) {

                new Mumbai();

        }
        if (ae.getActionCommand().equals("Hyderabad")) {
//            selectedCity = "Hyderabad";
            new Hyderabad();

        }
        if (ae.getActionCommand().equals("Kolkata")) {
//            selectedCity = "Kolkata";
            new Kolkata();

        }
        if (ae.getActionCommand().equals("Delhi")) {

            new Delhi();

        }
        if (ae.getActionCommand().equals("Contact Us")) {
            new contactUs();
        }

    }

    public static void main(String[] args) {
        new Dashboard();
    }
}

