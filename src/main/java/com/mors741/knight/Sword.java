package com.mors741.knight;

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Sword implements Weapon {
    private int slayed = 0;
    private String name = "Unnamed";

    public Sword() {}

    public Sword(int slayed) {
        this.slayed = slayed;
    }

    public Sword(int slayed, String name) {
        this.slayed = slayed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "name=" + name + ", " +
                "slayed=" + (slayed++) +
                '}';
    }
}
