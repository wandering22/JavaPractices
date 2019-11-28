package 多态;

public class Animals {
    String type;
    String scream;
    int numberOfLegs;

    Animals() {

    }

    String gettype() {
        return type;
    }
    String scream(){
        return scream;
    }

    public static void main(String[] args) {
        Animals a=new Animals();

    }
}

