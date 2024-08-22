package abc;
abstract class Text{
abstract void reflect();
void display() {
	System.out.println("This is my team");
}
	
}
class Video extends Text{
	public void reflect() {
		System.out.println("We are a team of 10");
	}
}
public class Abss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Video v=new Video();
v.reflect();
v.display();
	}

}
