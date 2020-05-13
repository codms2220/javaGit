
public class CarMain {

	public CarMain() {
		GiaCar gc = new GiaCar();
		gc.name = "k5";
		gc.tellInfo();
		
		SSangyoungCar sc = new SSangyoungCar();
		sc.name = "코란도c";
		sc.tellInfo();
		
		SamsungCar ss = new SamsungCar();
		ss.name = "QM6";
		ss.tellInfo();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CarMain();
	}

}
