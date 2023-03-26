package Lab12;

public class Graduate extends Student{
    private double GPA;

    public Graduate( int id,double GPA){
        super(id, GPA);;
    }
    @Override
    public String getStatus(){
        if(GPA>=3.0){
            return "good";
        }
        return "Probation";
    }
}
