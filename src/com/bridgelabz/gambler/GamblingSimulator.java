package com.bridgelabz.gambler;

public class GamblingSimulator {

    static int BET_PER_GAME = 1;
    static int DAILY_STAKE = 100;

    static  int win= 1;

    static void checkWin(){
        int random=(int)(Math.random()*10)%2;
        if(random==win){
            DAILY_STAKE=DAILY_STAKE+10;
            //System.out.println("You win ");
        }
        else{
            DAILY_STAKE=DAILY_STAKE-10;
            //System.out.println("You loose");

        }

    }
    static void resignForTheDay() {
        for (int day = 1; day <= 20; day++) {

            System.out.print("Day: " + day);
            DAILY_STAKE=100;
            while (DAILY_STAKE < 150 && DAILY_STAKE > 50) {
                checkWin();
            }
            System.out.println(" DAILY_STAKE "+DAILY_STAKE);


        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");
        resignForTheDay();
    }
}
