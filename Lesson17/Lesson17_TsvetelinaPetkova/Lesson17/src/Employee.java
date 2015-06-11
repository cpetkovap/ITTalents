/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Employee extends Person{

    //variable
    private double daySalary;

    //konstruktor
    public Employee(String name, int age, boolean isMale, double daySalary) {
        super(name, age, isMale);
        setDaySalary(daySalary);
    }


//    //set age -> ne otgovarq na uslovieto taka napisano
//    @Override
//    public void setAge(int age) {
//        if(age > 18 && age <= 80){
//            super.setAge(age);
//        }else{
//            super.setAge(18);
//        }
//    }


    //set salary
    public void setDaySalary(double daySalary) {
        if(daySalary >= 0 && getAge() >= 18){
            this.daySalary = daySalary;
        }else{
            this.daySalary = 0;
        }
    }

    //get salary
    public double getDaySalary() {
        return daySalary;
    }

    //overtime calculation
    public double calculateOvertime(double hours){
        if(hours >= 0 && hours <= 16){
            return daySalary / 8 * 1.5 * hours;
        }else{
            System.out.println("Invalid overtime");
            return 0;
        }
        
    }

    //show info
    public String showEmployeeInfo() {
        String result = String.format("%s", super.showPersonInfo());
        if(getAge() < 18){
            result += ". Under 18 years. Can't work ! No salary! ";
        }else{
            result += String.format(", daily salary without overtiming = %.2f", getDaySalary());
        }
        return result;
    }





}
