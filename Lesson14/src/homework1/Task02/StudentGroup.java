/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1.Task02;

/**
 *
 * @author Cvety
 */
public class StudentGroup {

    private String groupSubject;
    private Student[] students;
    private int freePlaces;
    private int countStudents = 0;

    public StudentGroup() {
        freePlaces = 5;
        students = new Student[freePlaces];
    }

    public StudentGroup(String groupSubject) {
        this();

        //bez ogranicheniq za imenata na specialnostite
        if (groupSubject != null) {
            this.groupSubject = groupSubject;
        } else {
            this.groupSubject = "Agrobiologiq";
        }
    }

    //dobavih si go kym uslovieto : dobavqme studenta v grupata ako ne e zavyrshil
    public void addStudent(Student a) {
        if (a != null && a.getSubject().equals(groupSubject) && freePlaces > 0 && a.isIsDegree() == false) {
            students[countStudents] = a;
            countStudents++;
            freePlaces--;
        }
    }

    public void emptyGroup() {
        freePlaces = 5;
        students = new Student[freePlaces];
    }

    //moje i da se dopishe da vryshta vsichki s nai visok rezultat
    public String theBestStudent() {
        double max = 2;
        String result = "";
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getGrade() > max) {
                max = students[i].getGrade();
                result = students[i].getName();
            }
        }
        return result;

    }

    public void printStudentsInGroup() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }

    }

    //getyri
    public int getCountStudents() {
        return countStudents;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public String getGroupSubject() {
        return groupSubject;
    }

    public Student[] getStudents() {
        return students;
    }
}
