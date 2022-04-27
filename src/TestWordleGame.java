import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class TestWordleGame {

  @Test
  @DisplayName("Should create game with default answer and default number of tries.")
  public void testDefaultConstructor()
  {
    try {
      WordleGame game = new WordleGame();
      String g = game.guess("ABCDE");
      assertEquals(WordleGame.ANSI_GREEN + "ABCDE" + WordleGame.ANSI_RESET, g);
    }
    catch (Exception e) {
      fail();
    }
  }

  @Test
  @DisplayName("Should create game with given answer and default number of tries.")
  public void testConstructorGivenWord()
  {
    try {
      WordleGame game = new WordleGame("ABCDF");
      String g = game.guess("ABCDF");
      assertEquals(WordleGame.ANSI_GREEN + "ABCDF" + WordleGame.ANSI_RESET, g);
    }
    catch (Exception e) {
      fail();
    }
  }

  @Test
  @DisplayName("Should create game with given answer and number of tries.")
  public void testConstructorGivenWordAndTries()
  {
    try {
      WordleGame game = new WordleGame("ABCDF", 5);
      String g = game.guess("ABCDF");
      assertEquals(WordleGame.ANSI_GREEN + "ABCDF" + WordleGame.ANSI_RESET, g);
    }
    catch (Exception e) {
      fail();
    }
  }
  
}