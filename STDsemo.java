package abc;
import java.util.*;
public class STDsemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("Smile, the world is smiling with you");
		int count=st.countTokens();
		System.out.println("No.of tokens: "+count);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
