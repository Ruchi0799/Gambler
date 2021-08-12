package com.bridgelabz.gambler;

public class Gambler {
    public static final int $DAILY = 100;
    public static final int $PERGAME = 1;
    public static final int WIN = 1;
    public static final int LOSE = 0;

    public static void main(String[] args) {
        int totalamount = 100;

        while (totalamount>50 && totalamount<150 ) {
            double Action = Math.floor(Math.random() * 10) % 2;
            if ((int) Action == WIN) {
                totalamount = totalamount + 1;
                System.out.println("You won $1 your current stake value is : $" + totalamount);

            } else if ((int) Action == LOSE) {
                totalamount = totalamount - 1;
                System.out.println("You lose $1 your current stake value is : $" + totalamount);
            }
        }
        if(totalamount==50)
        {
            System.out.println("You lose");
        }
        else
        {
            System.out.println("You Won");
        }
    }
}