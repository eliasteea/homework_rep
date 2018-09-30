package com.company;

public class homework1_10 {
    public static void main(String[] args) {

        String[] Months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] AverageTemp = {-5, -10, 7, 14, 23, 25, 31, 28, 21, 13, 11, 4,};

        for (int i = 0; i < Months.length; i++){
            System.out.println(Months[i] + " = " + AverageTemp[i] + "\u00b0C / " + (AverageTemp[i] + 273) + "\u212A");
        }
    }
}
