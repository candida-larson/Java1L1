package com.geek.java.lesson5;

public class TestEmployee {
    private static Employee[] employeeArray = new Employee[5];

    public static void main(String[] args) {
        initEmployees();
        printEmployees(40);
    }

    private static void initEmployees() {
        employeeArray[0] = new Employee("Ivan Ivanov", "CEO", "mail@mail.com", "89161234567", 500000, 47);
        employeeArray[1] = new Employee("Petr Ivanov", "junior-developer", "mail@mail.com", "89161237567", 97000, 19);
        employeeArray[2] = new Employee("Pavel Lesanov", "senior-developer", "mail@mail.com", "89161634567", 186000, 32);
        employeeArray[3] = new Employee("Vladimir Overman", "team-lead", "mail@mail.com", "89161254567", 327000, 41);
        employeeArray[4] = new Employee("Catrin Ivanov", "marketer", "mail@mail.com", "89161234667", 260000, 27);
    }

    private static void printEmployees(int minAge) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > minAge) {
                System.out.println(">> " + employeeArray[i].getFullData());
            }
        }
    }

}
