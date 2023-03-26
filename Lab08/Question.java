package Lab08;

public class Question {
    private String text;

    public Question( String text){
        this.text= text;
    }
    @Override
    public String toString(){
        return"Question\n"+ text;
    }
}
