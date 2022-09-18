package hello;
import java.awt.*;
class panel2 extends Frame {
    panel2()
    {
    Panel p1=new Panel();
    Label lb=new Label("hello");
    p1.add(lb);
    Button bt= new Button("buton1");
    p1.add(bt);
    p1.setBackground(Color.red);
    
    add(p1);
    }
}
class panel
{
    public static void main(String[] args) {
        panel2 f=new panel2();
        f.setSize(300, 250);
        f.setVisible(true);
    }
}
