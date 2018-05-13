
package fülespanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class Mentés extends JDialog implements ActionListener{
    private JButton btOK=new JButton("OK");
    
    public Mentés(JFrame tulajdonos, boolean modális){
        super(tulajdonos, "Mentés", modális);
        Rectangle szülő=getParent().getBounds();
        setBounds(szülő.x+szülő.width/2-100, szülő.y, 200, 100);
        setResizable(false);
        setLayout(new GridLayout(2,1));
        JPanel pn1=new JPanel();
        pn1.setBackground(Color.green);
        JPanel pn2=new JPanel();
        pn2.setBackground(Color.green);
        JLabel lb1=new JLabel("<html><center>OK!<br>Sikeres Mentés 6</center><html>");
        lb1.setForeground(Color.black);
        pn1.add(lb1);
        
        add(pn1);
        pn2.add(btOK);
        add(pn2);
        
        btOK.addActionListener(this);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        dispose();
    }
    
}
