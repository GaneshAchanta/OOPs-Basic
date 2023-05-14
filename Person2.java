package basicoops;

public class Person2{
	int age;
	String name;
	public void talking() {
		System.out.println("My Name is "+name);
		System.out.println("My Age is "+age);
	}

	public static void main(String[] args) {
		Person java=new Person();
		java.talking();
		Person python=new Person();
		python.talking();
		Person oracle=new Person();
		oracle.talking();

	}

}
