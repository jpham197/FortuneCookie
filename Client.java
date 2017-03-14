import java.util.*;

public class Client {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);

		//variables
		ArrayList<String> fortunes = new ArrayList<String>();
		fortunes.add("Horse kick tree.");
		fortunes.add("Stand for something, because he who stands for nothing, falls for everything.");
		fortunes.add("An eye for an eye makes the whole world blind");
		fortunes.add("If not poorly, why decide at all?");
		fortunes.add("That's some other worldly shit.");
		String fortGen = "";
		int randFort = (int)(Math.random() * fortunes.size());
		//promps user
		System.out.println("Do you want a fortune? Enter Y/N");
		fortGen = user.nextLine();

		// //Debugger to print out all fortunes
		// for (int a = 0; a < fortunes.size(); a++) {
		// 	System.out.println(fortunes.get(a));
		// }
		// //debugger to print out randFort value
		// System.out.println((int)(Math.random() * fortunes.size() + 1));

		while (fortGen.equals("Y")) {
			System.out.println(fortunes.get(randFort));
			System.out.println("Do you want another fortune? Y/N");
			fortGen = user.nextLine();
			randFort = (int)(Math.random() * fortunes.size()); //refresh value of randFort to generate a new fortune

		}



	}

}
