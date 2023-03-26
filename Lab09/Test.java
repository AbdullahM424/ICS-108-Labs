package Lab09;

public class Test {
    public static  void main(String[] args){
        Person person= new Person("Salem",501331845);
        Student student= new Student("Reem", 501338704,200000,3.6);
        Employee employee= new Employee("Saad", 563428255,200003,16000);


        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
    }
}
