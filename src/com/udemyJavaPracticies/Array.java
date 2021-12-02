package com.udemyJavaPracticies;

public class Array {
	public static void main(String[] args) {
        int[] lotteryNumbers = new int[7];

        lotteryNumbers[0] = 17;
        lotteryNumbers[1] = 23;
        lotteryNumbers[2] = 67;
        lotteryNumbers[3] = 37;
        lotteryNumbers[4] = 11;


        for (int lotteryNumber : lotteryNumbers){
            System.out.println(lotteryNumber);
        }

        int[][] weeklyLotteryNumbers = {
                {11, 22, 33, 44, 55},
                {10, 20, 30, 40, 50},
                {13, 24, 35, 46, 57},
                {10, 23, 35, 48, 58}
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
