package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        char ini1 = firstName.charAt(0);
        char ini2 = lastName.charAt(0);
        return ini1+"."+ini2;
    }

    public double addVat(double originalPrice, double vatRate) {
        double num = (originalPrice + (originalPrice * vatRate / 100));

        if(Math.abs(num-Math.floor(num)) < 0.001){
            int truncatedNumberInt = (int)num;
            return truncatedNumberInt;
        } else {
            num = Math.floor(num * 100) / 100;
            return num;
        }
    }

    public String reverse(String sentence) {

        String reverse = "";
        for(int i = sentence.length() - 1; i >= 0; i--)
        {
          reverse = reverse + sentence.charAt(i);
        }
        return reverse;
    }

    public int countLinuxUsers(List<User> users) {
        return 0;
    }
}
