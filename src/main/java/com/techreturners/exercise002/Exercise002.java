package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person1) {
        if (person1.getCity() == "Manchester") {
            return true;
        } else {
            return false;
        }
    }

    public boolean canWatchFilm(Person person1, int ageLimit) {
        if (person1.getAge() >= ageLimit) {
            return true;
        } else {
            return false;
        }
    }
}
