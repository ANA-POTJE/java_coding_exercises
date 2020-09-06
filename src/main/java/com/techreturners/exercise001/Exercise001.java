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
        return 0.0;
    }

    public String reverse(String sentence) {
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        return 0;
    }
}
