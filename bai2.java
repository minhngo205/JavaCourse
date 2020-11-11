import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class bai2 extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton red, green, blue, exit;
    JPanel pn,pn1;

    public void GUI(){
        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");
        exit = new JButton("Exit");

        pn = new JPanel(new FlowLayout());
        pn1 = new JPanel(new FlowLayout());
        pn1.setAlignmentX(Component.CENTER_ALIGNMENT);


        pn1.add(red);
        pn1.add(green);
        pn1.add(blue);
        pn1.add(exit);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        exit.addActionListener(this);

        pn.add(pn1);
        add(pn);
        setSize(400,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==red) pn.setBackground(Color.red);
        if(e.getSource()==green) pn.setBackground(Color.green);
        if(e.getSource()==blue) pn.setBackground(Color.blue);
        if(e.getSource()==exit) System.exit(0);
    }
    public bai2(String st){
        super(st);
        GUI();
    }
    public static void main(String[] args){
        new bai2("Change backgroud color");
    }
}