package abc;
import java.util.*;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		String result= (age>=18)? "Eligible to vote":"Not Eligible to vote";
		System.out.println(result);

	}

}
