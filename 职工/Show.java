package 职工;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Show extends JDialog implements ActionListener {
    Hashtable 员工表= null;
    JTextArea 显示=null;
    FileInputStream inOne=null;
    ObjectInputStream inTwo=null;
    JTextField 工资;

    File file=null;

    public Show(File file){
        super(new JFrame(),"员工列表");
        this.file=file;
        显示=new JTextArea(16,30);
        工资=new JTextField(10);

        工资.setEditable(false);
        try{
            inTwo=new ObjectInputStream(new FileInputStream(file));
            员工表=(Hashtable)inTwo.readObject();
            inTwo.close();
        }

        catch(Exception ee){
        }
        if(员工表.isEmpty())
        {显示.append("目前还没有员工的信息记录！\n");}
        else{
            显示.setText("工号 姓名 性别 \n");
            for(Enumeration enm=员工表.elements();enm.hasMoreElements();){
                Employee stu=(Employee)enm.nextElement();
                String sex="";
                if(stu.getSex().equals("男"))sex="男";
                else sex="女";
                String str=stu.getNumber()+","+stu.getName()+","+sex+ "\n";
                显示.append(str);
            }
        }

        JScrollPane scroll=new JScrollPane(显示);

        Container con=getContentPane();

        con.add("Center",scroll);

        con.validate();

        setVisible(true);

        setBounds(100,100,400,300);

        addWindowListener(new WindowAdapter(){

                              public void windowClosing(WindowEvent e){
                                  setVisible(false);
                              }
                          }

        );
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
