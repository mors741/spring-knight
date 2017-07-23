package com.mors741.knight;

import java.io.PrintStream;

public class PrincessSavingQuest implements Quest{
    private PrintStream stream;

    public PrincessSavingQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Knight embarked the PrincessSavingQuest");
    }

    public boolean isOk() {
        return true;
    }
}
