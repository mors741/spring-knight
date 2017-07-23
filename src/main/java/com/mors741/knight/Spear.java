package com.mors741.knight;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Long
public class Spear implements Weapon {
    private int length;
    private String name;

    public Spear(int length, String name) {
        this.length = length;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Spear{" +
                "name=" + name + ", " +
                "length=" + length +
                '}';
    }
}
