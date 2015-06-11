/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

/**
 *
 * @author Cvety
 */
public class Employee {

    private final String name; //име на работника
    private Task currentTask; //текущата задача в/у която работи работника
    private int hoursLeft; // колко работни часа остават на работника (за днес)

    public Employee(final String name) {
        if (name.matches("[A-Z][a-zA-Z]*")) {
            this.name = name;
        } else {
            this.name = "Eva";
        }
    }

    //getyri
    public Task getCurrentTask() {
        return currentTask;
    }

    public int getHoursLeft() {
        return hoursLeft;
    }

    public String getName() {
        return name;
    }

    //setyri
    public void setCurrentTask(Task currentTask) {
        if (currentTask != null) {
            this.currentTask = currentTask;
        } else {
            System.out.println("You can't set the null task");
            //this.currentTask = new Task("Task", 10);
        }
    }

    public void setHoursLeft(int hoursLeft) {
        if (hoursLeft >= 0 && hoursLeft <= 8) {
            this.hoursLeft = hoursLeft;
        } else {
            this.hoursLeft = 8;
        }
    }

    public void work() {
        if (currentTask != null && getHoursLeft() > 0) {
            System.out.println("Working ... ");
            if (hoursLeft > currentTask.getWorkingHours()) {
                setHoursLeft(hoursLeft - currentTask.getWorkingHours());
                currentTask.setWorkingHours(0);
            } else {
                currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursLeft);
                setHoursLeft(0);
            }
        } else {
            System.out.println("Employee " + this.name + " can not work! There is no current task or the employee has not a free hours .");
        }
    }

    public void showReport() {
        if (currentTask != null) {
            System.out.printf("Employee %s work at task %s \n", getName(), currentTask.getName());
            System.out.printf("Left employee hours: %d , left task hours: %d \n", getHoursLeft(), currentTask.getWorkingHours());

        } else {
            System.out.printf("Employee %s has not a task \n", getName());
            System.out.printf("Left employee hours: %d \n", getHoursLeft());
        }
    }
}
