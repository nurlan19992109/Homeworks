package hw5;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;


    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {

    }


    void eat() {
        System.out.println("I'm eating");
    }

    void respond() {
        System.out.printf("Hello owner. I am %s. I miss you\n", nickname);
    }

    void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        if (species == "dog") {
            habits = new String[]{"eat", "drink", "sleep"};
            age = 5;
            nickname = "Rock";
            trickLevel = 75;
            return "Dog{" +
                    "nickname='" + nickname + '\'' +
                    ", age=" + age +
                    ", trickLevel=" + trickLevel +
                    ", habits=" + Arrays.toString(habits) +
                    '}';
        } else
            return "Pet{" +
                    "species='" + species + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", age=" + age +
                    ", trickLevel=" + trickLevel +
                    ", habits=" + Arrays.toString(habits) +
                    '}';
    }

    void print() {
        System.out.println(toString());
    }
}
