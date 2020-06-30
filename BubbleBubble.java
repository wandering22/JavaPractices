

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BubbleBubble {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            Scanner sc = new Scanner(System.in);
            int input;
            do {
                System.out.println("********************");
                System.out.println("1.新增整数");
                System.out.println("2.删除整数");
                System.out.println("3.修改整数");
                System.out.println("4.显示所有数据");
                System.out.println("5.排行榜");
                System.out.println("0.退出系统");
                System.out.println("********************");
                System.out.println("请输入【0-5】");
                input = sc.nextInt();

                switch (input)
                {
                    case 0: System.out.println("欢迎下次光临！");break;
                    case 1:
                        //System.out.println("正在新增...");
                        System.out.println("请输入您要增加的数：");
                        int myNum = sc.nextInt();
                        list.add(myNum);
                        break;
                    case 2:
                        //System.out.println("正在删除...");
                        System.out.println("请输入您要删除的数：");
                        int del = sc.nextInt();
                        list.remove(new Integer(del));
                        break;
                    case 3:
                        //System.out.println("正在修改...");
                        System.out.println("请输入修改前的数：");
                        int oldNum = sc.nextInt();
                        if (list.contains(oldNum))
                        {
                            System.out.println("请输入修改后的数：");
                            int newNum = sc.nextInt();
                            int index = list.indexOf(oldNum);//在列表中查找oldNum所在的下标
                            list.set(index,newNum);//将列表中下标为index的数修改为newNum
                            System.out.println(list);
                        }
                        else
                            System.out.println("修改的值不存在");

                        break;
                    case 4:
                        //System.out.println("正在显示...");
			/*for (int i = 0; i < list.size(); i++)
			{
				System.out.print(list.get(i)+" ");
			}*/
                        System.out.println(list);
                        break;
                    case 5:
                        //System.out.println("正在排序...");
                        //Collections.sort(list);//Array.sort  默认为升序排序
                        for (int i = 0; i < list.size(); i++)
                        {
                            for (int j = 0; j < list.size() - 1 - i ; j++)
                            {
                                if (list.get(j) > list.get(j+1))
                                {
                                    int tmp =  list.get(j);
                                    list.set(j,list.get(j+1)) ;
                                    list.set(j+1,tmp) ;
                                }
                            }
                        }

                        break;
                    default:System.out.println("输入 的代码有误！请重新输入：");break;
                }
            }while(input != 0);
            sc.close();
        }
    }

