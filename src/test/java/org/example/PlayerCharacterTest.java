package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {
    @Test
    public void getX_returnZero(){
        int actual = 0;
        int expected = PlayerCharacter.getX();
        assertEquals(actual, expected);
    }

    @Test
    public void getY_returnZero(){
        int actual = 0;
        int expected = PlayerCharacter.getY();
        assertEquals(actual, expected);
    }

    @Test
    public void move_whenW_returnYIncreases1(){
        char character = 'W';
        int actual = PlayerCharacter.y + 1;
        int expected = PlayerCharacter.move(character);
        assertEquals(actual, expected);
    }

    @Test
    public void move_whenS_returnYDecreases1(){
        char character = 'S';
        int actual = PlayerCharacter.y - 1;
        int expected = PlayerCharacter.move(character);
        assertEquals(actual, expected);
    }

    @Test
    public void move_whenD_returnXIncreases1(){
        char character = 'D';
        int actual = PlayerCharacter.x + 1;
        int expected = PlayerCharacter.move(character);
        assertEquals(actual, expected);
    }

    @Test
    public void move_whenA_returnYDecreases1(){
        char character = 'A';
        int actual = PlayerCharacter.x - 1;
        int expected = PlayerCharacter.move(character);
        assertEquals(actual, expected);
    }

}