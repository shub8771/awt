
package hello;
import java.awt.*; 
import java.awt.event.*;

import javax.lang.model.util.ElementScanner14;
public class KeysDemo  implements KeyListener{
    Label lbl;
    Frame frame=new Frame();
    public KeysDemo()
    {
        frame.addKeyListener(this);
        
        frame.requestFocus();
        lbl=new Label();
        lbl.setBounds(100, 100, 200, 40);
        lbl.setFont(new Font("Calibri",Font.BOLD,16));
        frame.add(lbl);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar()=='M'||e.getKeyChar()=='m')
        lbl.setText("Good Morning");
        else if (e.getKeyChar() == 'A' || e.getKeyChar() == 'a')
            lbl.setText("Good Afternoon");
            else if (e.getKeyChar() == 'E' || e.getKeyChar() == 'e')
                lbl.setText("Good Evening");
            else if (e.getKeyChar() == 'N' || e.getKeyChar() == 'n')
                lbl.setText("Good Night");
    }
     
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    
    // public static void main(String[] args) {
    //     new KeysDemo();
    // }
    
    
}