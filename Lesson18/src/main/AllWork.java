/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Cvety
 */
public class AllWork {

    //variable
    private Task[] tasks;
    private int freePlacesForTasks;
    private int currentUnassignedTask;

    //konstruktor
    public AllWork() {
        freePlacesForTasks = 10;
        tasks = new Task[freePlacesForTasks];
        currentUnassignedTask = 0;
    }

    //add task ako ima svobodno mqsno i ako ne dobavqme prazna zadacha
    public void addTask(Task t) {
        if (freePlacesForTasks > 0 && t != null) {
            tasks[tasks.length - freePlacesForTasks] = t;
            freePlacesForTasks--;
        } else {
            System.out.println("You can not add more tasks !");
        }
    }

    //vzimame sledvashta zadacha ako ima takava, ako ne vryshtame null
    public Task getNextTask() {
        if (currentUnassignedTask < tasks.length) {
            Task result = tasks[currentUnassignedTask];
            currentUnassignedTask++;
            return result;
        } else {
            //System.out.println("No more tasks !!!!");
            return null;
        }

    }

    //is all work done
    public boolean isAllWorkDone() {
        boolean result = true;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null && tasks[i].getWorkingHours() != 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
