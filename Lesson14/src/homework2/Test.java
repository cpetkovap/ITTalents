/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

/**
 *
 * @author Cvety
 */
public class Test {

    public static void main(String[] argc) {

        //task with invalid argument
        Task t1 = new Task(null, -1);
        //System.out.println(t1.toString());

        //task with invalid name
        Task t2 = new Task("ala09", 3);

        //valid task
        Task t3 = new Task("TaskInput", 20);

        Employee e1 = new Employee("Kristofyr");
        //set null task
        e1.setCurrentTask(null);
        //set invalid left hours
        e1.setHoursLeft(-3);
        //System.out.println(e1.getHoursLeft());



        e1.work();
        e1.showReport();

        System.out.println();


        e1.setCurrentTask(t2);
        e1.setHoursLeft(9);
        System.out.println("Before working : ");
        e1.showReport();
        e1.work();
        e1.showReport();
        System.out.println();

        e1.setCurrentTask(t3);
        System.out.println("Before working : ");
        e1.showReport();
        e1.work();
        e1.showReport();
        System.out.println();

        e1.setCurrentTask(t3);
        System.out.println("Before working : ");
        e1.showReport();
        e1.work();
        e1.showReport();
    }
}
