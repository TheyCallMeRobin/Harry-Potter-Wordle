import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String randomAnswer = choose(new File("src/database.txt"));
            WordleGame game = new WordleGame(randomAnswer);
            while (!game.isOver()) {
                System.out.print("Guess the wordle (upper case letter only, please): ");
                String guess = sc.nextLine();
                String g = null;
                try {
                    g = game.guess(guess);
                } catch (InvalidInputException e) {
                    e.printStackTrace();
                }
                System.out.println(g);
            }
            //Prints correct answer in blue when the game is over
            if (game.isOver()){
                System.out.println("\u001B[34m" + randomAnswer + "\u001B[0m");
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static String choose(File f) throws FileNotFoundException{
        String result = null;
        Random rand = new Random();
        int n = 0;
        for (Scanner sc = new Scanner(f); sc.hasNext(); ){
            ++n;
            String line = sc.nextLine();
            if(rand.nextInt(n) == 0)
                result = line;
        }
        return result;
    }

}


