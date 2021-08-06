
package university.management.system;
import java.awt.*;
import javax.swing.*;

import java.sql.*;
import java.awt.event.*;


public class TeacherAttendance extends JFrame implements ActionListener {
   
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2,fh,sh;
    
    TeacherAttendance(){
      
        setLayout(new GridLayout(4,2,50,50));//null
        c2=new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                c2.add(rs.getString("roll no"));
            }
        }catch(Exception e){}
        
        add(new JLabel("           select emp_id"));
        add(c2);
        
        l1= new JLabel("           First Half");
        fh=new Choice();
        fh.add("present");
        fh.add("absent");
        fh.add("leave");
        
        add(l1);
        add(fh);
        
        l2= new JLabel("           Second Half");
        sh=new Choice();
        sh.add("present");
        sh.add("absent");
        sh.add("leave");
        
        add(l2);
        add(sh);

    b1=new JButton("Submit");
    b1.setForeground(Color.white);
    b1.setBackground(Color.black);   
    
    b2=new JButton("Cancel");
    b2.setForeground(Color.white);
    b2.setBackground(Color.black);       
    
    add(b1);
    add(b2);
   
    b1.addActionListener(this); 
    b2.addActionListener(this); 
    
    getContentPane().setBackground(Color.white);
    
    setVisible(true);
    setSize(400,450);
    setLocation(600,200);
    
    }
    public void actionPerformed(ActionEvent ae){
        
        String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id = c2.getSelectedItem();
        String qry = "insert into attendance_student values("+id+",'"+dt+"','"+f+"','"+s+"')";
    try{
        conn c1 = new conn();
        c1.s.executeUpdate(qry);
        JOptionPane.showMessageDialog(null, "Attendance confirmed");
        this.setVisible(false);
    }catch(Exception ee){
        ee.printStackTrace();
    }
    
 }
 public static void main(String[] args){
     new TeacherAttendance();
 }   
    
}

