package abc;
class dam{
	void requirements() {
		System.out.println("sand,stones");
	}
}
public class Override extends dam{
	public void requirements() {
		System.out.println("cement,iron");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Override o=new Override();
		o.requirements();

	}

}
