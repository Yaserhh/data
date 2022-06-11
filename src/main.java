import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;


public class main {
    public static void main(String[] args) throws Exception {
     form();


    }
    public static void form()throws Exception{

        JFileChooser jFileChooser=new JFileChooser();


        JFrame jFrame=new JFrame("data");
        JButton jButton=new JButton("insirt");


        JLabel L1,L2,L3,L4;

        L1=new JLabel("cod");
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
        jButton.setBounds(100,500,93,30);
        jFrame.add(jButton);
        jFrame.setSize(300,600);











        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {


                try {


    String id = jTextField.getText();
    String name = jTextField1.getText();
    String family = jTextField2.getText();
    String age = jTextField3.getText();



    json json = new json();

    json.JSON(id, name, family, age);
    jTextField.setText("");
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");

}catch (Exception E){
    JOptionPane.showMessageDialog(jFrame,"please enter the correct information");


}




            }
        });

    }
}
