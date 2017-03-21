import java.util.*;

public class Client {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);

		//variables
		ArrayList<String> fortunes = new ArrayList<String>();
		fortunes.add("Fortune 1");
		fortunes.add("Fortune 2");
		fortunes.add("Fortune 3");
		fortunes.add("Fortune 4");
		fortunes.add("Fortune 5");
		fortunes.add("Fortune 6");
		fortunes.add("Fortune 7");
		fortunes.add("Fortune 8");
		fortunes.add("Fortune 9");
		fortunes.add("Fortune 10");

		String fortGen = "";

		//promps user
		System.out.println("Do you want a fortune? Enter Y/N");
		fortGen = user.nextLine();

		// //Debugger to print out all fortunes
		// for (int a = 0; a < fortunes.size(); a++) {
		// 	System.out.println(fortunes.get(a));
		// }
		// //debugger to print out randFort value
		// System.out.println((int)(Math.random() * fortunes.size() + 1));

		GenerateFortunes(user, fortunes, fortGen);
		user.close();
	}

	public static void GenerateFortunes(Scanner user, ArrayList<String> list, String fortGen) {
		boolean switcher = true; //variable used to switch back and forth between randFortA and randFortB to avoid generating two identical fortunes in a row
		int randFortA = (int)(Math.random() * list.size()); //random variable to pick a fortune randomly from array
		int randFortB = (int)(Math.random() * list.size());

		while (fortGen.equals("Y") || fortGen.equals("y")) {
			if (switcher == true) {
				System.out.println("Here's your first fortune: " + list.get(randFortA));
				randFortA = (int)(Math.random() * list.size());
				System.out.println("Want another fortune? Enter Y/N");
				switcher = false;
				fortGen = user.nextLine();
			} else {
				System.out.println(list.get(randFortB));
				randFortB = (int)(Math.random() * list.size());

				if (randFortB == randFortA) {// resets randFortB if it equals the initial randFortB value
					randFortB = (int)(Math.random() * list.size());
				}
				switcher = true;
				System.out.println("Want another fortune? Enter Y/N");
				fortGen = user.nextLine();
			}
		}
	}

}



/*

while (fortGen.equals("Y") || fortGen.equals("y")) { //while the user continues to enter Y or y the loop will generate another fortune
	if (init = true) {
		System.out.println(fortunes.get(randFortInit));
		System.out.println("Do you want another fortune? Y/N");
		fortGen = user.nextLine();
		init = false;
	} else {
		fortGen = user.nextLine();
		int randFort = (int)(Math.random() * fortunes.size());
	}
}

*/
