class Person{
	String name;
	int age;
	String sex;
	public void sayhello(String target){
		System.out.println(
		name+"say hello to"+target+sex+age);
	}

public Person(){
	name="秘密";	
	age=11;
}
public Person(String n,int a){
	name=n;	
	age=a;
}
	public static Person creatPerson(String name,int age){
	Person p=new Person();
	p.name=name;
	return p;
}
}
public class Main{
	public static void main(String[] args){
		Person p=new Person();
		p.name="刘刘";
		p.age=19;
		p.sex="女";
		p.sayhello("嘿");
	}
}
		