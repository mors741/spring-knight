package com.mors741.knight;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BraveKnight implements Knight {

    private List<Quest> quests;
    private Weapon firstWeapon;
    private Weapon secondWeapon;
    private Shield shield;

    public BraveKnight(List<Quest> quests) {
        this.quests = quests;
    }

    @Autowired
    @Long
    public void setFirstWeapon(Weapon firstWeapon) {
        this.firstWeapon = firstWeapon;
    }

    @Autowired
    @Heavy
    public void setSecondWeapon(Weapon secondWeapon) {
        this.secondWeapon = secondWeapon;
    }

    @Autowired(required = false)
    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public void embarkOnQuest(int distance) {
        for (Quest quest : quests) {
            System.out.println(shield);
            System.out.println(firstWeapon);
            System.out.println(secondWeapon);
            quest.embark();
        }
        System.out.println("Total distance: " + distance + "km");
    }

}
