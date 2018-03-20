package player;

import java.util.Scanner;

/*
 * I know I should close these Scanners.
 * I do not care.
 */
public class PlayerUtil {
	
	protected static final String[] CLASSES = { "Test", "Test2" };
	
	protected static PlayerClass createPlayerClass() {
		
		String classString = PlayerUtil.getInput("Select a class:", "Are you sure you want the class: ", true, CLASSES);
		switch (classString) {
		case "Warrior":
			return PlayerClass.WARRIOR;
		case "Archer":
			return PlayerClass.ARCHER;
		default:
			return null;
		}
	}
	
	protected static String getInput(String request, String confirmString, boolean canBeChanged, String[] Results) {

		Scanner console = new Scanner(System.in);

		while (true) {

			System.out.println(request);
			for (int i = 0; i < Results.length; i++) {
				System.out.println((i + 1) + ". " + Results[i]);
			}
			String input = console.next();

			for (String str : Results) {

				if (input.toLowerCase().equals(str.toLowerCase())) {
					if (getConfirm(confirmString, input, canBeChanged)) {

						return input;
					}
				}
			}

		}
	}

	protected static String getInput(String request, String confirmString, boolean canBeChanged) {

		Scanner console = new Scanner(System.in);

		while (true) {

			System.out.println(request);
			String input = console.next();

			if (getConfirm(confirmString, input, canBeChanged)) {

				return input;
			}

		}
	}

	private static boolean getConfirm(String confirmString, String content, boolean canBeChanged) {

		Scanner console = new Scanner(System.in);

		while (true) {

			System.out.println(confirmString + content + "? (Y/N)");
			if (!canBeChanged) {
				System.out.println("This cannot be changed later");
			}

			char input = console.next().toLowerCase().charAt(0);

			if (input == 'y') {
				return true;
			} else if (input == 'n') {
				return false;
			}
		}
	}
}
