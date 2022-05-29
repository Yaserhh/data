import netscape.javascript.JSObject;
import org.json.simple.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class main {
    public static void main(String[] args) {
        form();




    }
    public static void form(){

        JFrame jFrame=new JFrame("data");
        JButton jButton=new JButton("insirt");
        JLabel L1,L2,L3,L4;
        L1=new JLabel("id");
        L2=new JLabel("name");
        L3=new JLabel("family");
        L4=new JLabel("age");


        L1.setBounds(40,30,93,30);
        jFrame.add(L1);
        JTextField jTextField=new JTextField();


        jTextField.setBounds(110,30,93,30);
        jFrame.add(jTextField);
        L2.setBounds(40,80,93,30);

        jFrame.add(L2);
        JTextField jTextField1=new JTextField();
        jTextField1.setBounds(110,80,93,30);
        jFrame.add(jTextField1);
        L3.setBounds(40,130,93,30);
        jFrame.add(L3);
        JTextField jTextField2=new JTextField();
        jTextField2.setBounds(110,130,93,30);
        jFrame.add(jTextField2);
        L4.setBounds(40,180,93,30);
        jFrame.add(L4);
        JTextField jTextField3=new JTextField();
        jTextField3.setBounds(110,180,93,30);
        jFrame.add(jTextField3);
        jButton.setBounds(470,500,93,30);
        jFrame.add(jButton);
        jFrame.setSize(600,600);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {

                String id=jTextField.getText();
                String name=jTextField1.getText();
                String family=jTextField2.getText();
                String age=jTextField3.getText();


             json  json=new json();
             json.JSON(id,name,family,age);
             jTextField.setText("");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");






            }
        });

    }
}
