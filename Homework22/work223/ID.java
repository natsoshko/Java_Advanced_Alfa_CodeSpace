package com.alfabank.work223;

import java.util.Random;

public class ID {
    private int id;
    private static int nextId;

    static {
        Random random = new Random();
        nextId = random.nextInt(100);
    }
    public ID () {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }
}
