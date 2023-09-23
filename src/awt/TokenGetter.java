package awt;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import jdbc.DAO;

import java.awt.event.ActionEvent;


public class TokenGetter extends Frame{
    public TokenGetter(){
        Font f = new Font("Serif",Font.BOLD,20);
        Label l = new Label("Parking Management System");
        l.setBounds(180, 100, 520, 50);

        Font fH = new Font("Serif",Font.BOLD,40);
        l.setFont(fH);

        Label l1 = new Label("Token Number:");
        l1.setBounds(250, 280, 150, 50);
        l1.setFont(f);

        TextField t1 = new TextField();
        t1.setBounds(420, 290, 200, 30);
        t1.setFont(f);
        
        Button b1 = new Button("Ok");
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String tokenNumber = t1.getText();
                if(!new DAO().fetchTable(tokenNumber)){
                    JOptionPane.showMessageDialog(null,"Invalid Token Number");
                }else{
                    JOptionPane.showMessageDialog(null,"Thank You...Visit again!!!");
                    dispose();
                    new Options();
                }
            }
            
        });
        b1.setBounds(380,360,100,40);
        
        add(l);
        add(l1);
        add(t1);
        add(b1);
        
        setTitle("Basic form");
        setLayout(null);
        setSize(850, 650);
        setVisible(true);
        setResizable(true);
    }
}
