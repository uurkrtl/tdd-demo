package org.example;

public class PlayerCharacter {
    public static int x = 0;
    public static int y = 0;
    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int move(char movement) {
        if(movement == 'W'){
            return ++y;
        }else if (movement == 'S'){
            return --y;
        } else if (movement == 'D') {
            return ++x;
        }else if (movement == 'A') {
            return --x;
        }
        return 0;
    }
}
