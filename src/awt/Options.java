package awt;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Options extends Frame{
    
    public Options(){
        Font f = new Font("Serif",Font.BOLD,20);
        Label l = new Label("Parking Management System");
        l.setBounds(180, 100, 520, 50);

        Font fH = new Font("Serif",Font.BOLD,40);
        l.setFont(fH);

        JRadioButton entry = new JRadioButton("Entry");
        entry.setBounds(280,250,80,50);
        entry.setBackground(getForeground());
        entry.setFont(f);
        
        JRadioButton exit = new JRadioButton("Exit");
		exit.setBounds(515,250,80,50);
        exit.setBackground(getForeground());
        exit.setFont(f);
		

        Button b1 = new Button("OK");
        b1.setBounds(300,360,100,40);

        Button b2 = new Button("Cancel");
        b2.setBounds(450,360,100,40);

        b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String option ="";
                if(entry.isSelected()){
                    option = "entry";
                }
                if(exit.isSelected()){
                    option = "exit";
                }

                if(option.equals("entry")){
                    dispose();
                    new Form();
                }
                else if(option.equals("exit")){
                    dispose();
                    new TokenGetter();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please Select an option");
                }
			}
		});
		
        b2.addActionListener(e -> {
            dispose();
        });
        
        add(l);
        add(entry);
        add(exit);
        add(b1);
        add(b2);
        
        setTitle("Basic form");
        setLayout(null);
        setSize(850, 650);
        setVisible(true);
        setResizable(true);
        
    }
}
