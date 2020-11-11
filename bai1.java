import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class bai1 extends JFrame implements ActionListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JLabel lb1,lb2,lb3,lb;
    JTextField txta,txtb,txtkq;
    JButton cong,tru,nhan,chia,reset,thoat;
    JPanel pn,pn1,pn2,pn3,pn4;

    public void GUI(){
        lb = new JLabel("Minh hoạ phép toán");
        lb1 = new JLabel("Nhập a  :");
        lb2 = new JLabel("Nhập b  :");
        lb3 = new JLabel("Kết quả :");

        txta = new JTextField();
        txtb = new JTextField();
        txtkq = new JTextField();

        cong = new JButton("+");
        tru = new JButton("-");
        nhan = new JButton("*");
        chia = new JButton("/");
        reset = new JButton("Reset");
        thoat = new JButton("Thoát");

        cong.addActionListener(this);
        tru.addActionListener(this);
        nhan.addActionListener(this);
        chia.addActionListener(this);
        reset.addActionListener(this);
        thoat.addActionListener(this);

        pn=new JPanel(new GridLayout(4,1));
        pn1=new JPanel(new FlowLayout());
        pn2=new JPanel(new GridLayout(3,2));
        pn3=new JPanel(new GridLayout(1,4));
        pn4=new JPanel(new GridLayout(1,2));

        pn1.add(lb);

        pn2.add(lb1);
        pn2.add(txta);
        pn2.add(lb2);
        pn2.add(txtb);
        pn2.add(lb3);
        pn2.add(txtkq);

        pn3.add(cong);
        pn3.add(tru);
        pn3.add(nhan);
        pn3.add(chia);

        pn4.add(reset);
        pn4.add(thoat);

        pn.add(pn1);
        pn.add(pn2);
        pn.add(pn3);
        pn.add(pn4);
        add(pn);
        setSize(400,300);
        setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        double a=0,b=0;
        try{
        if(!txta.getText().isEmpty()){a = Double.parseDouble(txta.getText());}
        if(!txtb.getText().isEmpty()){b = Double.parseDouble(txtb.getText());}
        if(e.getSource()==cong) txtkq.setText(Double.toString(a+b));
        if(e.getSource()==tru) txtkq.setText(Double.toString(a-b));
        if(e.getSource()==nhan) txtkq.setText(Double.toString(a*b));
        if(e.getSource()==chia) txtkq.setText(Double.toString((double)a/b));
        } catch(Exception ex){}
        if(e.getSource()==reset){
            txta.setText("");
            txtb.setText("");
            txtkq.setText("");
        }
        if(e.getSource()==thoat) System.exit(0);
    }
    public bai1(String st){
        super(st);
        GUI();
    }

    public static void main(String[] args){
        new bai1("Minh hoạ phép toán");
    }
}
