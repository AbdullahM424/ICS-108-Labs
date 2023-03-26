package Lab09;

public class Person {
    private String name;
    private long number;

    public Person(String name, long number){
        this.name= name;
        this.number= number;
    }
    @Override
    public String toString(){
        return "Name: "+ name + "  Phone number: " + number;
    }
    public long getNumber(){
        return number;
    }
    public void setNumber( long number){
        this.number= number;
    }
    public String getName(){
        return name;
    }
}
