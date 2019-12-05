import java.io.*;


public class File{
public static void main(String[] args) throws IOException{

        String s;
        BufferedReader in=new BufferedReader (new InputStreamReader(System. in));
        s=in.readLine();

        FileWriter fw=new FileWriter("E:\\javacode/ha.txt");  //设置生成文件的路径

        fw.write(s);
        fw.close();
        System. out. println(s);
        }
        }
