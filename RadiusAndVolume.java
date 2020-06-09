import java.util.*;
public class RadiusAndVolume{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double cx=sc.nextFloat();
            double cy=sc.nextFloat();
            double cz=sc.nextFloat();
            double x=sc.nextFloat();
            double y=sc.nextFloat();
            double z=sc.nextFloat();
            double r1=0;
            double r=0;
            r1=(x-cx)*(x-cx)+(y-cy)*(y-cy)+(z-cz)*(z-cz);
            r=Math.sqrt(r1);
            System.out.printf("%.3f",r);
            System.out.print(" ");
            double v=0;
            v=4*Math.acos(-1)*Math.pow(r, 3)/3;//4πr^3/3
            System.out.printf("%.3f",v);
            System.out.println();
        }
    }
}