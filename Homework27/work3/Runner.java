package com.alfabank.work3;

import java.util.Scanner;

public class Runner {
    public void run() {
        MyPhone phone = new MyPhone();
        phone.swichOn();
        System.out.println(phone.getPhonebook().printPhoneBook());
        System.out.print("Enter Caller Id in your phonebook: ");
        Scanner sc = new Scanner(System.in);
        int iInd = sc.nextInt();
        phone.call(iInd);

        System.out.println("Memory sim card of your phone: " + phone.sCard.getsMemory());

    }
}
