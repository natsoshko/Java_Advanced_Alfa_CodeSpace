package com.alfabank.work223;

import com.alfabank.work222.Employee;

public class Runner {
    public void run() {
        System.out.println("--- HomeWork 2-3 ---");
        ID [] ids = createIDs();
        showIDs(ids);
    }

    public ID [] createIDs() {
        ID [] arid = new ID[15];
        for (int i = 0; i < arid.length; i++) {
            arid[i] = new ID();
        }
        return arid;
    }

    public void showIDs(ID... arrId) {
        System.out.println("Total id = " + arrId.length + ", next id = " + ID.getNextId());
        for (ID em: arrId) {
            System.out.print(em.getId() + " ");
        }
    }
}
