package ru.example;

public class Cat extends Animal {
    private final String Color;

    public Cat(String name, String sounds, String speed, String eat, Boolean climbTrees, Boolean swim, Boolean fly, String Color) {
        super(name, sounds, speed, eat, climbTrees, swim, fly);
        this.Color = Color;
    }

    public Cat() {
        this("Барсик", "Мяу", "Fast", "Meat", Boolean.TRUE, Boolean.TRUE, Boolean.FALSE, "Black");
        //System.out.println(super.makeSounds);
    }

    public String getColor() {
        return Color;
    }
}
