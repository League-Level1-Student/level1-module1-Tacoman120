package _07_duck;

public class Dog {
	int numberOfToys;
	String favoriteToy;
void walk() {
	System.out.println("walk");
}
void bark() {
	System.out.println("bark");
}
Dog(String favoriteToy, int numberOfToys) {
    this.favoriteToy = favoriteToy;
    this.numberOfToys = numberOfToys;
}
}
