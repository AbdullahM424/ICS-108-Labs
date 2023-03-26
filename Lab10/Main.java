package Lab10;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = createPersonList();
//1. This method prints the employees only
        printEmployees(personList);
//2. This method finds the average salary of employees
        double avgSalary = avgSalary(personList);
        System.out.println("avg salary of = " + avgSalary);
//3. This method prints the students only
        printStudents(personList);
//4. This method finds the average GPA of students
        double avgGpa = avgGpa(personList);
        System.out.println("avg GPA of students = " + avgGpa);

    }

    private static ArrayList<Person> createPersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Employee("Saad", "0563428255", 200003, 16000));
        personList.add(new Student("Reem", "0564448202", 20000, 3.6));
        personList.add(new Employee("Salem", "0501331845", 200001, 9000));
        personList.add(new Student("Hasan", "0594448202", 20002, 2.8));
        return personList;
    }

    private static void printEmployees(ArrayList<Person> personList){

        System.out.println("List of Employees");
        System.out.println("Name    Phone      ID     Salary");
        for(Person person: personList){
            if(person instanceof Employee){
                Employee employee= (Employee) person;
                System.out.println(employee.toString());
            }
        }
    }

    private static double avgSalary(ArrayList<Person> personList){
        double sum=0;
        int totalEmployees=0;

        for(  Person person :personList){
            if( person instanceof Employee){
                Employee employee= (Employee) person;
                sum+= employee.getSalary();
                totalEmployees+=1;
            }

        }
        return sum/totalEmployees;
    }
    private static void printStudents(ArrayList<Person> personList){
        System.out.println("List of Students");
        System.out.println("Name    Phone      ID     Salary");
        for( Person person : personList){
            if( person instanceof Student){
                Student student= (Student) person;
                System.out.println(student.toString());
            }
        }
    }

    private static double avgGpa(ArrayList<Person> personlist){
        double sum=0;
        int totalGPA=0;
        for( Person person: personlist){
            if(person instanceof Student){
                Student student= (Student) person;
                sum+= student.getGpa();
                totalGPA+=1;
            }
        }
        return sum/totalGPA;
    }

}
