class Machine{
	private String name;
	private int code;
	public Machine() {
		System.out.println("Constructor running");
		name="Papa";
	}
	
	public Machine(String name) {
		System.out.println("Second constructor running");
		this.name=name;
	}
	
	public Machine(String name,int code) {
		System.out.println("Third constructor running");
		this.name=name;
		this.code=code;
	}
}
public class Application {

	public static void main(String[] args) {
		Machine machine1=new Machine();
		Machine machine2=new Machine("Lola");
		Machine machine3=new Machine("Gaga",99);
       
	}

}
