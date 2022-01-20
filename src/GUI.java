import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUI extends JFrame implements ActionListener, WindowListener {

    CurrencyConverter c = new CurrencyConverter();

    double input = 0.0;

    private Container contentPane = this.getContentPane();
    private JLabel euroLabel = new JLabel("Euro:"), usdLabel = new JLabel("USD:"), gbpLabel = new JLabel("GBP:"), yuanLabel = new JLabel("Yuan");
    private JTextField euroField = new JTextField(10), usdField = new JTextField(10), gbpField = new JTextField(10), yuanField = new JTextField(10);
    private JButton clearBTN = new JButton("Clear");

    public GUI(){
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(400,400);
        this.setTitle("Currency Converter");
        this.addWindowListener(this);

        //this.setAlwaysOnTop(true);
    }

    public void init(){ // this method adds all the textfields on to the panel using the gridbaglayout
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(1,1,1,1);

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

        euroField.addActionListener(this);
        usdField.addActionListener(this);
        gbpField.addActionListener(this);
        yuanField.addActionListener(this);
    }



    public static void main(String[] args) {
        new GUI().init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == euroField){
            input = Double.parseDouble(euroField.getText()); // parses the string value from the textfield into a double value
            //euro to usd
            c.euroToUSD(input);
            usdField.setText(String.format("%.2f", c.getUSD())); // string.format sets the output to 2 decimal places
            //euro to gbp
            gbpField.setText(String.format("%.2f", c.usdToGBP()));
            // euro to yuan
            yuanField.setText(String.format("%.2f", c.usdToYuan()));

        } else if (e.getSource() == usdField){
            input = Double.parseDouble(usdField.getText());
            c.setUSD(input);
            //usd to euro
            euroField.setText(String.format("%.2f", c.usdToEuro()));
            //usd to gbp
            gbpField.setText(String.format("%.2f", c.usdToGBP()));
            //usd to yuan
            yuanField.setText(String.format("%.2f", c.usdToYuan()));

        } else if (e.getSource() == gbpField){
            input = Double.parseDouble(gbpField.getText());
            c.gbpToUSD(input);
            // gbp to euro
            euroField.setText(String.format("%.2f", c.usdToEuro()));
            // gbp to usd
            usdField.setText(String.format("%.2f", c.getUSD()));
            // gbp to yuan
            yuanField.setText(String.format("%.2f", c.usdToYuan()));

        } else if(e.getSource() == yuanField){
            input = Double.parseDouble(yuanField.getText());
            c.yuanToUSD(input);
            // yuan to euro
            euroField.setText(String.format("%.2f", c.usdToEuro()));
            // yuan to usd
            usdField.setText(String.format("%.2f", c.getUSD()));
            // yuan to gbp
            gbpField.setText(String.format("%.2f", c.usdToGBP()));
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Started");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closed");
        System.exit(0);
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
