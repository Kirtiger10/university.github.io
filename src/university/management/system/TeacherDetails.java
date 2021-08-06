
package university.management.system;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class TeacherDetails extends JFrame implements ActionListener {
        JTable t1;
        JButton b1,b2,b3;
        JLabel l1,l2,l3;
        JTextField t2;
        
        String x[]={"name","fathers_name","age","DOB","address","phone","email","class x(%)","class xii(%)","aadhar","emp_id","course","branch"};
        String y[][]=new String[20][13];
        int i=0,j=0;
TeacherDetails(){
        super(" Teacher details");
        setSize(1200,200);
        setLocation(200,200);
        setLayout(null);
        
        l1=new JLabel("enter emp_id to delete teacher details");
        l1.setBounds(40, 360, 400, 30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        
        t2=new JTextField();
        t2.setBounds(400,360,200,30);
        add(t2);
        
        b1=new JButton("Result");
        b1.setForeground( Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(620,359,100,30);
        add(b1);
        
        l2=new JLabel("add new student");
        l2.setBounds(50, 450, 400, 30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        add(l2);
        
        b2=new JButton("Add students");
        b2.setForeground( Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(620,359,100,30);
        add(b2);
        
        l3=new JLabel("Update student details");
        l3.setBounds(50, 450, 400, 30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        add(l3);
        
        b3=new JButton("Add students");
        b3.setForeground( Color.BLACK);
        b3.setForeground(Color.white);
        b3.setBounds(620,359,100,30);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        try{
            String s1="select * from student";
            conn c1=new conn();
             ResultSet rs = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("fathers_name");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                 y[i][j++]=rs.getString("address");
                  y[i][j++]=rs.getString("phone");
                 y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("class_x");
                 y[i][j++]=rs.getString("class_xii");
                y[i][j++]=rs.getString("aadhar");
                y[i][j++]=rs.getString("emp_id");
                 y[i][j++]=rs.getString("course");
                 y[i][j++]=rs.getString("branch");
                i++;
                j=0;
        }
        t1=new JTable(y,x);
}catch(Exception e){
    e.printStackTrace();
}
        JScrollPane sp=new JScrollPane(t1);
        sp.setBounds(20,20 , 1200, 330);
        add(sp);
        
        getContentPane().setBackground(Color.white);
        b1.addActionListener(this);
        
}
public void actionPerformed(ActionEvent ae){
    

    conn c1=new conn();
   if(ae.getSource()==b1){
    try{
        String a=t2.getText();
        String q="delete from student where rollno = '"+a+"'";
        c1.s.executeUpdate(q);
        this.setVisible(false);
        new TeacherDetails().setVisible(true);
    }catch(Exception e){}
    
    }else if(ae.getSource()==b2){ 
        new AddStudent().f.setVisible(true);
        this.setVisible(false);
    }else if(ae.getSource()==b3){ 
        new UpdateTeacher().f.setVisible(true);
        this.setVisible(false);   
        
    } 
        
    }
    public static void main(String[] args){
        new TeacherDetails().setVisible(true);
}
}
