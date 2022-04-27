# Wordle Game
In this assignment, you will be re-creating a [Wordle game](https://www.nytimes.com/games/wordle/index.html), similar to the activity done in the classroom. You are given two classes: `WordleGame.java` and `Main.java`. You will be modifying these two classes, and creating a third one. You are also given a text file `database.txt`, which is a list of 5-letter words (all 5-letter words from the first Harry Potter book!). **The objective of your program is to create a Wordle game with a random word from the text file**.

Here's a breakdown of the requirements:
1. Modify the `Main.java` to read a word from the `database.txt` file
2. Create a custom exception named `InvalidInputException` that will be used when the user inputs an invalid guess (invalid doesn't mean wrong, means it's not 5-letter long, etc.)
3. Throw the exception from the `WordleGame` class when appropriate
4. Use `try/catch` in the `Main` when appropriate

## GRADING NOTE

This assignment will not be **completely* autograded like the previous ones. It will be manually graded by the instructor. Making the game work is more important than having the tests pass. Submission is still done via GitHub.

## Assignment workflow

1. Accept the assignment when posted on Moodle
1. ***Clone*** the assignment repository
1. Solve the assignment
1. Submit (`commit` and `push`) the assignment
    1. Resubmit if necessary or contact the instructor for questions.
