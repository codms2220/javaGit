class Monitor{
	String name;
	
//	alt + shift + s -> o
	public Monitor(String name) {
		this.name = name;
	}
//	alt + shift + s -> s
	public String toString() {
		return "Monitor [name=" + name + "]";
	}
	
}
public class Ex09 {

	public static void main(String[] args) {
		Monitor[] mo = new Monitor[3];
		mo[0] = new Monitor("삼성모니터");
		mo[1] = new Monitor("LG모니터");
		mo[2] = new Monitor("한성모니터");
		
		for(int i = 0; i < mo.length; i++) {
			System.out.println("mo ["+i+"] = "+mo[i]);
		}
		System.out.println("mo[0].toString() = "+mo[0].toString());
	}
}
