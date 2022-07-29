package core_java;
class Rooms{
	int roomno;
	String roomtype;
	String roomarea;
	int ACmachine;
	void getData(int roomno,String roomtype,String roomarea,int ACmachine)
	{
		this.roomno=roomno;
		this.roomtype=roomtype;
		this.roomarea=roomarea;
		this.ACmachine=ACmachine;
		
	}
	void displayData() {
		System.out.println("room no is %d ".formatted(roomno));
		System.out.println(roomtype);
		System.out.println("area %s ".formatted(roomarea));
		System.out.println("no. of ac are %d ".formatted(ACmachine));
	}
}
public class Room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Rooms r=new Rooms();
     r.getData(12,"ac room","2bhk",1);
     r.displayData();
	}

}
