
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		MainMenu menu = new MainMenu();
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		while (running) {
			menu.showMenu();

			String choice = scanner.nextLine();

			switch (choice) {
				case "1":
					// new
					NewGame newGame = new NewGame();
					newGame.start();
					running = false;
					break;
				case "2":
					// load
					break;
				case "3":
					// exit
					System.out.println();
					System.out.println("Space itself yields to will.");
					System.out.println();
					running = false;
					break;
				default:
					System.out.println();
			}
		}
	}
}

