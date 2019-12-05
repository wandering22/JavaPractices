import java.io.*;

public class FileCopy2 {
    public static void main(String[] args) {
        try{
            FileReader in=new FileReader("E:\\javacode/ha.txt");
            FileWriter out=new FileWriter("E:\\javacode/he.txt");
            int c=in.read();
            while (c!=-1){
                out.write(c);
                System.out.println((char)c);
                c=in.read();
            }
            in.close();
            out.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
