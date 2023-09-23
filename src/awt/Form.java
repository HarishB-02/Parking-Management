package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import details.Details;
import jdbc.DAO;
import parkingarea.ParkingArea;

public class Form extends Frame{
    public static boolean checkVehicleNumber(String a){
        String regex="^[A-Z]{2}[ -][0-9]{1,2}(?: [A-Z])?(?: [A-Z]*)? [0-9]{4}$";
        boolean b = Pattern.matches(regex, a);
        return b;
    }
    public Form(){
        Font f = new Font("Serif",Font.BOLD,20);

        Label l = new Label("Parking Management System");
        l.setBounds(180, 130, 520, 50);

        Font fH = new Font("Serif",Font.BOLD,40);
        l.setFont(fH);

        Label l1 = new Label("Vehicle Number");
        l1.setBounds(200, 230, 200, 50);
        l1.setFont(f);

        Label l2 = new Label("Vehicle Type");
        l2.setBounds(200, 270, 200, 50);
        l2.setFont(f);

        Label l3 = new Label("Phone Number");
        l3.setBounds(200, 310, 200, 50);
        l3.setFont(f);


        Font f1 = new Font("Serif",Font.PLAIN,20);

        TextField t1 = new TextField();
        t1.setBounds(460, 240, 200, 30);
        t1.setFont(f1);

        TextField t2 = new TextField();
        t2.setBounds(460, 280, 200, 30);
        t2.setFont(f1);

        TextField t3 = new TextField();
        t3.setBounds(460, 320, 200, 30);
        t3.setFont(f1);

        Button b1 = new Button("Submit");
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String vehicleNumber = "";
                String vehicleType = "";

                int flag;

                System.out.println("Button clicked");
                if(checkVehicleNumber(t1.getText())){
                    vehicleNumber = t1.getText();
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid Vehicle Number");
                    flag=0;
                }

                if(t2.getText().equals("two wheeler") || t2.getText().equals("four wheeler")){
                    flag=1;
                    vehicleType = t2.getText();
                }else{
                    flag=0;
                    JOptionPane.showMessageDialog(null,"Invalid Vehicle Type");
                }

                if(flag == 1){
                    Details d = new Details(UUID.randomUUID(), vehicleNumber, vehicleType, LocalDateTime.now(),t3.getText() , ParkingArea.allocateSlot(), 50);
                    new DAO().insertValues(d);
                    dispose();
                    new Bill(d);
                }

                t1.setText("");
				t2.setText("");
				t3.setText("");
            }

        });
        b1.setBounds(330,400,100,40);
        
        Button b2 = new Button("Back");
        b2.setBounds(440,400,100,40);

        b2.addActionListener(e -> {
            dispose();
            new Options();
        });

        add(l);
        add(l1);
        add(l2);
        add(l3);

        add(t1);
        add(t2);
        add(t3);

        add(b1);
        add(b2);


        setTitle("Basic form");
        setLayout(null);
        setSize(850, 650);
        setVisible(true);
        setResizable(true);
    }

}