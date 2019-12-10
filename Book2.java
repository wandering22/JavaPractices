public class Book2 implements Comparable<Book2>{
    
    private  String ISBN;
    private String title;
    private int price;
    private String author;


    @Override
    public boolean equals(Object obj){
        //1.obj是不是null
        if(obj==null){
            return false;
        }
        
        //2.obj指向的是否是book
        if(!(obj instanceof  Book2)){
            return false;
        }
        
        //先向下转型
        Book2 book=(Book2)obj;
        
        //4.根据需要，选择合适的判断
        return this.ISBN.equals(book.ISBN);

    }

    public static void main(String[] args) {

        Book2 book1=new Book2();
        book1.title="哈哈啊";
        book1.author="嘿";
        book1.price=100;
        book1.ISBN="333";
        Book2 book2=new Book2();
        book2.title="哈哈啊";
        book2.author="嘿";
        book2.price=100;
        book2.ISBN="333";

        System.out.println(book1.equals(book2));
        System.out.println(book1.compareTo(book2));
        
        
    }

    @Override
    public int compareTo(Book2 o) {
        return this.price-o.price;
    }
}
