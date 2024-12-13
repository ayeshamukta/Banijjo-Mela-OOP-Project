package oop.banijjomelaoop.ayesha_2022861;

import java.io.Serializable;

public class AskQuestion implements Serializable {
    private String ques;

    public AskQuestion(String ques) {
        this.ques = ques;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }



    @Override
    public String toString() {
        return "Your Query :"   + ques + "\n";
    }
}
