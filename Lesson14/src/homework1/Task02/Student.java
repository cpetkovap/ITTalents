/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1.Task02;

/**
 *
 * @author Cvety
 */
public class Student {

    private String name;
    private String subject;
    private double grade;
    private int yearInCollege;
    private int age;
    private boolean isDegree;
    private double money;

    public Student() {
        grade = 4.0;
        yearInCollege = 1;
        isDegree = false;
        money = 0;
    }

    public Student(String name, String subject, int age) {
        this();

        //da kajem che nqmame ogranichenie za imenata, inache .matches
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Adam";
        }

        //bez ogranichenie i za imenata na specialnostta 
        //setSubject(subject);
        if (subject != null) {
            this.subject = subject;
        } else {
            this.subject = "Agrobiologiq";
        }

        //neka ne prechim i vyzrastnite hora da uchat :D
        if (age >= 18 && age <= 100) {
            this.age = age;
        } else {
            age = 18;
        }
    }

    //ako e zavyrshil prekysvame, inache mu ovelichavame godinite. i ako godinite stanat 4 go pravim zavyrshil
    public void upYear() {
        if (isDegree) {
            return;
        } else {
            yearInCollege++;
        }
        if (yearInCollege == 4) {
            isDegree = true;
        }

    }

    //dobavih si go kym uslovieto : davame stipendiq samo ako studenta ne e zavyrshil
    public double receiveSchoolarship(double min, double amount) {
        if (this.age < 30 && this.grade >= min && this.isDegree == false) {
            money += amount;
        }
        return money;
    }

    //getyri i setyri
    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public boolean isIsDegree() {
        return isDegree;
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearInCollege() {
        return yearInCollege;
    }

    public void setSubject(String subject) {
        if (subject != null) {
            this.subject = subject;
        } else {
            this.subject = "Agrobiologiq";
        }
    }

    public void setGrade(double grade) {
        if (grade >= 2 && grade <= 6) {
            this.grade = grade;
        } else {
            this.grade = 4;
        }
    }

    //toString
    @Override
    public String toString() {
        return "Student{" + "name = " + name + " subject = " + subject + " grade = " + grade + " yearInCollege = " + yearInCollege + " age = " + age + " isDegree = " + isDegree + " money = " + money + '}';
    }
}
