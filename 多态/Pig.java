package 多态;

public class Pig extends Animal {
    String house;
    Pig(){

    }
   public  void scream(){
        System.out.println("哼哼");
    }

    public static void main(String[] args) {
        Animal p=new Animal();
        Animal pi=new Pig();
        p.叫();
        pi.叫();

    }

}