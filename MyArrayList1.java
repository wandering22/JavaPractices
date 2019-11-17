import java.util.Arrays;
//顺序表中存储的元素是int类型
public class MyArrayList1{
	private int[] array;
	private int size;
	
	public MyArrayList1(int capacity){
		array=new int [capacity];
		size=0;
	}
	
	public MyArrayList1(){
		this(10);
		
	}
	//尾插
	//时间复杂度都是O(1)
	//空间复杂度都是O(1)
	// public void pushBack(int element){
		
		// array[size++]=element;
	// }
	
	//尾删
	public void popBack(){
		 
		
		array[--size]=0; 
	}
	//头插
	public void pushFront(int element){
		for(int i=size-1;i>=0;i--){
			//array[空心]=array[实心]
			array[i+1]=array[i];
		}
		array[0]=element;
		//长度+1
		size++;
	}
	public void pushFront1(int element){
		for(int i=size;i>=1;i--){
			
			array[i]=array[i-1];
		}
		array[0]=element;
		//长度+1
		size++;
	}
	//头删
	public void popFront(){
		if(size==0){
			System.out.println("空了");
			return;
		}
		for(int i=1;i<=size-1;i++){
			array[i-1]=array[i];
		}
		array[size]=0;
		--size;
	}
	private boolean checkCapacity(int num){
		return size+num<=array.length;
	}
	public void insert(int element,int index){
		if(index<0||index>size){
			throw new ArrayIndexOutOfBoundsException(index);//抛出异常
		}
		boolean r=checkCapacity(1);
		if(!r){
			ensureCapacity();
		}
		for(int i=size-1;i>=index;i--){
			array[i+1]=array[i];
		}
		array[index]=element;
		size++;
	}
	public void erase(int index){
		if(size==0){
			System.out.println("空的");
			return;
		}
		for(int i=index+1;i<size;i++){
			array[i-1]=array[i];
		}
		array[--size]=0;
	}
	//检查容量是否够用
	
	//扩容
	private void ensureCapacity(){
		int newlength=array.length*2;
		int[] newArray=new int[newlength];
		for(int i=0;i<size;i++){
			newArray[i]=array[i];
		}
		array=newArray;//this.array=newArray;
	}
		
		public void pushBack(int element){
			insert(element,0);
		}
	@Override
	public String toString (){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
		  public static void main(String[] args){
			  MyArrayList1 list =new MyArrayList1();
			  list.pushBack(1);
			  list.pushBack(2);
			  list.pushBack(10);
			  System.out.println(list);
			  list.pushFront(1);
			  list.pushFront(2);
			  list.pushFront(10);
			  System.out.println(list);
			  list.pushFront1(1);
			  list.pushFront1(2);
			  list.pushFront1(10);
			  System.out.println(list);
			  list.popFront();
			  System.out.println(list);
			  list.insert(7,6);
			  
			  System.out.println(list);
			  list.insert(6,6);
			  list.insert(5,6);
			  System.out.println(list);
		  }
}