package 多态;

public class Dog extends Animal {
    String host;
    Dog(){
        super();
    }

    public static void scream(){
        System.out.println("wang");
    }
    public static void main(String[] args) {
        Animal hei=new Animal();
        Dog d=new Dog();
        d.scream();

    }
}

