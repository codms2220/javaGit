class GiaCar extends Car{
//	GiaCar(String name) {
////		super 부모생성자 호출
//		super(name);
//	}

	public void tellInfo() {
		tellName();
//		상위 클래스 name - this,super
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println("기아자동차");
//		System.out.println("name = "+name);
	}
}
class SSangyoungCar extends Car{
	public void tellInfo() {
		tellName();
		System.out.println("쌍용자동차");
	}
}
class SamsungCar extends Car{
	public void tellInfo() {
		tellName();
		System.out.println("삼성자동차");
	}
}
public class Car {
	String name;
	Car(){}
	Car(String name){
		this.name = name;
	}
	
	public void tellName() {
		System.out.println("name = "+name);
	}
}
