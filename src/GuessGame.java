public class GuessGame {
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
}

class Player {
	int number = 0;

	public void guess() {
		this.number = (int) (Math.random() * 10);
	}
}

class Game {
	String wut;

	public Game() {
		this.wut = "Hey!";
		System.out.println(this.wut + " I am called from the constructor");
	}

	public void start() {
		int numTries = 1;
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I am thinking of a number between 0-9");

		while(true) {
			p1.guess();
			p2.guess();
			p3.guess();

			if (p1.number == targetNumber) {
				p1isRight= true;
			}

			if (p2.number == targetNumber) {
				p2isRight= true;
			}

			if (p3.number == targetNumber) {
				p3isRight= true;
			}

			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("p1isRight: " + p1isRight);
				System.out.println("p2isRight: " + p2isRight);
				System.out.println("p3isRight: " + p3isRight);
				System.out.println("It took players " + numTries + " tries to guess the correct answer which was " + targetNumber);
				break;
			} else {
				System.out.println(numTries + ". Keep guessin!");
				numTries = numTries + 1;
			}
		}
	}
}