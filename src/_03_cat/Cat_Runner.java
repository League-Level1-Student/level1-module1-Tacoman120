package _03_cat;

public class Cat_Runner {
	public static void main(String[] args) {
		Cat cat = new Cat("gryffin");
		cat.meow();
cat.printName();
		
		for(int y = 0; y<9; y++) {
		cat.kill();
	}
	}
}
