package hw5;

import java.util.ArrayList;

public class Family implements EditFamily {
    private Human mother;
    private Human father;
    private ArrayList<Human> children = new ArrayList<>();
    private Pet pet;


    public Family(Human mother, Human father, ArrayList<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, ArrayList<Human> children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    @Override
    public void addChild(Human child) {
        children.add(child);
    }

    @Override
    public void deleteChild(Human child) {
        children.remove(child);
    }


    @Override
    public String toString() {
        if (children.isEmpty()) {
            return "Family{" +
                    "mother=" + mother +
                    ", father=" + father +
                    '}';
        }

        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                '}';
    }

    public int countFamily() {
        int count = 2 + children.size();
        return count;
    }
}
