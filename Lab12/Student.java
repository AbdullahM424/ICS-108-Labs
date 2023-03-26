package Lab12;

public  abstract class Student {
    private int id;
    private double GPA;

    public Student(int id,double GPA ){
        this.id= id;
        this.GPA= GPA;
    }

    public abstract String getStatus();

    @Override
    public final String toString(){
        return "The ID is: "+id + " The GPA is: "+ GPA+  " "+getStatus();
    }
}
