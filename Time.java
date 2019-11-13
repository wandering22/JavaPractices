public class Time{
	private int hour=0;
	private int minute=0;
	private int second=0;
	private boolean b24=true;
	
	private int getTime(int hour,int minute,int second){
		//if(minute>0&&minute<60&&second>0&&second<60)
		return second;
	
	}
	// public Time(){
	// }
	public Time(int hour,int minute,int second){
		if(hour>24){
			System.out.println("不支持的小时");
			return;
		}
		if(minute<1||minute>60){
			System.out.println("不支持的分钟");
			return;
		}
		if(second<1||second>60){
			System.out.println("不支持的秒数");
			return;
		}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	

	
	@Override
	public String toString() {
       //if(b24)
		return String.format("%02d:%02d:%02d",hour, minute, second);
		
	}
	public void add(int second){
		// if (second < 0) {
			// System.out.println("请使用 sub");
			// return;
		//}
		this.second+=second;
		while(this.second>=60){
			this.second-=60;
			this.minute+=1;
		
			if(this.minute>=60){
				this.minute-=60;
				this.hour+=1;
			}
			if(this.hour>=24){
				this.hour-=24;
			}
		}
	}
	
	public static void main(String[] args){
		Time time=new Time(9,10,11);  
		System.out.println(time);
		time.add(100000);
		System.out.println(time);
	}
		
}
		
	