package abc;
class A{
	void show() {
		System.out.println("Parent class called");
	}
	}
public class Inherit extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inherit d=new Inherit();
		System.out.println("Child class called");
		d.show();
		

	}

}
