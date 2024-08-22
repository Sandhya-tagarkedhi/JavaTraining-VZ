package abc;
import java.util.*;
public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(22);
		s.push(24);
		s.push(28);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());

	}

}
