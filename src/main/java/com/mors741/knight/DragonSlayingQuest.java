package com.mors741.knight;

import java.io.PrintStream;

public class DragonSlayingQuest implements Quest{
    private PrintStream stream;

    public void setStream(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Knight embarked the DragonSlayingQuest");
    }

    public boolean isOk() {
        return false;
    }
}
