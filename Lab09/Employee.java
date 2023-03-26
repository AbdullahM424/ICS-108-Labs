package Lab09;

public class Employee extends Person{
    private long id;
    private double monthlySalary;

    public Employee(String name, long number, long id, double monthlySalary){
        super(name,number);
        this.id= id;
        this.monthlySalary= monthlySalary;
    }
    @Override
    public String toString(){
        return super.toString()+ "ID: " + id + " Monthly salary: " + monthlySalary + " SAR";
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public void setMonthlySalary( double monthlySalary){
        this.monthlySalary= monthlySalary;
    }
}
