package 职工;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.io.*;

import java.util.Hashtable;
public class EmployeeManager extends JFrame implements ActionListener

{

    EmployeeSituation 基本信息录入=null;

    ModifySituation 基本信息修改=null;

    Inquest 基本信息查询=null;

    Delete 基本信息删除=null;
    Show 基本信息查看=null;

    JMenuBar bar;

    JMenu fileMenu;

    JMenuItem 录入,修改,查询,删除,查看;

    Container con=null;

    Hashtable 基本信息=null;

    File file=null;

    CardLayout card=null;

    JLabel label=null;

    JPanel pCenter;

    public EmployeeManager()

    {

        录入=new JMenuItem("录入信息");

        修改=new JMenuItem("修改信息");

        查询=new JMenuItem("查询信息");

        删除=new JMenuItem("删除信息");
        查看=new JMenuItem("查看信息");

        bar=new JMenuBar();

        fileMenu=new JMenu("菜单");

        fileMenu.add(录入);

        fileMenu.add(修改);

        fileMenu.add(查询);

        fileMenu.add(删除);
        fileMenu.add(查看);

        bar.add(fileMenu);

        setJMenuBar(bar);

        this.setTitle("员工管理系统");
        label=new JLabel("员工信息管理系统",JLabel.CENTER);

        label.setFont(new Font("SansSerif",Font.BOLD+Font.ITALIC,40));

        label.setForeground(Color.blue);

        基本信息=new Hashtable();

        录入.addActionListener(this);

        修改.addActionListener(this);

        查询.addActionListener(this);

        删除.addActionListener(this);
        查看.addActionListener(this);

        card=new CardLayout();


            con=getContentPane();

        pCenter=new JPanel();

        pCenter.setLayout(card);

        pCenter.setBackground(Color.lightGray);

        file=new File("E:\\javacode\\java课程设计/员工信息.txt");

        if(!file.exists())

        {

            try

            {

                FileOutputStream out=new FileOutputStream(file);

                ObjectOutputStream objectOut=new

                        ObjectOutputStream(out);

                objectOut.writeObject(基本信息);

                objectOut.close();

                out.close();

            }

            catch(IOException e)

            {

            }

        }

        基本信息录入=new EmployeeSituation(file);

        基本信息修改=new ModifySituation(file);

        基本信息查询=new Inquest(this,file);

        基本信息删除=new Delete(file);
        基本信息查看=new Show(file);

        pCenter.add("欢迎语界面",label);

        pCenter.add("录入界面",基本信息录入);

        pCenter.add("修改界面",基本信息修改);

        pCenter.add("删除界面",基本信息删除);


        con.add(pCenter,BorderLayout.CENTER);

        con.validate();

        addWindowListener(new WindowAdapter()

        {

            public void windowClosing(WindowEvent e)

            {

                System.exit(0);

            }});

        setVisible(true);

        setBounds(100,50,420,380);

        validate();

    }

    public void actionPerformed(ActionEvent e)

    {

        if(e.getSource()==录入)

        {


            card.show(pCenter,"录入界面");

        }

        else if(e.getSource()==修改)

        {

            card.show(pCenter,"修改界面");

        }

        else if(e.getSource()==查询)

        {

            基本信息查询.setVisible(true);

        }

        else if(e.getSource()==删除)

        {

            card.show(pCenter,"删除界面");

        }
        else if(e.getSource()==查看){
            //基本信息查看.list();
            card.show(pCenter,"查看界面");
        }

    }

    public static void main(String args[])

    {

        new EmployeeManager();

    }}
