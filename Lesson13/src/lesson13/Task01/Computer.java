package lesson13.Task01;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Computer {
    //tuk vse oshte ne sme uchili za konstruktori

    //promenlivi
    short year;
    double price;
    boolean isNotebook;
    short hardDiskMemory;
    short freeMemory;
    String operationSystem;

    //change operating system
    public void changeOperationSystem(String newOperationSystem){
        operationSystem = newOperationSystem;
    }

    //izpolzvame pamet
    public void useMemory(short memory){
        if(memory > freeMemory){
            System.out.println("Not enough free memory!");
        }else{
            freeMemory -= memory;
        }
    }
}
