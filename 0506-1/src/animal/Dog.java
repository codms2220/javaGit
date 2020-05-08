package animal;

import zoo.Cat;

public class Dog {

	public void welcome(Cat cat) {
		cat.makeSound();
		//default로 선언되어 있어서 다른 패키지에서 사용하지 못함.
		//cat.happy();
		cat.a = 20;
	}
	
}
