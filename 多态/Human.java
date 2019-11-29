package 多态;

public class Human extends Animal {
    String name;
    Human(){

    }
    public static void scream(){
        System.out.println("哈哈");
    }

    public static void main(String[] args) {
        Animal h=new Animal();
        Human hu=new Human();
        h.叫();
        hu.scream();

    }
}

