import java.util.Arrays;
//顺序表中存储的元素是int类型
public class MyArrayList{
	private int[] array;
	private int size;
	
	MyArrayList(){
		array =new int[10];
		size=0;
	}
	//尾插
	//时间复杂度都是O(1)
	//空间复杂度都是O(1)
	public void pushBack(int element){
		
		array[size++]=element;
	}
	
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
	
	public void insert(int element,int index){
		for(int i=size-1;i>=index;i--){
			array[i+1]=array[i];
		}
		array[index]=element;
		size++;
	}
		
	@Override
	public String toString (){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
		  public static void main(String[] args){
			  MyArrayList list =new MyArrayList();
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
			  list.insert(7,2);
			  System.out.println(list);
		  }
}