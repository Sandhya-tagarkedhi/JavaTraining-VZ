package abc;
import java.util.*;
public class Vectdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector(2);
		int n1=v.capacity();
		System.out.println("capacity of vector: "+n1);
		v.add(211);
		v.add(25);
		v.add(532);
		int n2=v.capacity();
		System.out.println(v);
		System.out.println("New capacity of vector: "+n2);

	}

}
