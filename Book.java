public class Book{
	 String name;
	 String writer;
	private double price;
	private String press;
	Book(String name,String writer,double price,String press){
		this.name=name;
		this.writer=writer;
		
	}
	Book(){
		name="我是书名";
		writer="汤众";
		price=20;
		press="大海出版社";
	}
	// Book(String writer){
		// writer="汤众 陈沛鑫"；
	// }
	void setBook(double price){
		this.price=price;
	}
	double getBook(double price){
		return price;
	}
	void appendWriter(String writer){
		this.writer=this.writer+" "+writer;
		}
}