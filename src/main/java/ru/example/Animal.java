package ru.example;

public class Animal {
    private String Name;
    private String Sounds;
    private String Speed;
    private String Eat;
    private Boolean ClimbTrees;
    private Boolean Swim;
    private Boolean Fly;

    public Animal(String name, String sounds, String speed, String eat, Boolean climbTrees, Boolean swim, Boolean fly) {
        Name = name;
        Sounds = sounds;
        Speed = speed;
        Eat = eat;
        ClimbTrees = climbTrees;
        Swim = swim;
        Fly = fly;
    }

    public String getSounds() {
        return Sounds;
    }

    public String getSpeed() {
        return Speed;
    }

    public String getEat() {
        return Eat;
    }

    public Boolean getClimbTrees() {
        return ClimbTrees;
    }

    public Boolean getSwim() {
        return Swim;
    }

    public String getName() {
        return Name;
    }
}
