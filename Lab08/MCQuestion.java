package Lab08;

public class MCQuestion extends Question{
    private  final String choiceA, choiceB, choiceC,choiceD;
    private  final String answer;
    public MCQuestion(String text, String choiceA,String choiceB, String choiceC, String choiceD, String answer){
        super(text);
        this.choiceA= choiceA;
        this.choiceB= choiceB;
        this.choiceC= choiceC;
        this.choiceD= choiceD;
        this.answer= answer;
    }
    @Override
    public String toString(){
        return super.toString()+"\n a. "+ choiceA+"\n b. "+ choiceB+"\n c. "+ choiceC+"\n d. "+choiceD+"\n answer: "+answer;
    }

}
