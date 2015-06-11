/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Student extends Person{
    
    //variable
    private double score;

    //konstruktor
    public Student(String name, int age, boolean isMale, double score) {
        super(name, age, isMale);
        setScore(score);
    }

    //set score
    public void setScore(double score) {
        if(score >=2 && score <=6){
            this.score = score;
        }else{
            this.score = 3;
        }
    }
    //get score
    public double getScore() {
        return score;
    }


    //ogranichih godinite za studentite :)
    @Override
    public void setAge(int age) {
        if(age > 18 && age <= 30){
            super.setAge(age);
        }else{
            super.setAge(19);
        }
    }

    //student info
    public String showStudentInfo() {
        return super.showPersonInfo() + ", score = " + getScore() ;      
    }

}
