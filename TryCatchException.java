import java.util.ArrayList;

public class TryCatchException {

    public static void main(String[] args) {
        try{
            new ArrayList().get(1);
        }catch(RuntimeException e){
            throw new MyException("我是因为下标越界导致的",e);
        }

    }
}




