package _07_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
void quack() {
	System.out.println("quack");
}
void waddle() {
	System.out.println("waddle");
}
Duck(String favoriteFood, int numberOfFriends) {
    this.favoriteFood = favoriteFood;
    this.numberOfFriends = numberOfFriends;
}
}
