package com.example.lotterylistfive;

import java.util.ArrayList;
import java.util.List;

class Player {
    String name;
    String age;
    int photoId;
    private List<Player> persons;

    // Getter methods
    Player(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getImage() {
        return photoId;
    }

    // This method creates an ArrayList that has three Player objects

    private void initializeData() {
        persons = new ArrayList<>();
        persons.add(new Player("Anthony Joshua", "30 years old", R.drawable.joshua));
        persons.add(new Player("Wladimir Klitschko", "43 years old", R.drawable.klitschko));
        persons.add(new Player("Saul Alvarez", "29 years old", R.drawable.alvarez));
    }
}
