package hw5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "King", 1975);
        Human father = new Human("Martin", "King", 1970);
        Human child = new Human("Luci", "King", 1999);
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(child);
        Family family = new Family(mother, father);
        family.addChild(child);
        System.out.println(family.toString());
        System.out.println(family.countFamily());
        family.deleteChild(child);
        System.out.println(family.toString());
        System.out.println(family.countFamily());
    }
}
