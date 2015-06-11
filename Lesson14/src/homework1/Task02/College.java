/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homework1.Task02;

/**
 *
 * @author Cvety
 */
public class College {
    public static void main(String[] argc){
        
        //add students
        Student s1 = new Student();
        s1.setSubject("Statistika");
        Student s2 = new Student("Ivan", "Statistika", 21);
        Student s3 = new Student("Gergana", "Sociologiq", 21);
        Student s4 = new Student("Penka", "Sociologiq", 19);
        Student s5 = new Student("Gosho", "Sociologiq", 20);
        Student s6 = new Student("Stoqn", "Statistika", 26);
        Student s7 = new Student("Petyr", "Statistika", 22);
        Student s8 = new Student("Mitko", "Statistika", 23);
        Student s9 = new Student("Dimitrichka", "Statistika", 33);
        Student s10 = new Student("Kalina", "Statistika", 19);

        //check year in college
        System.out.println(s10.getName() + " is " + s10.getYearInCollege() + " year in college");
        System.out.println("Is " + s10.getName() + " degree? : " + s10.isIsDegree());
        s10.upYear();
        System.out.println(s10.getName() + " is  " + s10.getYearInCollege() + " year in college");
        System.out.println("Is " + s10.getName() + " degree? : " + s10.isIsDegree());
        s10.upYear();
        System.out.println(s10.getName() + " is  " + s10.getYearInCollege() + " year in college");
        System.out.println("Is " + s10.getName() + " degree? : " + s10.isIsDegree());
        s10.upYear();
        System.out.println(s10.getName() + " is  " + s10.getYearInCollege() + " year in college");
        System.out.println("Is " + s10.getName() + " degree? : " + s10.isIsDegree());
        s10.upYear();
        System.out.println(s10.getName() + " is  " + s10.getYearInCollege() + " year in college");
        System.out.println("Is " + s10.getName() + " degree? : " + s10.isIsDegree());
        System.out.println();

        // for cool results
        s6.upYear();
        // for best students
        s5.setGrade(5);
        s8.setGrade(5.66);

        //2 approaches for money check
        double a = s9.receiveSchoolarship(5,200);
        System.out.println(s9.getName() + "'s money is " + a);
        s8.receiveSchoolarship(5,200);
        System.out.println(s8.getName() + "'s money is " + s8.getMoney());
        //probvame da dadem stipendiq na zavyrshil chovek
        s10.receiveSchoolarship(3,200);
        System.out.println(s10.getName() + "'s money is " + s10.getMoney());
        System.out.println();

        //group 1 --> with more than 5 students with the same subject
        StudentGroup sg1 = new StudentGroup("Statistika");
        
        //add students in group
        sg1.addStudent(s10);
        sg1.addStudent(s2);
        sg1.addStudent(s3);
        sg1.addStudent(s4);
        sg1.addStudent(s5);
        sg1.addStudent(s6);
        sg1.addStudent(s7);
        sg1.addStudent(s8);
        sg1.addStudent(s9);
        sg1.addStudent(s1);

        //print grouop 1
        sg1.printStudentsInGroup();

        //best student in group 1
        String best = sg1.theBestStudent();
        System.out.printf("Best student in group %s is %s :)\n", sg1.getGroupSubject(), best);
        System.out.println();

        //group 2 --> with less than 5 students with the same subject
        StudentGroup sg2 = new StudentGroup("Sociologiq");
        
        //add
        sg2.addStudent(s10);
        sg2.addStudent(s2);
        sg2.addStudent(s3);
        sg2.addStudent(s4);
        sg2.addStudent(s5);
        sg2.addStudent(s6);
        sg2.addStudent(s7);
        sg2.addStudent(s8);
        sg2.addStudent(s9);
        sg2.addStudent(s1);

        //print
        sg2.printStudentsInGroup();

        //best student
        best = sg2.theBestStudent();
        System.out.printf("Best student in group %s is %s :)\n", sg2.getGroupSubject(), best);

        sg2.emptyGroup();
        sg2.printStudentsInGroup();
    }

}
