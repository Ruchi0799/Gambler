package com.bridgelabz.gambler;

public class Gambler {
    public static final int $DAILY = 100;
    public static final int $PERGAME = 1;
    public static final int WIN = 1;
    public static final int LOSE = 0;
    public static void main(String[] args) {
        double Action = Math.floor(Math.random() * 10) % 2;
        if(Action==WIN)
        {
            System.out.println("You won $1");

        }
        else if(Action==LOSE)
        {
            System.out.println("You lose $1");
        }

    }
}
