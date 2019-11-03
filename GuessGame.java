import java.util.Random;
import java.util.Scanner;

public class GuessGame{
	public static void main(String[] args){
		Random random=new Random(20191030);
		Scanner scanner=new Scanner(System.in);
		System.out.println("************************");
		System.out.println("***欢迎来到猜数字游戏***");
		System.out.println("************************");
		int n=random.nextInt(100);//生成1-100的随机数
	
		int times=5;
		System.out.println("您有"+times+"次机会");
		for(int i=1;i<=times;i++){
				System.out.println("请猜数字:");
				int j=5;
				for(j=5;j>0;j--){
                int x=scanner.nextInt();
				
				if(x==n){
					System.out.println("恭喜猜对！");
				}
				else if(x>n){
					System.out.println("猜大了,您还有"+(j-1)+"次机会");
					
				}
				else if(x<n){
					System.out.println("猜小了，您还有"+(j-1)+"次机会");
				
				}
		}
		System.out.println("很遗憾，游戏结束");
		System.out.println("正确数字是"+n);}
	}
}