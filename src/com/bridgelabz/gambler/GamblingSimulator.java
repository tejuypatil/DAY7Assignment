package com.bridgelabz.gambler;

public class GamblingSimulator {

    static int BET_PER_GAME = 1;
    static int DAILY_STAKE = 100;
    static int totalAmountWon;
    static int totalAmountLost;
    static int winningDays=0;
    static int loosingDays=0;
    static  int win= 1;

    static void checkWin(){
        int random=(int)(Math.random()*10)%2;
        if(random==win){
            DAILY_STAKE++;
        }
        else{
            DAILY_STAKE=DAILY_STAKE--;
        }
    }
    static void resignForTheDay() {

        for (int day = 1; day <= 20; day++) {
            System.out.print("Day: " + day);
            DAILY_STAKE=100;
            while (DAILY_STAKE < 150 && DAILY_STAKE > 50) {
                checkWin();
            }
            if (DAILY_STAKE > 100) {
                totalAmountWon += 50;
                System.out.println("won on day " + day + " is " + (DAILY_STAKE - 100));
                winningDays++;
            } else {
                totalAmountLost -= 50;
                System.out.println("Lost on day " + day + " is " + (100 - DAILY_STAKE));
                loosingDays++;
            }
        }
        System.out.println("Total Amount Won in 20 Days " + totalAmountWon);
        System.out.println("Total Amount Lost in 20 Days " + totalAmountLost);
        System.out.println("No of Days Won " +winningDays);
        System.out.println("No of Days Lost " +loosingDays);

       // System.out.println(" DAILY_STAKE "+DAILY_STAKE);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");
        resignForTheDay();
    }
}
