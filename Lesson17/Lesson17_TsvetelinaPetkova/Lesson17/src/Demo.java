/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Demo {
    
    //otgovoryt na vyprosa e v otdelen tekstov fail :)

    public static void main(String[] argc) {

//        //predvaritelno testvane
//        Person a = new Person("Ivan", 12, true);
//        a.setAge(-3);
//        System.out.println(a.showPersonInfo());
//
//        //izobshto ne mojem da si syzdadem student pod 19 i nad 30 godini
//        Student sr = new Student("Daqna", 11, false, 3.5);
//        System.out.println(sr.showStudentInfo());
//        sr.setAge(60);
//        sr.setScore(6);
//        System.out.println(sr.showStudentInfo());
//
//        Employee em = new Employee("tihomir", 18, true, 0);
//        System.out.println(em.showEmployeeInfo());
//        em.setDaySalary(40);
//        System.out.println(em.showEmployeeInfo());
//        System.out.println(em.calculateOvertime(8));


        Person[] people = new Person[10];

        people[0] = new Person("Georgi", 21, true);
        people[1] = new Person("Stoqnka", 12, false);
        people[2] = new Student("Valeri", 19, true, 4);
        people[3] = new Student("Mihaela", 22, false, 5.20);
        people[4] = new Employee("Dimityr", 32, true, 80);
        people[5] = new Employee("Simona", 17, false, 10);


        
        //print info for all people
        for (Person p : people) {
            if (p != null) { //moje i bez tova
                if (p instanceof Student) {
                    Student helpStudent = (Student) p;
                    System.out.println(helpStudent.showStudentInfo());
                } else if (p instanceof Employee) {
                    Employee helpEmployee = (Employee) p;
                    System.out.println(helpEmployee.showEmployeeInfo());
                } else if (p instanceof Person) {
                    System.out.println(p.showPersonInfo());
                }
            }
        }

        System.out.println();


        //print salary for one day
        for (Person p : people) {
            if (p instanceof Employee) {
                Employee helpEmployee = (Employee) p;
                double overtiming = helpEmployee.calculateOvertime(2);
                if (helpEmployee.getAge() < 18) {
                    System.out.println(String.format("%s's under 18 year. Can't work! Salary = %s", helpEmployee.getName(), overtiming));
                } else {
                    System.out.println(String.format("%s's overtime salary is %.2f, daily salary is %.2f, all for day is %.2f",
                            helpEmployee.getName(), overtiming, helpEmployee.getDaySalary(), (overtiming + helpEmployee.getDaySalary())));
                }
            }
        }

    }
}
