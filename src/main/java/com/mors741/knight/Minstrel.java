package com.mors741.knight;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(int d) {
        stream.println("Tra-la-la " + d + " km ahead!");
    }

    public void singAfterQuest(int d) {
        stream.println("Tee-hee-hee After quest");
    }
}
