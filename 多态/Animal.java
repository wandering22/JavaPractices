package 多态;

public class Animal {
    int color;
    int numberOfLegs;
    public void 叫(){
        System.out.println("我是一个动物");
    }
    Animal(){
        color=0;
        numberOfLegs=1;
    }
    Animal(int color,int numberOfLegs){
        this.color=color;
        this.numberOfLegs=numberOfLegs;
    }

    public int getColor(){
        return color;
    }

}
