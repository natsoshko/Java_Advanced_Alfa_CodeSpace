package com.alfabank.work222;

public class Runner {
    public void run () {
        System.out.println("--- HomeWork 2-2 ---");
        Employee [] employs = createEmployees();
        showEmployees(employs);
    }

    public Employee [] createEmployees() {
        return new Employee[] {
                new Employee(),
                new Employee("Cristiano", "Ronaldo"),
                new Employee("Elon", "Musk", "founder of SpaceX", "0961112233")
        };
    }

    public void showEmployees(Employee ... emp) {
        System.out.println("Total Employees: " + Employee.getNumberOfEmployees());
        for (Employee em: emp) {
            System.out.println(em.getFirstName() + " " + em.getLastName() + ": " +
                    em.getOccupation() + ", " + em.getTelephone());
        }
    }
}
