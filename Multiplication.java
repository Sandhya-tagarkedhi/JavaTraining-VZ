package abc;
import java.util.*;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		System.out.println("Multiplication table of "+num+":");
		for(int i=1;i<11;i++) {
			int res=num*i;
			System.out.println(+num+"X"+i+"="+res);
		}

	}

}
