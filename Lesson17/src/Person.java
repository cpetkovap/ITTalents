/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Person {

    //variable
    private final String name;
    private int age;
    private final boolean isMale;

    //konnstruktor
    public Person(final String name, int age, final boolean isMale) {
        this.name = name;
        setAge(age);
        this.isMale = isMale;
    }

    //set age
    protected void setAge(int age) {
        if(age > 0 && age <= 110){
            this.age = age;
        }else{
            this.age = 18;
        }
    }


    //getyri
    public int getAge() {
        return age;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public String getName() {
        return name;
    }

    //informaciq 
    public String showPersonInfo() {
        String gender;
        
        if(isMale)
            gender = "male";
        else
            gender = "female";

        return "name = " + getName() + " age = " + getAge() + " gender = " + gender;
    }





}
