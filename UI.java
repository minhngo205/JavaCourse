import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UI extends JFrame implements ActionListener{
    private static final long serialVersionUID = -871535337367832130L;
    
    JLabel lb1,lb2,lb3,lb;
    JTextField txta,txtb,txtkq;
    JButton tinh,reset,thoat;
    JPanel pn,pn1,pn2,pn3;
    public void GUI(){
        lb=new JLabel("GIAI PHUONG TRINH BAC NHAT");
        lb1=new JLabel("Nhap a :");
        lb2=new JLabel("Nhap b :");
        lb3=new JLabel("Ket qua:");

        txta=new JTextField();
        txtb=new JTextField();
        txtkq=new JTextField();

        tinh=new JButton("Giai");
        reset=new JButton("Reset");
        thoat=new JButton("Thoat");

        tinh.addActionListener(this);
        reset.addActionListener(this);
        thoat.addActionListener(this);

        pn=new JPanel(new GridLayout(3,1));
        pn1=new JPanel(new FlowLayout());
        pn2=new JPanel(new GridLayout(3,2));
        pn3=new JPanel(new GridLayout(1,3));

        pn1.add(lb);

        pn2.add(lb1);
        pn2.add(txta);
        pn2.add(lb2);
        pn2.add(txtb);
        pn2.add(lb3);
        pn2.add(txtkq);

        pn3.add(tinh);
        pn3.add(reset);
        pn3.add(thoat);

        pn.add(pn1);
        pn.add(pn2);
        pn.add(pn3);
        add(pn);
        setSize(400,300);
        setVisible(true);
    }
    /* public double PtBac1 (int a, int b) {
        if(a==0){
            if (b==0) return;
            else return 0/0;
        }
        else return ((double)(-b)/a);
    } */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource()==tinh){
            int a = Integer.parseInt(txta.getText());
            int b = Integer.parseInt(txtb.getText());
            if(a!=0) txtkq.setText(Double.toString((double)(-b)/a));
            else{
                if (b==0) txtkq.setText("Pt co vo so nghiem");
                else txtkq.setText("Pt vo nghiem");
            } 
            /* double kq = PtBac1(a, b);
            if(kq==0/0) txtkq.setText("Phuong trinh vo nghiem");
            else if(kq==1/0)  txtkq.setText("Phuong vo so nghiem");
            else txtkq.setText(Double.toString(kq)); */
        }
        if(e.getSource()==reset){
            txta.setText("");
            txtb.setText("");
            txtkq.setText("");
        }
        if(e.getSource()==thoat) System.exit(0);
    }
    public UI (String st){
        super(st);
        GUI();
    }

    public static void main(String[] args){
        new UI("Giai phuong trinh bac 1");
        /* Frame f = new Frame();
        f.setTitle("Hello");
        f.setBounds(200, 500, 700, 700);
        f.setLayout(new FlowLayout());
        f.add(new JButton("OK"));
        f.add(new JButton("Cancel"));

        f.add(new JLabel("Label ne"));
        f.add(new JTextField(10));
        f.add(new JTextArea(5,30));

        f.add(new Checkbox("Sport"));
        f.add(new Checkbox("Music"));
        f.add(new Checkbox("Travel"));
        
        CheckboxGroup cg = new CheckboxGroup();
        f.add(new Checkbox("Female",cg,false));
        f.add(new Checkbox("Male",cg,true));
        
        Choice ch = new Choice();
        ch.addItem("Minh");
        ch.addItem("dep");
        ch.addItem("trai");
        f.add(ch);

        List list = new List(3,false);
        list.add("Music");
        list.add("Travel");
        list.add("Game");
        list.add("Minh dep trai");
        f.add(list);

        f.setVisible(true); */
    }

}
