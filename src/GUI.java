import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUI extends JFrame implements ActionListener, WindowListener {

    private Container contentPane = this.getContentPane();
    private JLabel euroLabel = new JLabel("Euro:"), usdLabel = new JLabel("USD:"), gbpLabel = new JLabel("GBP:"), yuanLabel = new JLabel("Yuan");
    private JTextField euroField = new JTextField(10), usdField = new JTextField(10), gbpField = new JTextField(10), yuanField = new JTextField(10);


    public GUI(){
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(400,400);
        this.setTitle("Currency Converter");
        //this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(this);
    }

    public void init(){
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0,1,0,1);

        gbc.gridx = 1;
        gbc.gridy = 1;
        contentPane.add(euroLabel, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        contentPane.add(euroField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        contentPane.add(usdLabel, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        contentPane.add(usdField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        contentPane.add(gbpLabel, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        contentPane.add(gbpField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        contentPane.add(yuanLabel, gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        contentPane.add(yuanField, gbc);
    }

    public static void main(String[] args) {
        new GUI().init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
