public class pp22 {
	public String name;
	public int age;
	
	public pp22(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public pp22(String name) {
		this(name, 0);
	}
	
	public pp22() {
		this("秘密");
	}
}