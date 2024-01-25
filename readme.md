
## Coding: Project setup "The 2D game board and the game character"

Your task is to develop a simple 2D game board and a game character. The game board is a grid on which you can move using the W (up), S (down), D (right), and A (left) keys. You will write tests to ensure that the game character moves correctly on the game board.

Please create a new Java project for this and share it on GitHub. What is your GitHub repository URL?  `inputfield`

## [](https://github.com/neuefische/hh-java-24-1-handouts/blob/main/1-Java/07-TDD/challenges.md#coding-write-an-initial-test-getx)Coding: Write an initial test (getX)

In this first step, please do not write any production code in  `src/main/java`, but only define tests in  `src/test/java`.

Write a test that ensures the method  `getX`  in the class  `PlayerCharacter`  returns the value  `0`. Initially, the player should always be positioned in the middle of the game field.

What is the name of the test class where you test the functions for  `PlayerCharacter`?  `inputfield`

Run the test: it should now be red (compilation error, not runnable).

Because:

-   The class  `PlayerCharacter`  does not exist yet.
-   The method  `getX`  does not exist yet.
-   You haven't implemented anything yet.

## [](https://github.com/neuefische/hh-java-24-1-handouts/blob/main/1-Java/07-TDD/challenges.md#coding-write-a-minimal-implementation)Coding: Write a minimal implementation

In this second step, your task is to find the simplest way to make the test pass. So it's time to create the class  `PlayerCharacter`  and implement the method  `getX`.

Run the test: it should now be green (no compilation error, runnable, and the result is indeed  `0`).

Commit and push your changes now.

## [](https://github.com/neuefische/hh-java-24-1-handouts/blob/main/1-Java/07-TDD/challenges.md#coding-refactoring)Coding: Refactoring?

Most likely, there are no optimization possibilities (refactoring) at this point. But if there are any, please perform them and push your changes.

## [](https://github.com/neuefische/hh-java-24-1-handouts/blob/main/1-Java/07-TDD/challenges.md#coding-second-test-gety)Coding: Second Test (getY)

Please write a second test that ensures the method  `getY`  in the class  `PlayerCharacter`  returns the value  `0`.

Run the test: it should now be red (compilation error, not runnable).

## [](https://github.com/neuefische/hh-java-24-1-handouts/blob/main/1-Java/07-TDD/challenges.md#coding-second-minimal-implementation)Coding: Second minimal implementation

In this second step, your task is to find the simplest way to make the second test pass. So it's time to implement the method  `getY`.

## [](https://github.com/neuefische/hh-java-24-1-handouts/blob/main/1-Java/07-TDD/challenges.md#coding-second-refactoring)Coding: Second Refactoring?

Most likely, there are no optimization possibilities (refactoring) at this point. But if there are any, please perform them and push your changes.

## [](https://github.com/neuefische/hh-java-24-1-handouts/blob/main/1-Java/07-TDD/challenges.md#coding-third-test-move-w)Coding: Third Test (move W)

Write a test that ensures that when the method  `move`  in the class  `PlayerCharacter`  is called with the argument  `"W"`, the game character moves one position up (after the movement,  `Y = 1`  should be true).

Attention: for now, only write the test, do not change anything in  `src/main/java`.

## [](https://github.com/neuefische/hh-java-24-1-handouts/blob/main/1-Java/07-TDD/challenges.md#coding-third-minimal-implementation-move-w)Coding: Third minimal implementation (move W)

Now write the minimal implementation to make all tests pass.

Once all tests are passing, please commit and push your changes.

## [](https://github.com/neuefische/hh-java-24-1-handouts/blob/main/1-Java/07-TDD/challenges.md#coding-third-refactoring)Coding: Third refactoring?

Do you see any possibilities for improvement? If yes, please make those changes and push your modifications. Tip:  `static int x = 0;`

## [](https://github.com/neuefische/hh-java-24-1-handouts/blob/main/1-Java/07-TDD/challenges.md#coding-additional-tests-and-implementations)Coding: Additional tests and implementations

Continue strictly following the steps you have learned in the following order:

1.  Write a single test
2.  Ensure that the test is failing
3.  Write a minimal implementation to make the test pass
4.  Commit and push the code
5.  Perform refactoring as necessary (possibly commit and push again)

And implement one by one the following requirements:

-   move S (down)
-   move D (right)
-   move A (left)