package abc;
class Team{
	void show(int empid) {
		System.out.println("The employeeID is:"+empid);
	}
	void show(String Empname) {
		System.out.println("Name of the employee:"+Empname);
	}
}
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Team t= new Team();
t.show(402);
t.show("Sandhya");
	}

}
