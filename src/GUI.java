import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    public GUI(){
        setVisible(true);
        setSize(400,400);
        setTitle("Currency Converter");
    }

    public static void main(String[] args) {
        GUI g = new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
