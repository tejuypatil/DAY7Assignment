package com.bridgelabz.gambler;

public class GamblingSimulator {

    static int BET_PER_GAME = 1;
    static int DAILY_STAKE = 100;

    static  int win= 1;

    static void checkWin(){
        int random=(int)(Math.random()*10)%2;
        if(random==win){
            DAILY_STAKE++;
            System.out.println("You win ");
        }
        else{
            DAILY_STAKE--;
            System.out.println("You loose");

        }
        System.out.println("You have a Daily Stake = "+DAILY_STAKE);
    }
    static void resignForTheDay(){
        while (DAILY_STAKE< 150 && DAILY_STAKE>50){
            checkWin();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");
        resignForTheDay();
    }
}
