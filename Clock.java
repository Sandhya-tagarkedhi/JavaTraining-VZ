package abc;
import java.util.*;
public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hours,minutes,seconds");
		int h=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt();
		System.out.println("Clock");
		for(h=h;h<24;h++) {
			for(m=m;m<60;m++) {
				for(s=s;s<60;s++) {
					System.out.println("%2d:%2d:%2d\r",h,m,s);
					Thread.sleep(1000);
				}s=0;
			}m=0;
		}h=0;

	}

}
