
package university.management.system;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;

public class StudentFeeForm extends JFrame implements ActionListener{
private JPanel contentPane;
private JTextField t1,t2,t3;
private JComboBox comboBox,comboBox_2,comboBox_3;
JButton b1,b2;
Choice c1;

public static void main(String [] args){
    new StudentFeeForm().setVisible(true);
}
   public StudentFeeForm(){
       super("student fee form");
       setBounds(700,200,550,450);
       contentPane=new JPanel();
       contentPane.setBorder(new EmptyBorder(5,5,5,5));
       setContentPane(contentPane);
       contentPane.setLayout(null);
       
       c1=new Choice();
       c1.setFont(new Font("Senserif",Font.BOLD,14));
       c1.setForeground(new Color(47,79,79));
       
       try{
           conn c =new conn();
           ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                c1.add(rs.getString("rollno"));
            }
       }catch(Exception e){}
       
       JLabel l1=new JLabel("select rollno");
        l1.setForeground(new Color(25,25,112));
        l1.setFont(new Font("tahoma",Font.BOLD,14));
        l1.setBackground(Color.black);
        l1.setBounds(64,63,102,22);
        contentPane.add(l1);
        
        JLabel l2=new JLabel("name");
        l2.setForeground(new Color(25,25,112));
        l2.setFont(new Font("tahoma",Font.BOLD,14));
        l2.setBackground(Color.black);
        l2.setBounds(64,97,102,22);
        contentPane.add(l2);
        
        JLabel l3=new JLabel("father's name");
        l3.setForeground(new Color(25,25,112));
        l3.setFont(new Font("tahoma",Font.BOLD,14));
        l3.setBackground(Color.black);
        l3.setBounds(64,130,102,22);
        contentPane.add(l3);
       
        JLabel l4=new JLabel("Branch");
        l4.setForeground(new Color(25,25,112));
        l4.setFont(new Font("tahoma",Font.BOLD,14));
        l4.setBackground(Color.black);
        l4.setBounds(64,209,102,22);
        contentPane.add(l4);
        
        JLabel l5=new JLabel("semester");
        l5.setForeground(new Color(25,25,112));
        l5.setFont(new Font("tahoma",Font.BOLD,14));
        l5.setBackground(Color.black);
        l5.setBounds(64,242,102,22);
        contentPane.add(l5);
        
        JLabel l6=new JLabel("Total Payable");
        l6.setForeground(new Color(25,25,112));
        l6.setFont(new Font("tahoma",Font.BOLD,14));
        l6.setBackground(Color.black);
        l6.setBounds(64,275,102,22);
        contentPane.add(l6);
       
       c1.setBounds(174,66,156,20);
       contentPane.add(c1);
       
       t2=new JTextField();
        t2.setForeground(new Color(47,79,79));
        t2.setFont(new Font("tahoma",Font.BOLD,14));
        t2.setColumns(10);
        t2.setBounds(174,100,156,22);
        contentPane.add(t2);
        
        t3=new JTextField();
        t3.setForeground(new Color(47,79,79));
        t3.setFont(new Font("tahoma",Font.BOLD,14));
        t3.setColumns(10);
        t3.setBounds(174,133,156,20);
        contentPane.add(t3);
        
        try{
             
            conn c=new conn();
             ResultSet rs = c.s.executeQuery("select * from student where rollno = '"+c1.getSelectedItem()+"'");
            while(rs.next()){
               t2.setText(rs.getString("name"));
               t3.setText(rs.getString("father's name"));
            }
            
        }catch(Exception e){}
        
        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"mechanical","computer science","IT","automobile","Electonics","Electrical","MCA","Other"}));
        comboBox.setForeground(new Color(47,79,79));
        comboBox.setFont(new Font("tahoma",Font.BOLD,14));
        comboBox.setBounds(176,211,154,20);
        contentPane.add(comboBox);
        
        comboBox_2 = new JComboBox();
        comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1st","2nd","3rd","4th","5th","6th","7th","8th"}));
        comboBox_2.setForeground(new Color(47,79,79));
        comboBox_2.setFont(new Font("tahoma",Font.BOLD,14));
        comboBox_2.setBounds(176,244,154,20);
        contentPane.add(comboBox_2);
        
        t1=new JTextField();
        t1.setForeground(new Color(47,79,79));
        t1.setFont(new Font("tahoma",Font.BOLD,14));
        t1.setColumns(10);
        t1.setBounds(174,275,154,20);
        add(t1);
        
        b1=new JButton("pay");
        b1.addActionListener(this);
        b1.setFont(new Font("tahoma",Font.BOLD,14));
        b1.setBackground( Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(64,321,111,33);
        add(b1);
        
        b2=new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("tahoma",Font.BOLD,14));
        b2.setBackground( Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(198,321,111,33);
        add(b2);
        
        JLabel l7=new JLabel("Course");
        l7.setForeground(new Color(25,25,112));
        l7.setFont(new Font("tahoma",Font.BOLD,14));
        l7.setBackground(Color.black);
        l7.setBounds(64,173,102,22);
        contentPane.add(l7);
        
        comboBox_3 = new JComboBox();
        comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"B.tech","m.Tech","MBA","MCA","BCA","B.Sc"}));
        comboBox_3.setForeground(new Color(47,79,79));
        comboBox_3.setFont(new Font("tahoma",Font.BOLD,14));
        comboBox_3.setBounds(176,176,154,20);
        contentPane.add(comboBox_3);
        
        JPanel panel=new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(102,205,170),2,true),"Fee-Form",
          TitledBorder.LEADING,TitledBorder.TOP,null,new Color(30,144,255)));
        panel.setBackground(Color.white);
        panel.setBounds(20,38,459,350);
        
        contentPane.setBackground(Color.white);
        panel.setBackground(Color.white);
        
        contentPane.add(panel);
   }
 public void actionPerformed(ActionEvent ae){
    try{
        if(ae.getSource()==b1){
            try{
                conn con=new conn();
                String sql="insert into fee(rollno,name,fathers_name,course,branch,semester,fee_paid) values(2,2,2,2,2,2,2)";
            PreparedStatement st =con.c.prepareStatement(sql);
            st.setString(1, c1.getSelectedItem());
            st.setString(2, t2.getText());
            st.setString(3, t3.getText());
            st.setString(4, (String) comboBox_3.getSelectedItem());
            
            int i = st.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "successfully paid");
                this.setVisible(false);
            }
            else
              JOptionPane.showMessageDialog(null,"error");  
            }catch(Exception e){
             e.printStackTrace();
            }
        }
          if(ae.getSource()==b2){
             this.setVisible(false); 
            }
        }catch(Exception e){
    }
        
 }
}
        
        
        
        
        
        
       
   

