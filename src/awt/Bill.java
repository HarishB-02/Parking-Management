package awt;

import java.awt.*;

import details.Details;

public class Bill extends Frame{

    public Bill(Details details){
        Font f = new Font("Serif",Font.BOLD,20);
        Label l = new Label("Parking Management System");
        l.setBounds(180, 100, 520, 50);

        Font fH = new Font("Serif",Font.BOLD,40);
        l.setFont(fH);

        Label l1 = new Label("Token Number:");
        l1.setBounds(450, 180, 150, 50);
        l1.setFont(f);

        Label l2 = new Label(details.getTokenNumber());
        l2.setBounds(600, 180, 100, 50);
        l2.setFont(fH);

        Label l3 = new Label("Vehicle Number");
        l3.setBounds(200, 260, 200, 50);
        l3.setFont(f);

        Label l4 = new Label("Vehicle Type");
        l4.setBounds(200, 300, 200, 50);
        l4.setFont(f);

        Label l5 = new Label("Entry Time");
        l5.setBounds(200, 340, 200, 50);
        l5.setFont(f);

        Label l6 = new Label("Phone Number");
        l6.setBounds(200, 380, 200, 50);
        l6.setFont(f);

        Label l7 = new Label("Price");
        l7.setBounds(200, 420, 200, 50);
        l7.setFont(f);

        Label l8 = new Label(details.getVehicleNumber());
        l8.setBounds(400, 260, 150, 50);
        l8.setFont(f);

        Label l9 = new Label(details.getVehicleType());
        l9.setBounds(400, 300, 150, 50);
        l9.setFont(f);

        Label l10 = new Label(details.getEntryTime().toString());
        l10.setBounds(400, 340, 350, 50);
        l10.setFont(f);

        Label l11 = new Label(details.getPhoneNumber());
        l11.setBounds(400, 380, 150, 50);
        l11.setFont(f);

        Label l12 = new Label(Float.toString(details.getPrice()));
        l12.setBounds(400, 420, 150, 50);
        l12.setFont(f);

        Button b = new Button("OK");
        b.setBounds(350, 500, 100, 50);

        b.addActionListener(e -> {
            dispose();
            new Options();
        });
        
        add(l);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(b);

        setTitle("Basic form");
        setLayout(null);
        setSize(850, 650);
        setVisible(true);
        setResizable(true);
        
    }
}

