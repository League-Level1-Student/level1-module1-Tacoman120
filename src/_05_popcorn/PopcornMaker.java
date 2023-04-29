package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	
	
public static void main(String[] args) {
	Microwave wave = new Microwave();
	String flavor = JOptionPane.showInputDialog(null, "What flavor do you want?");
	String answer = JOptionPane.showInputDialog(null, "How long do you want to cook the popcorn for?");
	int time = Integer.parseInt(answer);
	Popcorn pop = new Popcorn(flavor+"corn");
	wave.putInMicrowave(pop);
	wave.setTime(time);
	wave.startMicrowave();
}
}