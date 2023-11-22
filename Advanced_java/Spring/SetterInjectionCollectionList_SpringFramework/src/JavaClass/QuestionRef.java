/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClass;

import java.util.List;

/**
 *
 * @author tejswini
 */
public class QuestionRef {
    
    private int id;
    private String question;
    private List <AnswerRef> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<AnswerRef> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerRef> answers) {
        this.answers = answers;
    }
    
    
}
