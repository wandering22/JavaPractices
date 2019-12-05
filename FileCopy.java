import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        try{

            FileReader in=new FileReader("E:\\javacode/ha.txt");
            //被复制的目标文件路径
            BufferedReader b=new BufferedReader(in);
            FileWriter out=new FileWriter("E:\\javacode/hei.txt");
            //将要生成的新文件路径
            BufferedWriter bw=new BufferedWriter(out);

            String s=b.readLine();
            while(s!=null){
                bw.write(s);
                bw.newLine();
                System.out.println(s);
                s=b.readLine();
            }
            b.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
