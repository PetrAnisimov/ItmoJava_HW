package ru.itmo.lessons.lesson14;

import java.util.*;


public class Employee implements Comparable{
    private String name;
    private String company;
    private int salary;
    private int age;

    public Employee(String name, String company, int age, int salary) {
        this.name = name;
        this.company = company;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee

        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);
        // добавление num объектов Employee в список (employees)

        for (int i = 0; i < num; i++) {
            // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп
            double randomIndexForArray = (int) (2 + Math.random() * 5);
            double randomIndexForAge = (int) (20 + Math.random() * 40);
            double randomSalary = (int) (1101 + Math.random() * 133);
            employees.add(new Employee(names[(int) randomIndexForArray], companies[(int) randomIndexForArray], (int) randomIndexForAge, (int) randomSalary));

        }
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println("Зарплата: " +  employee.salary);
            System.out.println("Компания: " +  employee.company);
            System.out.println("Имя: " +  employee.name);
            System.out.println("Возраст: "+ employee.age);
        }

        return employees;

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


// Создать список объектов List<Employee> (использовать метод employeeGenerator)
// и сортировать по:
// имени
// имени и зарплате
// имени, зарплате, возрасту и компании

}



