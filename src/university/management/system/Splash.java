
package university.management.system;

import java.awt.*;
import javax.swing.*;

public class Splash {
    public static void main(String args[]){
        Frame f = new Frame();
        f.setVisible(true);
        int i,x=1;
        for(i=2;i<=600;i+=4,i+=1)
        {
            f.setLocation((800-((i+x)/2)),500-(i/2)); 
            f.setSize(i+3*x,i+x/2);
            
            try{
                Thread.sleep(1);
                
            }
            catch(Exception e){ }
    }
    }    
    }
class Frame extends JFrame implements Runnable{
    Thread t1;
    Frame(){
        super("university management system");
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/first.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel m1 = new JLabel(i2);
        add(m1);//add into frame
        t1=new Thread(this); //object create of thread
        t1.start(); //start method call run method
    }
    public void run(){
        try{
            Thread.sleep(1000);
            this.setVisible(false); //current frame close
            new Login(); //constructor call
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}