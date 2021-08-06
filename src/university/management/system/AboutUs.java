
package university.management.system;
import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{
    private JPanel contentPane;
    
    public static void main(String[] args){
        new AboutUs().setVisible(true);
    }
     public AboutUs(){
         super("About Us - IET LUCKNOW");
         setBackground(Color.lightGray);
         setBounds(500,250,700,500);
         
         contentPane = new JPanel();
         setContentPane(contentPane);
         contentPane.setLayout(null);
         
         

         JLabel l1=new JLabel();
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(250,100, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        l1=new JLabel(i3);
        l1.setBounds(400,100,250,100);
        contentPane.add(l1);
        
        JLabel l3=new JLabel("University");
        l3.setForeground(Color.blue);
        l3.setBounds(140,40,200,55);
       l3.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,34));
      contentPane.add(l3);
      
       JLabel l4=new JLabel("Managemant System");
        l4.setForeground( Color.blue);
        l4.setBounds(70,90,405,40);
       l4.setFont(new Font("serif",Font.ITALIC | Font.BOLD,34));
      contentPane.add(l4);
      
       JLabel l5=new JLabel("v5.1");
        l5.setForeground( Color.gray);
        l5.setBounds(185,149,100,21);
       l5.setFont(new Font("serif",Font.ITALIC,24));
      contentPane.add(l5);
      
       JLabel l6=new JLabel("Developed By : Kirti Singh");
        
        l6.setBounds(70,240,600,35);
       l6.setFont(new Font("serif",Font.ITALIC,34));
      contentPane.add(l6);
      
       JLabel l7=new JLabel(" Course: MCA");
        l7.setForeground(new Color(0,250,154));
        l7.setBounds(70,300,600,30);
       l7.setFont(new Font("serif",Font.ITALIC,28));
      contentPane.add(l7);
      
      contentPane.setBackground(Color.white);
      
     }       
    
}
