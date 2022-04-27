import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordleGame game = new WordleGame("HARRY");
        while (!game.isOver()) {
            System.out.print("Guess the wordle (upper case letter only, please): ");
            String guess = sc.nextLine();
            String g = game.guess(guess);
            System.out.println(g);
        }
        sc.close();
    }
}
