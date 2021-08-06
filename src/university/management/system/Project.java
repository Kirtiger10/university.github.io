
package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        super("university management system");
        
        setSize(1920,1030);
        
         ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/third.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        
        JLabel l1 = new JLabel(icc3);
        add(l1);
        
        JMenuBar mb = new JMenuBar();
        
        
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Faculty");
        JMenuItem m2 = new JMenuItem("New Admission Item");
        master.setForeground(Color.BLUE);
        
        m1.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('A');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
          m1.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('B');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        
         JMenu user = new JMenu("Details");
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("Teacher Details");
        user.setForeground(Color.RED);
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon4.jpg"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('C');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        u1.addActionListener(this);
        
          u2.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/first.jpg"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('D');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);
        
        u2.addActionListener(this);
        
        
         JMenu attendance = new JMenu("Attendance");
        JMenuItem a1 = new JMenuItem("Student Attendance");
        JMenuItem a2 = new JMenuItem("Teacher Attendance");
        attendance.setForeground(Color.RED);
        
        a1.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon23 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon14.jpg"));
        Image image24 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        a1.setIcon(new ImageIcon(image24));
        a1.setMnemonic('M');
        a1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        a1.setBackground(Color.WHITE);
        attendance.add(a1);
        
          a2.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon25 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon15.png"));
        Image image26 = icon25.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        a2.setIcon(new ImageIcon(image26));
        a2.setMnemonic('N');
        a2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        a2.setBackground(Color.WHITE);
        attendance.add(a2);
        
        a2.addActionListener(this);
        
        
        
        JMenu attendance_detail = new JMenu("Attendance Details");
        JMenuItem b1 = new JMenuItem("Student Attendance Details");
        JMenuItem b2 = new JMenuItem("Teacher Attendance Details");
        attendance_detail.setForeground(Color.RED);
        
        b1.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon27 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon15.png"));
        Image image28 = icon27.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(image28));
        b1.setMnemonic('O');
        b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        b1.setBackground(Color.WHITE);
        b1.addActionListener(this);
        
        b2.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon29 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon15.png"));
        Image image30 = icon29.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        b2.setIcon(new ImageIcon(image30));
        b2.setMnemonic('P');
        b2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        b2.setBackground(Color.WHITE);
        
        b2.addActionListener(this);
        
        
         JMenu exam = new JMenu("Examination");
        JMenuItem c1 = new JMenuItem("Student Details");
        JMenuItem c2 = new JMenuItem("Teacher Details");
        exam.setForeground(Color.RED);
        
        c1.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon16.png"));
        Image image31 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        c1.setIcon(new ImageIcon(image4));
        c1.setMnemonic('Q');
        c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        c1.setBackground(Color.WHITE);
        c1.addActionListener(this);
        
          c2.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon17.png"));
        Image image33 = icon32.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        c2.setIcon(new ImageIcon(image33));
        c2.setMnemonic('R');
        c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        c2.setBackground(Color.WHITE);
        
        c2.addActionListener(this);
        
        
         JMenu report = new JMenu("update Details");
        JMenuItem r1 = new JMenuItem("Student Details");
        JMenuItem r2 = new JMenuItem("Teacher Details");
        report.setForeground(Color.RED);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon4.jpg"));
        Image image6 = icon6.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image6));
        r1.setMnemonic('E');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        r1.addActionListener(this);
        
          r2.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/first.jpg"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        r2.setIcon(new ImageIcon(image7));
        r2.setMnemonic('F');
        r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        r2.setBackground(Color.WHITE);
        
        r2.addActionListener(this);
        
        
        JMenu fee = new JMenu("fee Details");
        JMenuItem s1 = new JMenuItem("Fee Structure");
        JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setForeground(Color.RED);
        
        s1.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon4.jpg"));
        Image imagee = iconn.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        s1.setIcon(new ImageIcon(imagee));
        s1.setMnemonic('G');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        s1.setBackground(Color.BLUE);
        s1.addActionListener(this);
        
          s2.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon53 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/first.jpg"));
        Image image52 = icon53.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        s2.setIcon(new ImageIcon(image52));
        s2.setMnemonic('H');
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        s2.setBackground(Color.blue);
        
        s2.addActionListener(this);
        
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("calculator");
         JMenuItem ut3 = new JMenuItem("web browser");
        utility.setForeground(Color.RED);
        
        ut1.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon18 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon4.jpg"));
        Image image19 = icon18.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image19));
        ut1.setMnemonic('I');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);
        ut1.addActionListener(this);
        
          ut2.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon20 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/first.jpg"));
        Image image21 = icon20.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image21));
        ut2.setMnemonic('D');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);
        
        ut3.addActionListener(this);
        
         ut3.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/first.jpg"));
        Image image10 = icon10.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('K');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);
        
        ut3.addActionListener(this);
        
        
        JMenu about = new JMenu("About");
        JMenuItem ub1 = new JMenuItem("About Us");
       
        about.setForeground(Color.RED);
        
        ub1.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icone = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon4.jpg"));
        Image image32 = icone.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ub1.setIcon(new ImageIcon(image32));
        ub1.setMnemonic('L');
        ub1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        ub1.setBackground(Color.WHITE);
        ub1.addActionListener(this);
        
         
        
        
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
       
        exit.setForeground(Color.RED);
        
        ex.setFont(new Font("monospaced",Font.BOLD,16));
         ImageIcon icon44 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icon/icon4.jpg"));
        Image image45 = icon44.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image45));
        ex.setMnemonic('C');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        
        master.add(m1);
        master.add(m2);
        
        user.add(u1);
        user.add(u2);
        
        report.add(r1);
        report.add(r2);
        
        fee.add(s1);
        fee.add(s2);
        
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        
        exit.add(ex);
        
        mb.add(master);
        mb.add(user);
        mb.add(attendance);
        mb.add(attendance_detail);
        mb.add(exam);
        mb.add(report);
        mb.add(fee);
        mb.add(utility);
        mb.add(about);
        mb.add(exit);
        
        setJMenuBar(mb);
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
        
        }
         public void actionPerformed(ActionEvent ae) {
             String msg = ae.getActionCommand();
             if(msg.equals("New Student Admission")){
                 new AddStudent().f.setVisible(true);
                 
          }else if(msg.equals("New Faculty")){
                 new AddTeacher().f.setVisible(true);
                 
         }else if(msg.equals("Student Details")){
                 new StudentDetails().setVisible(true);
                 
         } else  if(msg.equals("Teacher Details")){
                 new TeacherDetails().setVisible(true);
                 
         }else if(msg.equals("Update Students")){
                 new UpdateStudent().f.setVisible(true);
                 
         }else if(msg.equals("Update Teacher")){
                 new UpdateTeacher().f.setVisible(true);
                 
         }else if(msg.equals("Fee Structure")){
                 new FeeStructure().setVisible(true);
                 
         }else if(msg.equals("Student Fee Form")){
                 new StudentFeeForm().setVisible(true);
         }else if(msg.equals("Notepad")){
             try{
                Runtime.getRuntime().exec("notepad.exe");
             }catch(Exception e){}
          }else if(msg.equals("Calculator")){
             try{
                Runtime.getRuntime().exec("calc.exe");
             }catch(Exception e){}
           }else if(msg.equals("Web Browser")){
             try{
                Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application");
             }catch(Exception e){}
          }else if(msg.equals("Exit")){
              System.exit(0);
          }else if(msg.equals("About Us")){
                 new AboutUs().setVisible(true);
          }else if(msg.equals("Student Attendance")){
                 new StudentAttendance().setVisible(true);
          }else if(msg.equals("Teacher Attendance")){
                 new TeacherAttendance().setVisible(true);
          }else if(msg.equals("Student Attendance Details")){
                 new StudentAttendanceDetails().setVisible(true);
          }else if(msg.equals("Teacher Attendance Details")){
                 new TeacherAttendanceDetails().setVisible(true);
          }else if(msg.equals("Examination Details")){
                 new ExaminationDetails().setVisible(true);
          }else if(msg.equals("Enter Marks")){
                 new EnterMarks().setVisible(true);
          }
         }
         public static void main(String[] args){
                 new Project().setVisible(true);
         
         }          
    
}
