package core_java;

class Roooms{
	int roomno;
	String roomtype;
	Roooms(int roomno,String roomtype){
		this.roomno=roomno;
		this.roomtype=roomtype;
	}
	void getData(){
		System.out.println("room no. is %d ".formatted(roomno));
		System.out.println("room type is %s ".formatted(roomtype));
	}
}
public class ConstructRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Roooms cr=new Roooms(12,"ac");
     cr.getData();
	}

}
