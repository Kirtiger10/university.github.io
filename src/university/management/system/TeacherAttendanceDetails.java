
package university.management.system;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class TeacherAttendanceDetails extends JFrame implements ActionListener
    {
        JTable j1;
        JButton b1;
        
        String h[]={"Roll Number","Date","First Half","Second Half"};
        String d[][]=new String[15][4];
        int i=0,j=0;
TeacherAttendanceDetails(){
        super("View teacher details");
        setSize(800,300);
        setLocation(450,150);
        
        try{
            String q="select *from attendance_teacher";
            conn c1=new conn();
             ResultSet rs = c1.s.executeQuery("select * from student");
            while(rs.next()){
                d[i][j++]=rs.getString("emp_id");
                d[i][j++]=rs.getString("date");
                d[i][j++]=rs.getString("first");
                d[i][j++]=rs.getString("second");
                i++;
                j=0;
            }
            j1=new JTable(d,h);
        }catch(Exception e){}
        b1=new JButton("print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
        
    }
public void actionPerformed(ActionEvent ae){
    try{
        j1.print();
    }catch(Exception e){}
    }
    public static void main(String[] args){
        new TeacherAttendanceDetails().setVisible(true);
        
    }
}

