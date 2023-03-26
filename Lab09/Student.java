package Lab09;

public class Student extends Person{
    private long id;
    private double GPA;

    public Student(String name, long number, long id, double GPA){
        super(name, number);
        this.id= id;
        this.GPA= GPA;
    }
    @Override
    public String toString(){
        return super.toString()+ "ID: " + id + "GPA: " + GPA;
    }
    public double getGPA(){
        return GPA;
    }
    public void setGPA(double GPA){
        this.GPA= GPA;
    }
}
