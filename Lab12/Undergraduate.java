package Lab12;

public class Undergraduate extends Student{
      private double GPA;

      public Undergraduate(int id,double GPA){
          super(id, GPA);
      }

    @Override
    public String getStatus(){
        if(GPA>=3.0 ){
            return "honor";
        } else if (GPA>=2.0) {
            return "good";
        }
        return "Probation";
    }
}
