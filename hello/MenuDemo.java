package hello;

import hello.MenuDemo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Formatter;

import javax.swing.ActionMap;

public class MenuDemo extends Frame {
    Frame fr;

    MenuDemo() {
        fr = new Frame("Menu Demo");
        MenuBar mb = new MenuBar();
        Menu filemenu = new Menu("File");
        Menu EditMenu = new Menu("Edit");
        Menu viewMenu = new Menu("View");
        mb.add(filemenu);
        mb.add(EditMenu);
        mb.add(viewMenu); 
        MenuItem a1 = new MenuItem("New");
        MenuItem a2 = new MenuItem("Open");
        MenuItem a3 = new MenuItem("Save");
        MenuItem b1 = new MenuItem("Copy");
        MenuItem b2 = new MenuItem("Find");
        MenuItem c1 = new MenuItem("Show");
        MenuItem c2 = new MenuItem("Tool");
        Button button = new Button("Click me fast");
        button.setBounds(80, 130, 120, 40);
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        // Panel panel=new Panel();
        // panel.setText("asdf");
        // panel.setBackground(Color.blue);
        // add(panel);
        Label label = new Label("hello friends");
        label.setBounds(100, 100, 150, 30);
        label.setForeground(Color.green);

        // a1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         b s = new b();
        //     }
        // });
        //     a1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         MenuDemo m=new MenuDemo();
        //     }
        // });

        // a2.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         KeysDemo n = new KeysDemo();
        //     }
        // });
        // button.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         label.setText("button click successfully");
        //     }
        // });
        fr.add(label);
        fr.add(button);
        filemenu.add(a1);
        filemenu.add(a2);
        filemenu.add(a3);
        EditMenu.add(b1);
        EditMenu.add(b2);
        viewMenu.add(c1);
        viewMenu.add(c2);
        fr.setMenuBar(mb);
        fr.setSize(300, 300);
        fr.setLayout(null);
        fr.setVisible(true);
        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                 fr.dispose();//if we cut main prgram then cut only main program
                //System.exit(0);//if we cut main program then cut all program
            }
        });

    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}
