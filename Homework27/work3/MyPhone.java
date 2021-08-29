package com.alfabank.work3;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {
    private MyPhoneBook phonebook;
    SimCard sCard = new SimCard();

    MyPhone() {
        phonebook = new MyPhoneBook();
    }

    public MyPhoneBook getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(MyPhoneBook phonebook) {
        this.phonebook = phonebook;
    }

    public void swichOn() {
        System.out.println("--- Loading PhoneBook records...");
        phonebook.addPhoneNumber("Mark", "0979852536");
        phonebook.addPhoneNumber("Nazar", "0963257841");
        phonebook.addPhoneNumber("Anna", "0982365412");
        phonebook.addPhoneNumber("Andrey", "0631257845");
        phonebook.addPhoneNumber("Yevgen", "0987521436");
        System.out.println("--- Loading is complete.");
    }

    public void call(int indexId) {
        try {
            System.out.println("Caller info by id = " + indexId +
                    ": name = " + phonebook.records[indexId-1].name +
                    ", phone = " + phonebook.records[indexId-1].phone);
        } catch (NullPointerException ex) {
            System.out.println("Total callers in your pnonebook = " + phonebook.records.length + ". " + ex.getMessage());
        }
    }

    class MyPhoneBook {
        private PhoneRecord[] records;
        private int counter = 0;

        public MyPhoneBook() {
            records = new PhoneRecord[10];
        }

        public boolean addPhoneNumber(String name, String phone) {
            if (counter == records.length) return false;
            records[counter] = new PhoneRecord(name, phone);
            counter++;
            return true;
        }

        public String printPhoneBook() {
            if (counter == 0) {
                return "No records!";
            }
            return convertRecordsToString(Arrays.copyOf(records, counter));
        }

        private String convertRecordsToString(PhoneRecord[] myRecords) {
            StringBuilder temp = new StringBuilder();
            for (PhoneRecord element : myRecords) {
                temp.append(element + "\n");
            }
            return temp.toString();
        }

        public String sortByName() {
            PhoneRecord[] temp = Arrays.copyOf(records, counter);
            Arrays.sort(temp, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    String name1 = ( (PhoneRecord)o1).name;
                    String name2 = ( (PhoneRecord)o2).name;
                    return name1.compareTo(name2);
                }
            });
            return convertRecordsToString(temp);
        }

        public String sortByPhoneNumber() {
            PhoneRecord[] temp2 = Arrays.copyOf(records, counter);
            Arrays.sort(temp2, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    String phone1 = ( (PhoneRecord)o1).phone;
                    String phone2 = ( (PhoneRecord)o2).phone;
                    return phone1.compareTo(phone2);
                }
            });
            return convertRecordsToString(temp2);
        }

        class PhoneRecord {
            private String name;
            private String phone;

            public PhoneRecord(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }
            public String getPhone() {
                return phone;
            }

            @Override
            public String toString() {
                return "name=" + name +
                        ", phone=" + phone ;
            }
        }
    }

    protected class SimCard {
        private String sMemory = "128 Gb";

        public String getsMemory() {
            return sMemory;
        }
    }
}
